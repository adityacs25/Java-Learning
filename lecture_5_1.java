
public class lecture_5_1 {

    public static void main(String[] args) {
        // byte b = 50;
        // // byte a = 2;
        // // b = (b * 2); //possible lossy conversion
        // // b = (byte) (b * 2);
        // b = (byte) (b * 2);
        // System.err.println(b);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50_000;
        float f = 5.67f;
        double d = .1234;

        double result = (f * b) + (i / c) - (d * s);

        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}
