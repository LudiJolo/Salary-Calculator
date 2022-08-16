import javax.swing.*;
import java.awt.*;
public class NegativeOutput extends JPanel {
    public NegativeOutput(JFrame parentFrame){
        JFrame newWindow = new JFrame();
        JLabel msg = new JLabel("Note: Your Salary is less than your total expenses");
        newWindow.setLayout(new BorderLayout());
        newWindow.add(msg, BorderLayout.CENTER);
        newWindow.setSize(350,100);
        newWindow.setVisible(true);
        newWindow.setBounds(parentFrame.getBounds());

    }
}
