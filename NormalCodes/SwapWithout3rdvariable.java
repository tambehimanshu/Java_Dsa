package NormalCodes;

public class SwapWithout3rdvariable {
      public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swapping using arithmetic
        a = a + b;  // a = 30
        b = a - b;  // b = 10
        a = a - b;  // a = 20

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
