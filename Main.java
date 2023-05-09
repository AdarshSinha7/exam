package MyPackage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the name :\t");
        String name = sc.nextLine();
        
        System.out.print("Enter the roll-no : \t");
        int rollNumber = sc.nextInt();

        System.out.print("Enter the marks obtained in the three subjects :\t");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        

        Student s = new Student(name, rollNumber, m1, m2, m2);

        s.display();
        System.out.println("Total Marks: " + s.getTotalMarks());
        System.out.println("Percentage: " + s.getPercentage() + "%");
    }
}
