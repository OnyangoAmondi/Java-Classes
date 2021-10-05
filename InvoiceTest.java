import java.util.Scanner;

public class InvoiceTest{
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice ("2N222A", "NPN", -5, -9);
        System.out.printf("%s, %s ,  %d in number price per item is , is %.2f and total is %.2f%n",invoice1.getpart_Number(), invoice1.getpart_Description(), invoice1.get_quantity(), invoice1.get_price_per_item(), invoice1.getInvoiceAmount());

        System.out.println("Enter quantity: ");
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        set_quantity(amount);
        

        System.out.printf("%s, %s ,  %d in number price per item is , is %.2f and total is %.2f",invoice1.getpart_Number(), invoice1.getpart_Description(), invoice1.get_quantity(), invoice1.get_price_per_item(), invoice1.getInvoiceAmount());

        

        



    }
}