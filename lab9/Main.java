package lab9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    // Components
    private static JButton button;
    private static JTextField devisable;
    private static JTextField devisor;
    private static JLabel devisableLabel;
    private static JLabel devisorLabel;
    private static JLabel result;
    private static JLabel error;



    public static void main(String[] args) {
        JFrame frame = new JFrame("Laboratory 9");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setResizable(false);
        Container c = frame.getContentPane();

        devisable = new JTextField();
        devisable.setSize(100, 20);
        devisable.setLocation(120, 70);
        c.add(devisable);

        devisor = new JTextField();
        devisor.setSize(100, 20);
        devisor.setLocation(120, 120);
        c.add(devisor);

        devisableLabel = new JLabel("Devisable:");
        devisableLabel.setSize(70, 20);
        devisableLabel.setLocation(30, 70);
        c.add(devisableLabel);

        devisorLabel = new JLabel("Devisor:");
        devisorLabel.setSize(70, 20);
        devisorLabel.setLocation(30, 120);
        c.add(devisorLabel);

        result = new JLabel("Result:");
        result.setSize(100, 20);
        result.setLocation(30, 170);
        c.add(result);

        error = new JLabel();
        error.setForeground(Color.red);
        error.setSize(400, 20);
        error.setLocation(30, 220);
        c.add(error);

        button = new JButton("Calculate");
        button.setSize(120, 40);
        button.setLocation(240, 270);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    result.setText("Result:");
                    error.setText("");
                    float num1 =  Float.parseFloat(devisable.getText());
                    float num2 = Float.parseFloat(devisor.getText());

                    if (num2 == 13) {
                        throw new UnluckyException();
                    }
                    float res = num1 / num2;
                    result.setText(String.format("Result: %.4f", res));
                } catch(NullPointerException npe) {
                    error.setText("Error: You must fill in all fields!");
                } catch (NumberFormatException nfe) {
                    error.setText("Error: Wrong Input. Can't parse numbers!");
                } catch (ArithmeticException ae) {
                    error.setText("Error: Wrong input. Can't evaluate expression!");
                } catch (UnluckyException ue) {
                    error.setText("Error: Unlucky Exception. Don't divide by 13 :D");
                }
            }
        });

        c.add(button);

        frame.setVisible(true);
    }
}
