public class Employee{
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }

    public String getfirstName(){
        return firstName;
    }

    public void setlastName(String lastName){
        this.lastName = lasttName;
    }

    public String getlastName(){
        return lastName;
    }

    public void set_salary(double salary){
        if(salary > 0){
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive");
        }
    }

    public double get_salary(){
        return salary;
    }
}