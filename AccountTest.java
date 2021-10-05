import java.util.Scanner;

//Used to execute account class bc it has main method
public class AccountTest{ 
    public static void main(String[] args){
       Account_withdraw account_a = new Account_withdraw("Jane", 50);
       System.out.println("Enter withdrawal amount: ");
       Scanner input = new Scanner(System.in);
       double amount = input.nextDouble();
       account_a.withdraw(amount);
       System.out.printf("%s balance is %.2f", account_a.getName(), account_a.getBalance());

        


      }
    }

        


        
