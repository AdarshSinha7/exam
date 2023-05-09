package MyPackage;

public class Student {
    private String name;
    private int rollNumber;
    private int marks1;
    private int marks2;
    private int marks3;

    public Student(String name, int rollNumber, int marks1, int marks2, int marks3) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks obtained: " + marks1 + ", " + marks2 + ", " + marks3);
    }

    public int getTotalMarks() {
        return marks1 + marks2 + marks3;
    }

    public double getPercentage() {
        return (getTotalMarks() * 100.0) / 300.0;
    }
}
