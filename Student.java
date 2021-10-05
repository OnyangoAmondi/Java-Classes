public class Student{
    //Instance variables
    private String name;
    private double average;

    //Constructor
     public Student(String name, double average){
        this.name = name;

        if(average > 0 && average <= 100){
            this.average = average;
        }
    }

    //Methods
    //set name
    public void setName(String name){
        this.name = name;
    }
    //get name
    public String getName(){
        return name;
    }

    //set average
    public void setAverage(double average){
        if(average > 0 && average <= 100){
            this.average = average;
        }
    }
    //get average
    public double getAverage(){
        return average;
    }
    }
