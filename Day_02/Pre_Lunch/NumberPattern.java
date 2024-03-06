/*Print Number Pattern
1 0 1 0 1 0 1
  1 0 1 0 1
    1 0 1 
      1   */

public class NumberPattern {
    public static void main(String[] args) {
        int rows = 4; 
        for (int i = rows; i > 0; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print((k % 2 == 0) ? "0" : "1");
            }
            System.out.println(); 
        }
    }
}

