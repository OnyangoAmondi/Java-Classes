import java.util.Scanner;

public class StudentTest{
    public static void main(String[] args){
        Student one = new Student("Jane", 60);
        String name_one;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        name_one = input1.nextLine();
        one.setName(name_one);
        double score;
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Student Average: ");
        
        score = input2.nextDouble();
        one.setAverage(score);
        System.out.printf("%s scored %.2f", one.getName(), one.getAverage());
        

    }
}