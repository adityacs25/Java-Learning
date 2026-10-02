
public class BitwiseOperators {

    public static void main(String[] args) {
        int a = 2; // 10 --> 00000000 00000000 00000000 00000010
        int b = 3; // 11 --> 00000000 00000000 00000000 00000011
        int c = a & b; // 10 --> 2
        int d = a | b; // 11 --> 3
        int e = a ^ b; // 1 --> 1
        int f = ~a; // 11111111 11111111 11111111 11111101 --> -3

        System.out.println(c + " , " + d + " , " + e + " , " + f);

        // Shift operations
        int g = 1; // 00000000 00000000 00000000 00000001 -->
        // g = g << 1; // 00000000 00000000 00000000 00000010 --> 2
        // g = g << 30; // 00000000 00000000 00000000 00000000 -->
        // g = g << 31; // 00000000 00000000 00000000 00000000 --> lowest number in range of int
        g = g << 31; // (g << {32 % 32}) --> g << 0 --> 00000000 00000000 00000000 00000001 --> 1
        // g = g << 33; // (g << {33 % 32}) --> g << 1 --> 00000000 00000000 00000000 00000010 --> 2
        System.out.println(g);

        byte h = 1; // 00000001
        // h = (h << 1); // 00000000 00000000 00000000 00000010
        h = (byte) (h << 1); // 00000010

        System.out.println(h);

        // Right shift operations >> & >>>
        int i = -16;
        // i = i >> 1; // smart shift --> give +ve if given number is +ve and gives -ve if given num is -ve
        i = i >>> 1; // right shift with zeros --> always gives a positive number
        System.out.print(i);

    }
}
