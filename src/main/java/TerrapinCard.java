public class TerrapinCard {
    private double balance;

    public TerrapinCard(double balanceAtStart){
        this.balance = balanceAtStart;
    }

    //methods
    public double getBalance(){
        return this.balance;
    }

    public String payEconomical(){
        if(this.balance >= 2.50){
            this.balance -= 2.50;
            return "Your remaining balance is " + this.balance;
        }else{
            return "Sorry, you don't have the funds!";
        }
    }

    // public void payEconomical(){
    //     if(this.balance >= 2.50){
    //       this.balance -= 2.50;
    //       System.out.println("Your remaining balance is: " + this.balance);
    //     }else{
    //       System.out.println("Sorry, you don't have the funds!");
    //     }
    // }

    public String payGourmet(){
        if(this.balance >= 4.00){
            this.balance -= 4.00;
            return "Your remaining balance is: " + this.balance;
        }else{
            return "Sorry, you don't have the funds!";
        }
    }

    // public void payGourmet(){
    //     if(this.balance >= 4.00){
    //       this.balance -= 4.00;
    //       System.out.println("Your remaining balance is: " + this.balance);
    //     }else{
    //       System.out.println("Sorry, you don't have the funds!");
    //     }

    // }

    public void loadMoney(double amount){
        if(amount < 0){
            this.balance = this.balance;
        }else if((this.balance + amount) > 150){
            this.balance = 150;
        }else{
            this.balance += amount;
        }

    }

    @Override
    public String toString(){
        return "The card has " + this.balance + " dollars";
    }


}