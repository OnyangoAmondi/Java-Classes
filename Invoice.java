public class Invoice{
    private String part_Number;
    private String part_Description;
    private int quantity;
    private double price_per_item;

    public Invoice(String part_Number, String part_Description, int quantity, double price_per_item){
        this.part_Number = part_Number;
        this.part_Description = part_Description;

        if(quantity > 0){
        this.quantity = quantity;
        }

        if(price_per_item > 0){
        this.price_per_item = price_per_item;
        }
    }

    public void setpart_Number(String identifier){
        this.part_Number = identifier;
    }


    public String getpart_Number(){
        return part_Number;
    }

    public void setpart_Description(String item){
        this.part_Number = item;
    }

    public String getpart_Description(){
        return part_Description;
    }


    public void set_quantity(int number){
        if(number > 0){
            quantity = number;
        } else {
            System.out.println("Quantity must be a positive value");
        }
    }

    public int get_quantity(){
        return quantity;
    }

    public void set_price_per_item(int amount){
        if(amount > 0.0){
            price_per_item = amount;
        } else {
            System.out.println("Price must be a positive value");
        }
    }

    public double get_price_per_item(){
        return price_per_item;
    }

    public double getInvoiceAmount(){
        double total;
        total = quantity * price_per_item;
        return total;

    }

    
}