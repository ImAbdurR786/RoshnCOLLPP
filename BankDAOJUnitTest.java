import com.cg.collection.pp.bean.Customer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BankDAOJUnitTest {

    Customer cust, cust1;

    @Before
    public void BeforeAllMethod() {
        cust = new Customer("Abdur", "8376941801", 123, 1000);
        cust1 = new Customer("Rahman", "9876543567", 321, 2000);
    }

    @Test
    public void TestShowBalance() {
        int actualBalance = cust.getBalance();
        int expectedBalance = 1000;
        assertEquals(actualBalance, expectedBalance);
    }

    @Test
    public void TestDeposit() {
        cust.setBalance(cust.getBalance() + 100);
        int actualBalance = cust.getBalance();
        int expectedBalance = 1100;
        assertEquals(actualBalance, expectedBalance);
    }

    @Test
    public void TestWithdraw() {
        cust.setBalance(cust.getBalance() - 100);
        int actualBalance = cust.getBalance();
        int expectedBalance = 900;
        assertEquals(actualBalance, expectedBalance);
    }

    @Test
    public void TestFundTransfer() {
        cust.setBalance(cust.getBalance() - 100);
        cust1.setBalance(cust1.getBalance() + 100);
        int actualBalance = cust1.getBalance();
        int expectedBalance = 2100;
        assertEquals(actualBalance, expectedBalance);
    }
}
