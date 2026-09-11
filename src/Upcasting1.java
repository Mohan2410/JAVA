class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor");
    }
    void display() {
        System.out.println("Child display");
    }
    void show() {
        System.out.println("Child show");
    }
}

public class Upcasting1 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();
//         p.show();

        ((Child)p).show();
    }
}