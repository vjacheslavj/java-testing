package arrays;

public class SwapTheVariableWithAndWithoutUsingTempVariable {

    public static void main(String[] args) {

        int a = 5;
        int b = 4;
        int temp;
        // Basket A apple
        // Basket B orange
        //Basket C apple
        /**temp=a;
         a=b;
         b=temp;
         System.out.println(a);
         System.out.println(b); */

        //Swap without variable

        a = a + b; //a = 9
        b = a - b; //b = 5
        a = a - b; //a = 4
        System.out.println(a);
        System.out.println(b);

    }
}
