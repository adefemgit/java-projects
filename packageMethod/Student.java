package packageMethod;

public class Student {

    String name;
    String  studentID;
    double average ;

    public Student(String name, String studentID){

        this.name = name;
        this.studentID = studentID;
        this.average = 0.0;

    }
    public double calculateAverage(double [] grades){

        double sum = 0;

        for (int i = 0; i<grades.length; i++){
            sum += grades[i];
        }

        return sum / grades.length;

    }
    public void displayStudentDetails(){
        System.out.println("Student name:    " + name);
        System.out.println("Student I.D:     " + studentID);
        System.out.println("Student grades:  " + average);

    }
    public static void main(String [] args){

        Student obj = new Student("John", "S232341");

        double [] grades = {10.0, 21.8, 22.0, 41,2};
        obj.displayStudentDetails();
        obj.calculateAverage(grades);

    }
}
