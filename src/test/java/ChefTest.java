import org.abondat.experimental.guicedemo.chef.Chef;
import org.abondat.experimental.guicedemo.chef.FortuneService;
import org.abondat.experimental.guicedemo.chef.FortuneServiceFactory;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by alexabon on 2/6/2017.
 */
public class ChefTest {

    @Test
    public void makeFortunateCookie(){
        final FortuneService orig = FortuneServiceFactory.getFortuneService();
        try {
            FortuneServiceMock mock = new FortuneServiceMock();
            FortuneServiceFactory.setFortuneService(mock);
            Chef chef = new Chef();
            chef.makeFortuneCookie();
            assertTrue(mock.calledOnce());
        } finally {
            FortuneServiceFactory.setFortuneService(orig);
        }
    }

    public class FortuneServiceMock implements FortuneService {

        private int invocationCount;

        @Override
        public String randomFortune() {
            invocationCount++;
            return "MOCK";
        }

        public boolean calledOnce(){
            return invocationCount ==1;
        }
    }
}
