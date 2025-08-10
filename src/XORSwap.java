/**
 * Swapping two integers using XOR
 */
public class XORSwap {
    public static void main(String[] args) {
                int x = 30, y = 99;

                System.out.printf("Before swap: x = %d, y = %d\n", x, y);

                x = x ^ y;  // Step 1
                y = x ^ y;  // Step 2
                x = x ^ y;  // Step 3

                System.out.printf("After swap: x = %d, y = %d\n", x, y);
            }
}
