public class Fibanocci {

    public static void main(String[] args) {
        //0, 1, 1 2 3 5 8 13 21 34
        //0 - a
        //1 - b  /a
        //1 - sum sum/b

        int a = 0;
        int b = 1;
        int sum = 0;
        int i = 1;
        while (i<9) {
            sum = a+b;
            System.out.println(sum);
            a=b;
            b=sum;
            i++;
        }

    }
}
