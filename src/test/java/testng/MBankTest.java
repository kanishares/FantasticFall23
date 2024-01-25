package testng;

import com.fall23.bankApp.Bank;
import com.fall23.bankApp.BankBase;
import com.fall23.bankApp.MBank;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MBankTest {

    @Test(description = "Check MBank deposit method")
    void deposit() throws Exception {
        MBank kaniAcc = new MBank(1235698742);
        kaniAcc.deposit(5000);
        Assert.assertEquals(kaniAcc.getBalance(),6000);

    }
    @Test(description = "Check MBank withdraw method")
    void withdraw() throws Exception {
        MBank sanchoAcc = new MBank(1457896325);
        sanchoAcc.withDraw(500);
        Assert.assertEquals(sanchoAcc.getBalance(), 500);
    }

    @Test(description = "Check transferFunds method")
    void transferFunds() throws Exception {
        MBank sender = new MBank();
        MBank recipient = new MBank();

        sender.deposit(1000);
        Bank.transferFunds(sender,recipient,500);

        Assert.assertEquals(sender.getBalance(), 1500);
        Assert.assertEquals(recipient.getBalance(), 1500);

    }
}
