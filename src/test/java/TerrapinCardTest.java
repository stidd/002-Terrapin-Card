//import org.junit.Test;
//
//import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TerrapinCardTest {

    @Test
    void getBalance() {
        TerrapinCard billy = new TerrapinCard(12);
        assertEquals(billy.getBalance(), 12.0);
    }

    @Test
    void payEconomical() {
        TerrapinCard billy = new TerrapinCard(10);
        billy.payEconomical();
        billy.payEconomical();
        assertEquals(billy.getBalance(), 5.0);
    }

    @Test
    void payEconomicalNonNegative() {
        TerrapinCard billy = new TerrapinCard(1);
        billy.payEconomical();
        assertEquals(billy.getBalance(), 1.0);
    }



    @Test
    void payGourmet() {
        TerrapinCard billy = new TerrapinCard(10);
        billy.payEconomical();
        billy.payGourmet();
        assertEquals(billy.getBalance(), 3.5);
    }

    @Test
    void payGourmetNonNegative() {
        TerrapinCard billy = new TerrapinCard(7.99);
        billy.payGourmet();
        billy.payGourmet();
        assertEquals(billy.getBalance(), 3.99);
    }

    @Test
    void loadMoney() {
        TerrapinCard billy = new TerrapinCard(20);
        billy.payEconomical();
        billy.payGourmet();
        billy.loadMoney(30);
        assertEquals(billy.getBalance(), 43.5);
    }

    @Test
    void loadMoneyMax() {
        TerrapinCard billy = new TerrapinCard(100);
        billy.loadMoney(100);
        assertEquals(billy.getBalance(), 150.0);
    }

    @Test
    void toStringTest() {
        TerrapinCard billy = new TerrapinCard(100);
        billy.loadMoney(20);
        assertEquals(billy.toString(), "The card has " + billy.getBalance() + " dollars");
    }



}