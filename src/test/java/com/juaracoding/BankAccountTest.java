package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BankAccountTest {
    @Test

    public void SetAccountTest(){
        BankAccount bankAccount = new BankAccount();
        Assert.assertEquals(bankAccount.deposit(1000,100),1100);

    }

    @Test
    public void StringTest(){
        BankAccount bankAccount = new BankAccount();
        Assert.assertEquals(bankAccount.setAccount("Adam"),"Adam");

    }

    @Test
    public void WitdrawTest(){
        BankAccount bankAccount = new BankAccount();
        double draw = bankAccount.withdraw(100,10);
        Assert.assertEquals(draw, 10);

    }

    @Test
    public void CheckBallaceTest(){
        BankAccount bankAccount = new BankAccount();

        Assert.assertEquals(bankAccount.checkBalance(100),100);

    }

    @Test void DisplayTest() {
        BankAccount bankAccount = new BankAccount();
        Assert.assertEquals(bankAccount.display(10),10);
    }
}
