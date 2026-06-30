class Vehicle {
    void start() { System.out.println("Vehicle starts"); }
}
class Car extends Vehicle {
    @Override void start() { System.out.println("Car starts with key"); }
}
class Bike extends Vehicle {
    @Override void start() { System.out.println("Bike starts with kick"); }
}
public class DemoVehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
        v2.start();
    }
}

Object passing as parameter
1) Student object to a method
class Student {
    int id; String name;
    Student(int id, String name) { this.id = id; this.name = name; }
}
public class StudentPrinter {
    static void printStudent(Student s) {
        System.out.println("Student[id=" + s.id + ", name=" + s.name + "]");
    }
    public static void main(String[] args) {
        printStudent(new Student(101, "Neha"));
    }
}

class Emp {
    int empId; String name; double salary;
    Emp(int empId, String name, double salary) {
        this.empId = empId; this.name = name; this.salary = salary;
    }
}
public class EmpInfo {
    static void show(Emp e) {
        System.out.printf("Emp[id=%d, name=%s, salary=%.2f]%n", e.empId, e.name, e.salary);
    }
    public static void main(String[] args) {
        show(new Emp(1, "Kiran", 75000));
    }
}

