package testng;

import com.fall23.bankApp.MBank;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankAppTest {

    @Test(description = "Check the getBalance method")
    void getBalanceTest() throws Exception {
        MBank johnAcc = new MBank(1234567899);
        Assert.assertEquals(johnAcc.getBalance(), 1000);

        johnAcc.deposit(5000);
        Assert.assertEquals(johnAcc.getBalance(), 6000);

        johnAcc.withDraw(6000);
        Assert.assertEquals(johnAcc.getBalance(), 0);

        johnAcc.withDraw(1000);
        Assert.assertEquals(johnAcc.getBalance(), 0);
        System.out.println(johnAcc.getBalance());
        Assert.assertTrue(johnAcc.getBalance() == 0);


    }



}
