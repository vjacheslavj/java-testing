public class ReverseNumber {

    public static void main(String[] args) {

        int a = 543;
        int reverse = 0;
        while (a!=0) {
            int digit = a % 10;

            reverse = digit +reverse*10; //340 + 5 = 345;
            a = a / 10;
        }
        System.out.println(reverse);
    }
}
