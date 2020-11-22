package org.abondar.experimental.guicedemo.web;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by alexabon on 2/7/2017.
 */
@WebServlet(urlPatterns = "/*", name = "helloServlet")
public class HelloServlet extends HttpServlet {

    @Inject
    @Named("app.name")
    private String appName;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ServletContext servletContext = config.getServletContext();
        Injector injector = (Injector) servletContext.getAttribute(GuiceServletContextListener.KEY);
        injector.injectMembers(this);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.printf("<h1>Welcome to the %s application!</h1>%n", appName);
        resp.setStatus(HttpServletResponse.SC_OK);
    }
}
