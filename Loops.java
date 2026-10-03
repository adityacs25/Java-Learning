
public class Loops {

    public static void main(String[] args) {
        int i = 1;

        // To print 1 to 10
        System.err.println("Numbers from 1 to 10:");
        while (i <= 10) {
            System.err.println(i);
            i++;
        }

        // ---------------------- To print 10 to 1 -------------------------------
        System.err.println("Numbers from 10 to 1:");
        i--;
        while (i >= 1) {
            System.err.println(i);
            i--;
        }

        System.out.println("Numbers from 50 to 60:");
        int num = 49;

        while (num++ < 60) {
            System.out.println(num);
        }

        // ------------------ Using do while print M to A ------------------------
        System.out.println("To print M to A:");
        char ch = 'M';

        do {
            System.out.println(ch);
        } while (ch-- > 'A');

        // ----------------- for loop --------------------------
        System.err.println("Printing square values of 1 to 10:....");
        for (byte sq = 1; sq <= 1_0; sq++) {
            System.err.println(sq * sq);
        }

        // To print pattern --> triangle of stars
        System.err.println("Triangle of stars:");

        // Java allows labels --> outer , inne are labels

        outer: for (int a = 1; a <= 10; a++) {
            inner: for (int b = 1; b <= a; b++) {
                System.out.print("* ");

                if(b >= 5) {
                    break outer;
                }
            }
            System.err.println();
        }
        System.out.println();
        // Jump statemnets --> break, continue
        // prime number checking
        int n = 9;
        int p;

        for (p = 2; p < n; p++) {
            if (n % p == 0) {
                System.out.println(n + " is not a prime number");
                break;
            }
        }
        if (p == n) {
            System.out.println(n + " is a prime");
        }

        // Even and Odd numbers

        System.out.println("Odd numbers: ");
        for(int e = 1; e <= 10; e++) {
            if(e % 2 == 0) {
                continue;
            }
            System.out.println(e);
        }

        // Java allow empty code blocks

        first: {
            second: {
                third: {
                    System.out.println("Hello, I'm inside empty code block third");
                }
            }
        }
    }
}
