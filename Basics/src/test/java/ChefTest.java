import org.abondar.experimental.guicedemo.basics.fortune.Chef;
import org.abondar.experimental.guicedemo.basics.fortune.FortuneService;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by alexabon on 2/6/2017.
 */
public class ChefTest {

    @Test
    public void makeFortunateCookie(){
       FortuneServiceMock mock = new FortuneServiceMock();
       Chef chef = new Chef(mock);
       chef.makeFortuneCookie();
       assertTrue(mock.calledOnce());
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
