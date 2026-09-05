/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package bankAccount;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DELL
 */
public class bankAccount1Test {

    @Test
    public void testValidDeposit() {

        bankAccount1 account = new bankAccount1();

        account.deposit(500);

        assertEquals(500, account.getBalance(), 0.01);
    }

    @Test
    public void testValidWithdrawal() {

        bankAccount1 account = new bankAccount1();

        account.deposit(500);
        account.withdraw(200);

        assertEquals(300, account.getBalance(), 0.01);
    }

    @Test
    public void testOverdraft() {

        bankAccount1 account = new bankAccount1();

        account.deposit(500);

        assertThrows(IllegalStateException.class, () -> {
            account.withdraw(1000);
        });
    }

    @Test
    public void testNegativeDeposit() {

        bankAccount1 account = new bankAccount1();

        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-200);
        });
    }

    @Test
    public void testAccountBecomesInactive() {

        bankAccount1 account = new bankAccount1();

        account.deposit(500);
        account.withdraw(450);

        assertFalse(account.isActive());
    }

    @Test
    public void testAccountRemainsActive() {

        bankAccount1 account = new bankAccount1();

        account.deposit(500);
        account.withdraw(200);

        assertTrue(account.isActive());
    }
}