public class SuperKey {
    void print() {
        System.out.println("print");
    }
}

class Example extends SuperKey {
    void print() {
        System.out.println("printable");
    }

    void display() {
        super.print();

    }

    public static void main(String[] args) {
        Example s = new Example();
        s.print();
        s.display();

    }
}

