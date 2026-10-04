
public class Arrays {

    public static void main(String[] args) {

        // ------------------------ Besic way ---------------------
        /*

        int[] rollNums = new int[3];

        rollNums[0] = 101;
        rollNums[1] = 102;
        rollNums[2] = 103;

        System.out.println(rollNums[0]);
        System.out.println(rollNums[1]);
        System.out.println(rollNums[2]);

        System.out.println(rollNums.length);

         */
        // ---------------------- using for loop ------------------------ 

        /*

        int[] rollNums = new int[3];

        int x = 101;

        for (int i = 0; i < rollNums.length; i++) {
            System.out.println(rollNums[i]);
            rollNums[i] = x;
            x++;
            System.out.println(rollNums[i]);
        }
         */
        // --------------- Initaializing and defining same time----------------------------

        /*
        int[] arr = {32, 54, 87};

        for(int i : arr) {
            System.out.print(i + " ");
        }
         */
        // -------------------------- For 2 D array -------------------------------

        /*
        int[][] marks = {
            {43, 87, 94},
            {74, 32, 52},
            {21, 91, 56}
        };


        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }
        */

        // ------------------------------------- multi Dimentional arrays -------------------------------

        /*

        int[][] marks = new int[3][3];

        marks[0][0] = 23;
        marks[0][1] = 58;
        marks[0][2] = 58;

        marks[1][0] = 95;
        marks[1][1] = 69;
        marks[1][2] = 12;

        marks[2][0] = 78;
        marks[2][1] = 95;
        marks[2][2] = 36;

        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
        // for (int row = 0; row < 3; row++) {
        //     for (int col = 0; col < 3; col++) {
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }

         */
        // Multi dimensionbal array --> each with diff length
        int[][] marks = new int[3][];
        marks[0] = new int[1];
        marks[1] = new int[2];
        marks[2] = new int[3];
        marks[0][0] = 24;
        marks[1][0] = 59;
        marks[1][1] = 35;
        marks[2][0] = 34;
        marks[2][1] = 45;
        marks[2][2] = 58;
        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }
    }
}
