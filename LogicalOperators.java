
public class LogicalOperators {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        // boolean d = (a < b) || (a < c); // true
        boolean d = (a < b) | (a < c); // true
        // boolean d = (a < b) & (a < c); // true

        System.err.println(d);
    }
}
