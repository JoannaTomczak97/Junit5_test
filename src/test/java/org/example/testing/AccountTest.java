package org.example.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    
    @Test
    public void newAccountShouldNotBeActiveAfterCreation() {
        Account newAccount = new Account();
        assertFalse(newAccount.isActive(), "Check if new account is not active");
    }

    @Test
    public void accountShouldBeActiveAfterActivation(){
        Account newAccount = new Account();
        newAccount.activate();
        assertTrue(newAccount.isActive());
    }

}
