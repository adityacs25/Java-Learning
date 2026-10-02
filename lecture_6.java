
// Operators in java
public class lecture_6 {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = b / a;
        int g = b % a;

        System.out.println(c + " , " + d + " , " + e + " , " + f + " , " + g);

        int h = a + 2;
        // h += 2;

        h -= 2;
        System.out.println(h);

        int i = 6;
        i++;
        i--;
        System.out.println(i);

        //pre increament & post increament
        int j = 7;
        j++;
        // j++;
        // j++;
        ++j;
        // j = 9
        boolean bool = (j == j++);
        System.out.println(j == ++j);//false
        System.out.println(j == j++);//true
        System.out.println(bool);//true

        int k = j++; // k = 9, j = 10
        System.out.println(j + " , " + k);

        int l = ++j; // l = j+1 = 11, j = 11
        System.out.println(j + " , " + l);

        boolean m, n, o, p, q, r;
        m = (a == b);
        n = (a != b);
        o = (e > f);
        p = (g < c);
        q = (d <= h);
        r = (j >= d);

        System.err.println(m);
        System.err.println(n);
        System.err.println(o);
        System.err.println(p);
        System.err.println(q);
        System.err.println(r);

    }
}
