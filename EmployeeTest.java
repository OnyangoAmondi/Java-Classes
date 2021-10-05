public class EmployeeTest{
    public static void main(String[] args){
        Employee one = new Employee("Jane", "Nyakio", 30_000);
        System.out.printf("%s %s yearly salary is %.2f%n", one.getfirstName(), one.getlastName(), one.get_salary()*12);

        Employee two = new Employee("John", "Smith", 50_000);
        System.out.printf("%s %s yearly salary is %.2f%n", two.getfirstName(), two.getlastName(), two.get_salary()*12);

        System.out.printf("Salary one after increase %.2f%n", one.get_salary()*1.1*12);
        System.out.printf("Salary two after increase %.2f%n", two.get_salary()*1.1*12);
    }
}