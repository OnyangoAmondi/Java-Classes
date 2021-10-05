import java.util.Scanner;

//Used to execute account class bc it has main method
public class AccountTest2{ 
    public static void main(String[] args){
        Account account_a = new Account("Jane Green", 50);
        Account account_b = new Account("John Ian", -7.53);
        displayAccount(account_a);
        displayAccount(account_b);
        System.out.println("Enter deposit amount for account 1: ");
        Scanner input1 = new Scanner(System.in);
        double amount1 = input1.nextDouble();
        account_a.deposit(amount1);
        displayAccount(account_a);
        displayAccount(account_b);
        System.out.println("Enter deposit amount for account 2: ");
        Scanner input2 = new Scanner(System.in);
        double amount2 = input2.nextDouble();
        account_b.deposit(amount2);
        displayAccount(account_a);
        displayAccount(account_b);

    }

        public static void displayAccount(Account accountToDisplay) {


         System.out.printf("%s balance is %.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
           
    
    }
 }

