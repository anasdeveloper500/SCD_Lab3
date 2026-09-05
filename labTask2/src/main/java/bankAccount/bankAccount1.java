/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankAccount;

/**
 *
 * @author DELL
 */
public class bankAccount1 {

    private double balance;
    private boolean active = true;

    public void deposit(double amt) {
        if (amt < 0) {
            throw new IllegalArgumentException("Negative deposit is not allowed");
        }

        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt < 0) {
            throw new IllegalArgumentException("Negative withdrawal is not allowed");
        }

        if (amt > balance) {
            throw new IllegalStateException("Insufficient balance");
        }

        balance -= amt;

        if (balance < 100) {
            active = false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }
}
