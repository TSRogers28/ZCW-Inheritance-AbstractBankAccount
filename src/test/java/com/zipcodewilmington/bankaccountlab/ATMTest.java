package com.zipcodewilmington.bankaccountlab;

import junit.extensions.TestSetup;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ATMTest {

    ATM atm;
    @Before
    public void setup(){
        atm = new ATM();
    }


    @Test
    public void getSavings() {
        int expected = 80000;

        int actual = atm.getSavings();

        assertEquals(expected, actual);
    }

    @Test
    public void setSavings() {
        atm.setSavings(10000);

        int expected = 70000;
        int actual = atm.getSavings();

        assertEquals(expected, actual);
    }

    @Test
    public void getBusiness() {
        int expected = 100000;

        int actual = atm.getBusiness();

        assertEquals(expected, actual);
    }

    @Test
    public void setBusiness() {
        atm.setBusiness(30000);

        int expected = 70000;

        int actual = atm.getBusiness();

        assertEquals(expected, actual);
    }

    @Test
    public void getChecking() {
        int expected = 10000;

        int actual = atm.getChecking();

        assertEquals(expected, actual);
    }

    @Test
    public void setChecking() {
        atm.setChecking(2000);

        int expected = 8000;

        int actual = atm.getChecking();

        assertEquals(expected, actual);
    }
}