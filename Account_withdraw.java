//Class will not execute bc it has no main method
public class Account_withdraw{
    private String name; // Instance variable
    private double balance;

    //Constructor that can initialize the instance
    public Account_withdraw(String name, double balance){  //constructor has no return type not even void
        this.name = name;

        if( balance > 0.0){
            this.balance = balance;
        } 
    }

    //These methods are used when you don't want to work with values initialized by constructor

//Method that sets name
    public void setName(String name){ //this method has no return type bc all it does is asign name to name variable
        this.name = name;  //this overrides instance variable
    }

    //Method that returns name

    public String getName(){ //this method must have a return type bc it displays the users name when called
        return name;
    }

    //Method that adds deposit to balance
    public void deposit(double depositAmount){
        if(depositAmount > 0.0){
            balance = balance + depositAmount;
        }

    }

    //Method that outputs balance

    public double getBalance(){
        return balance;
    }

    public double withdraw(double amount){
        if(amount <= balance){
            this.balance = balance - amount;
        } else {
            System.out.println("Withdrawal amount exceeds balance");
        }
        return balance;

        
    }
}