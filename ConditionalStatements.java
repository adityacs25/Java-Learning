
public class ConditionalStatements {

    public static void main(String[] args) {
        // boolean b = true;
        // int i = 5;
        int i = 6;

        // Selection statements
        // Normal if
        if (i > 5 && i < 10) {
            System.out.println("i is greater than 5");
        } else {
            System.out.println("i is less than or equal to 5");
        }

        // Even or Odd
        if (i % 2 == 0) {
            System.out.println(i + " is a even number");
        } else {
            System.out.println(i + " is a odd number");
        }

        // Nested ifs
        if (i > 5) {
            if (i == 10) {
                int sum = i * 5;
                System.out.println("Result: " + sum);
            }
            else
                System.out.println("i is not 10");
        } else {
            int sum = i * 11;
            System.out.println("Resut: " + sum);
        }

        // if-else-if ladder
        // Calculatin BSEB students result
        float pct, marks = 442f;
        pct = (marks/500)*100;

        if(pct < 33)
            System.out.println(pct + " Result: Fail");

        else if (pct >= 33 && pct <= 49.99)
            System.out.println(pct + " Result: Third Division");

        else if(pct >= 50 && pct <= 59.99) {
            System.out.println(pct + " Result: Second Division");
        }

        else
            System.out.println(pct + " Result: First Division");


    }
}
