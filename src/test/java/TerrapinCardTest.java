import org.junit.Test;

import static org.junit.Assert.*;

//import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class TerrapinCardTest {

    @Test
    public void getBalance() {
        TerrapinCard billy = new TerrapinCard(12);
        assertEquals(billy.getBalance(), 12.0, 0.001);
    }

    @Test
    public void payEconomical() {
        TerrapinCard billy = new TerrapinCard(10);
        billy.payEconomical();
        billy.payEconomical();
        assertEquals(billy.getBalance(), 5.0, 0.001);
    }

    @Test
    public void payEconomicalNonNegative() {
        TerrapinCard billy = new TerrapinCard(1);
        billy.payEconomical();
        assertEquals(billy.getBalance(), 1.0, 0.001);
    }



    @Test
    public void payGourmet() {
        TerrapinCard billy = new TerrapinCard(10);
        billy.payEconomical();
        billy.payGourmet();
        assertEquals(billy.getBalance(), 3.5, 0.001);
    }

    @Test
    public void payGourmetNonNegative() {
        TerrapinCard billy = new TerrapinCard(7.99);
        billy.payGourmet();
        billy.payGourmet();
        assertEquals(billy.getBalance(), 3.99, 0.001);
    }

    @Test
    public void loadMoney() {
        TerrapinCard billy = new TerrapinCard(20);
        billy.payEconomical();
        billy.payGourmet();
        billy.loadMoney(30);
        assertEquals(billy.getBalance(), 43.5, 0.001);
    }

    @Test
    public void loadMoneyMax() {
        TerrapinCard billy = new TerrapinCard(100);
        billy.loadMoney(100);
        assertEquals(billy.getBalance(), 150.0, 0.001);
    }

    @Test
    public void toStringTest() {
        TerrapinCard billy = new TerrapinCard(100);
        billy.loadMoney(20);
        assertEquals(billy.toString(), "The card has " + billy.getBalance() + " dollars");
    }



}