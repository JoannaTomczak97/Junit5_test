package org.example.testing;

import org.junit.jupiter.api.Test;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    
    @Test
    public void newAccountShouldNotBeActiveAfterCreation() {
        Account newAccount = new Account();
        assertFalse(newAccount.isActive(), "Check if new account is not active");
        //wartosc wlasciwa/actual, metoda matechrowa
        assertThat(newAccount.isActive(), equalTo(false));

    }

    @Test
    public void accountShouldBeActiveAfterActivation(){
        Account newAccount = new Account();
        newAccount.activate();
        //assertThat(newAccount.isActive(), isFalse());
        assertTrue(newAccount.isActive());
        assertThat(newAccount.isActive(), equalTo(true));
    }

    @Test
    public void newlyCretedAcciuntShouldNotHaveDefaultDeliveryAddressSet(){
        Account account = new Account();
        Address address = account.getDeefultDeliveryAddress();
        assertNull(address);
        assertThat(address, nullValue());
    }

    @Test
    public void defoultDeliveryAddressShouldNotBeNullAfterBeingSet(){
        Address address = new Address("Kopernika", "12");
        Account account = new Account();
        account.setDeefultDeliveryAddress(address);

        Address defultAddres = account.getDeefultDeliveryAddress();

        assertNotNull(defultAddres);
        assertThat(defultAddres, notNullValue());
    }
}
