package com.nopcommerce.testsuite;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.pages.Computer;
import com.nopcommerce.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class ComputerTest extends BaseTest {
    Computer computer;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        computer = new Computer();
    }


    @Test(groups = {"sanity", "regression"})
    public void verifyProductArrangeInAlphaBaticalOrder() {
        computer.clickOnComputer();
        computer.clickOnDesktop();
        computer.sortProductZToA();

    }
}
