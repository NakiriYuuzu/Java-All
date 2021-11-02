
public class Test {
    public static void main(String[] args) {
        b a = new b();
        b.print("Hello");
    }
}

class b {
    private String s;

    public b() {
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}