import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the divisor :\t");
        int div = scanner.nextInt();
        System.out.print("Enter the index :\t");
        int index = scanner.nextInt();
        try {
            int[] arr = new int[5];
            int result = arr[index] / div;
            System.out.println("Result: " + result);
        } catch (ArithmeticException  e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Program complete.");
        }
    }
}
