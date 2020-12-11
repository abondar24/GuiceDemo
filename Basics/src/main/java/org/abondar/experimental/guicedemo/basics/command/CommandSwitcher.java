package org.abondar.experimental.guicedemo.basics.command;


import org.abondar.experimental.guicedemo.basics.concert.ConcertCommand;
import org.abondar.experimental.guicedemo.basics.customscope.command.CustomScopeCommand;
import org.abondar.experimental.guicedemo.basics.fortune.command.FortuneCommand;
import org.abondar.experimental.guicedemo.basics.gum.GumCommand;
import org.abondar.experimental.guicedemo.basics.generictype.GenericTypeCommand;
import org.abondar.experimental.guicedemo.basics.jmx.command.JmxCommand;
import org.abondar.experimental.guicedemo.basics.properties.PropertiesCommand;
import org.abondar.experimental.guicedemo.basics.staticinject.StaticInjectionCommand;

public class CommandSwitcher {

    private final CommandExecutor executor;

    public CommandSwitcher() {
        this.executor = new CommandExecutor();
    }


    public void executeCommand(String cmd){
        try {
            switch (Commands.valueOf(cmd)){

                case CC:
                    ConcertCommand cc = new ConcertCommand();
                    executor.executeCommand(cc);
                    break;

                case CSC:
                    CustomScopeCommand csc = new CustomScopeCommand();
                    executor.executeCommand(csc);
                    break;

                case FC:
                    FortuneCommand fc = new FortuneCommand();
                    executor.executeCommand(fc);
                    break;

                case GC:
                    GumCommand gc = new GumCommand();
                    executor.executeCommand(gc);
                    break;

                case GTC:
                    GenericTypeCommand gtc = new GenericTypeCommand();
                    executor.executeCommand(gtc);
                    break;

                case JMX:
                    JmxCommand jmx = new JmxCommand();
                    executor.executeCommand(jmx);
                    break;

                case PC:
                    PropertiesCommand pc = new PropertiesCommand();
                    executor.executeCommand(pc);
                    break;

                case SIC:
                    StaticInjectionCommand sic = new StaticInjectionCommand();
                    executor.executeCommand(sic);
                    break;
            }

        } catch (IllegalArgumentException ex){
            System.out.println("Check documentation for command list");
            System.exit(1);
        }

    }
}
