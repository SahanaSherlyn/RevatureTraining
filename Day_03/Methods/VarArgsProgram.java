/* VarArgsProblem */

public class VarArgsProgram {

    public static int calSum(int ...numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    public static long calPro(int ...numbers) {
        long product = 1;
        for (int num : numbers) {
            product *= num;
        }
        return product;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 11 };
        int sum = calSum(arr);
        long product = calPro(arr);
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Product of array elements: " + product);
    }
}