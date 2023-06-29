package arrays;

public class PrintMultiplicationTableWithoutMultiplyOperator {
    public static void main(String[] args) {

        int result = multiply(5, 10);
        System.out.println(result);
    }

    public static int multiply(int i, int j) {
        int k = 1;
        int result = 0;
        while (k<=j) {
            result = result + i;
            k++;
        }
        return result;
    }
}