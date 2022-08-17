public class Constructor {
    Constructor() {
        System.out.println("java ");
    }
}

class Examples extends Constructor {
    Examples() {
        super();
        System.out.println("training");
    }

    public static void main(String[] args) {
        Examples e = new Examples();
    }
}
