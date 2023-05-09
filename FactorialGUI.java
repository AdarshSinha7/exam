import javax.swing.JOptionPane;

public class FactorialGUI 
{
    public static void main(String[] args) 
    {
        // Get the input value from a JOptionPane dialog
        String inputString = JOptionPane.showInputDialog("Enter a number:");

        // Parse the input value as an integer
        int input = Integer.parseInt(inputString);  // 0 to 170

        if(input < 0)
        {
            JOptionPane.showMessageDialog(null,"Can't calculate the factorial of a negative number");
            System.exit(0);
        }

        // Calculate the factorial
        double factorial = 1;
        for (int i = 2; i <= input; i++) 
        {
            factorial *= i;
        }

        // Display the result in a JOptionPane message dialog
        JOptionPane.showMessageDialog(null, "Factorial: " + factorial);
    }
}
