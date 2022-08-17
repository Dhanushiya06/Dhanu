public class Variable {
    int a = 10;
}

class Sum extends Variable {
    void sum() {
        int a = 20;
        System.out.println(a);
        System.out.println(super.a);

    }

    public static void main(String[] args) {
        Sum s = new Sum();
        s.sum();
    }
}