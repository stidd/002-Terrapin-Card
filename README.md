# 002-Terrapin-Card

The University of Maryland students use a so-called Terrapin card to pay for their meals in student cafeterias. In this assignment, we implement the class TerrapinCard that simulates the Terrapin card.

Class Skeleton

Start by adding the class TerrapinCard to your project.

Then implement the TerrapinCard constructor that gets the starting balance of the card as parameter. The card saves the balance in the object variable balance. Implement also the toString method that returns a string of the form "The card has X dollars".

The skeleton of class TerrapinCard looks like this:

public class TerrapinCard{

  private ___ balance;

  public TerrapinCard(double ____) {
    // write code here
  }

  ___ ___ toString() {
    // write code here
  }
}

The following main program can be used to test the program:

public class CardRunner {
  public static void main(String args[]){
  TerrapinCard card = new TerrapinCard(50);
  System.out.println(card);
  } 
}

The output should be:

The card has 50.0 dollars

Paying with card

Implement the following methods to TerrapinCard

public void payEconomical() {
  // write code here
}

public void payGourmet() {
  // write code here
}

Method payEconomical should decrease the balance by 2.50 dollars and method payGourmet by 4.00 dollars.

The following main program can be used to test the program:

public class CardRunner {
    public static void main(String args[]){
    TerrapinCard card = new TerrapinCard(50);
    System.out.println(card);

    card.payEconomical();
    System.out.println(card);

    card.payGourmet();
    card.payEconomical();
    System.out.println(card);
  }
}

The output should be:

The card has 50.0 dollars
The card has 47.5 dollars
The card has 41.0 dollars

Balance nonnegative

Change methods 'payEconomical' and 'payGourmet' so that if there is not enough money, the balance does not change.

The following main program can be used to test the program:

public class CardRunner {
    public static void main(String args[]){
      TerrapinCard card = new TerrapinCard (5);
      System.out.println(card);

      card.payGourmet();
      System.out.println(card);

      card.payGourmet();
      System.out.println(card);
    }

}

The output should be:

The card has 5.0 dollars
The card has 1.0 dollars
The card has 1.0 dollars

Loading money to card

Add the TerrapinCard the following method:

public void loadMoney(double amount) {
  write code here
}

The method should increase the balance of the card by the given amount. However, the maximum balance on a card is 150 dollars. In case the balance after loading money would be more than that, it should be truncated to 150 dollars.

The following main program can be used to test the program:

public class CardRunner {
    public static void main(String args[]){
          TerrapinCard card = new TerrapinCard (10);
          System.out.println(card);

          card.loadMoney(15);
          System.out.println(card);

          card.loadMoney(10);
          System.out.println(card);

          card.loadMoney(200);
          System.out.println(card);
    }
}

The output should be:

The card has 10.0 dollars
The card has 25.0 dollars
The card has 35.0 dollars
The card has 150.0 dollars

Loading a negative amount

Change the method loadMoney so that the balance of the card does not change if the amount to load is negative.

The following main program can be used to test the program:

public class CardRunner {
    public static void main(String args[]){
      TerrapinCard card = new TerrapinCard (10);
      System.out.println("Billy: " + card);
      card.loadMoney(-15);
      System.out.println("Billy: " + card);
    }
}

The output should be:

Billy: The card has 10.0 dollars
Billy: The card has 10.0 dollars

Multiple cards

Write a CardRunner method that does the following:

    Creates a TerrapinCard for Billy with initial balance of 20 dollars
    Creates a TerrapinCard for Brian with initial balance of 30 dollars
    Billy buys gourmet lunch
    Brian buys economical lunch
    cards are printed (both on their own row, starting with the name of the card owner)
    Billy loads 20 dollars
    Brian buys gourmet lunch
    cards are printed (both on their own row, starting with the name of the card owner)
    Billy buys economical lunch
    Billy buys economical lunch
    Brian loads 50 dollars
    cards are printed (both on their own row, starting with the name of the card owner)


The main skeleton is as follows:

public class CardRunner {
    public static void main(String[] args) {
      TerrapinCard cardBilly= new TerrapinCard (20);
      TerrapinCard cardBrian = new TerrapinCard (30);

        // write code here
        // write code here
    }
}

The output should be:

Billy: The card has 16.0 dollars
Brian: The card has 27.5 dollars
Billy: The card has 36.0 dollars
Brian: The card has 23.5 dollars
Billy: The card has 31.0 dollars
Brian: The card has 73.5 dollars
