package arrays;

public class MultidimensionalArray {
    /**
     * 2  4  5
     * 4  4  7
     * 1  2  9

     * Print min and max number from the above matrix
     */

    public static void main(String[] args) {

        int abc[][] = {{2, 4, 6}, {3, 4, 7}, {1, 2, 9}};
        int min = abc[0][0];
        int max = abc[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (abc[i][j] < min) {
                    min = abc[i][j];
                } else {
                    if (abc[i][j] > max) {
                        max =  abc[i][j];
                    }
                }
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
