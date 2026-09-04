public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Integers --> byte, short, int, long
        //Binary(2), Octal(8), Hexadecimal(16)
        // byte b = 5; //Decimal
        // byte b = 0b101; //Binary
        // byte b = 05; //Octal --> 0 - 7
        // byte b = 010; //Octal --> 0 - 7
        // byte b = 0XA; //Hexadecimal (0 - 15) --> 0 - 9, A, B, C, D, E, F
        byte b = 0X10; //Hexadecimal (0 - 15) --> 0 - 9, A, B, C, D, E, F
        short s = 10;
        int i = 4000;
        long l = 10000;

        //Real numbers
        float f = 10.54f;
        double d = 23.0987;

        //Characters
        char c = 'a'; // 'a' --> int --> binary --> store

        //Boolean
        boolean bool = false;

        System.out.println("Integers value --> " + b + ", " + s + ", " + i + ", " + l);
        System.out.println("Floating values --> " + f + ", " + d);
        System.out.println("Character values --> " + c);
        System.out.println("Boolean values --> " + bool);
    }
}
