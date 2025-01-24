package WK3;

public class Employee {
    int employeeId;
    String name;
    String designation;
    double salary;



    void giveRaise(double percentage){
        salary += salary * (percentage / 100);
        System.out.println("the new salary for ths client = " + salary);

    }
    void displayDetails(){
        System.out.println("Employee details");
        System.out.println("Employee name = " +  name);
        System.out.println("Employee designation = " + designation);
        System.out.println("Employee id = " + employeeId);
        System.out.println("employee salary = " + salary);
    }
}
