public class PrimeNumber {

    public static void main(String[] args) {
        //11%i=0

        boolean flag = false;
        int val = 8;

        for (int i=2; i * i <= val; i++) {
            if(val%i == 0) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("it is not prime");
        } else {
            System.out.println("it is prime");
        }
    }
}