import java.awt.*;
import javax.swing.*;

public class Pakindrome extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;

    public Pakindrome() {
        // Set up the main window
        super("Palindrome Checker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        // Create the input field and check button
        inputField = new JTextField();
        JButton checkButton = new JButton("Check");
        checkButton.addActionListener(e ->
                {
                    // Get the input number and check if it's a palindrome
                    String inputStr = inputField.getText();
                    boolean isPalindrome = inputStr.equals(new StringBuilder(inputStr).reverse().toString());

                    // Update the result label
                    if(isPalindrome)
                        resultLabel.setText(inputStr + " is a palindrome" );
                    else
                        resultLabel.setText(inputStr + " is not a palindrome" );
                }
        );

        // Create the result label
        resultLabel = new JLabel("");
        resultLabel.setHorizontalAlignment(JLabel.CENTER);

        // Add the components to the main window
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(3, 1));
        contentPane.add(inputField);
        contentPane.add(checkButton);
        contentPane.add(resultLabel);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the main window
        new Pakindrome();
    }
}
