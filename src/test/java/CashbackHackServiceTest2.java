import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest2 extends TestCase {
    @Test
    public void testRemain() {
        int amount = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        Assert (expected,actual);
    }
    @Test
    public void testRemain2() {
        int amount = 990;
        int expected = 10;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        Assert (expected,actual);
    }
    @Test
    public void testRemain3() {
        int amount = 1000;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        Assert (expected,actual);
    }
}
