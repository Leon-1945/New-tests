import org.junit.Test;
import junit.framework.TestCase;
import org.junit.Assert;



public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        int amount = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        (expected,actual);
    }
    @Test
    public void testRemain2() {
        int amount = 990;
        int expected = 10;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assert(expected,actual);
    }
    @Test
    public void testRemain3() {
        int amount = 1000;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assert expected,actual);
    }
}
