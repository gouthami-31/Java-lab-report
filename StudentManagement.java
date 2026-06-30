import java.util.Scanner;

class Student {
    int roll;
    String name;
    double marks;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
    }

    void display() {
        System.out.println("\nStudent Details");
        System.out.println("Roll Number: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        Student s = new Student();

        s.input();
        s.display();
    }
}
