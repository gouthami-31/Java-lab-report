class Student {
    int id;
    String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display details
    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}

public class ReturnObject {

    // Method returning a Student object
    static Student createStudent() {
        Student s = new Student(101, "Gouthami");
        return s;
    }

    public static void main(String[] args) {
        // Receiving the returned object
        Student obj = createStudent();

        // Displaying object details
        obj.display();
    }
}
