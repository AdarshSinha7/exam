import java.util.Scanner;

public class ageValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age of the child: ");
        int age = scanner.nextInt();
        try {
            if (age < 5) {
                throw new Exception();
            }else{
            System.out.println("Welcome! You are eligible for admission.");}
        } catch (Exception e) {
            System.out.println("You are not eligible for admission.");
        }
    }
}
