class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}
