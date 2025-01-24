package WK3;

public class student {

    String name;
    int rollNumber;
    int grade;

     void displayDetails(){
        System.out.println("Student name = " + name + "\n student roll number = " + rollNumber + "\n Student grade = " + grade);
    }




    public static void main(String [] args){
        student student1 = new student();
        student1.name = "kosovo";
        student1.rollNumber = 100;
        student1.grade = 20;
        student1.displayDetails();
    }
}
