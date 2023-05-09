import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Average extends JFrame implements ActionListener {

    private JLabel label1, label2, label3, resultLabel;
    private JTextField textField1, textField2, textField3;
    private JButton calculateButton;
    private JPanel panel;

    public Average() {
        setTitle("Average Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("First number:");
        label2 = new JLabel("Second number:");
        label3 = new JLabel("Third number:");
        resultLabel = new JLabel("");

        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        textField3 = new JTextField(10);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);

        panel = new JPanel();
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(label3);
        panel.add(textField3);
        panel.add(calculateButton);
        panel.add(resultLabel);

        add(panel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(textField1.getText());
        int num2 = Integer.parseInt(textField2.getText());
        int num3 = Integer.parseInt(textField3.getText());

        int average = (num1 + num2 + num3) / 3;
        resultLabel.setText("The average is " + average);
    }

    public static void main(String[] args) {
        new Average();
    }
}
