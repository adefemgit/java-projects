package WK3;

public class Management {


    private int id;
    private String name;
    private double marks;


    public Management(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;

    }

    public boolean isPassing() {
        return marks > 50;

    }

    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

    }

    public static void main(String[] args) {
        Management[] Students = new Management[3];

        Students[0] = new Management(4310, "bob", 50.5);
        Students[1] = new Management(4311, "lyon", 60.0);
        Students[2] = new Management(4312, "crawford", 20.5);


        int passingCount = 0;

        for (Management student : Students) {
            if (student.isPassing()) {
                passingCount++;
            }
            System.out.println("Number of passing students: " + passingCount);
        }

    }
}
