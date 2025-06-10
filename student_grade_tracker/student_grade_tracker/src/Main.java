import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        GradeTracker tracker = new GradeTracker();


        Student stu1 = new Student("isaac ", "SOO1");
        Student stu2 = new Student("John ", "SOO2");
        Student stu3 = new Student("Mary ", "SOO3");
        Student stu4 = new Student("John ", "SOO4");


        tracker.addStudentsGrades(stu1, Arrays.asList(23.3, 45.7, 72.5));
        tracker.addStudentsGrades(stu2, Arrays.asList(33.3, 55.2, 32.8));
        tracker.addStudentsGrades(stu3, Arrays.asList(63.3, 85.2, 72.8));
        tracker.addStudentsGrades(stu4, Arrays.asList(73.3, 75.2, 42.8));


        System.out.println("Student Average");
        for (Student students : tracker.getAllStudents()){
            System.out.printf("%s average grade = %.2f%n", students.getId(), tracker.getGrades(students));

    }


        Student topStudent = tracker.getTopStudent();
        if(topStudent != null ){
            System.out.println(topStudent);
        }
        else{
            System.out.println("No student found");
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student id : ");
        String id = scanner.nextLine().trim();
        Student queryStudent = new Student("", id);
        double average = tracker.getGrades(queryStudent);
        if(average > 0){
            System.out.printf("Average grade for student ID %s: %.2f%n", id, average);
        }
        else {
            System.out.println("Student not found or no grades available.");
        }

        scanner.close();
    }
}