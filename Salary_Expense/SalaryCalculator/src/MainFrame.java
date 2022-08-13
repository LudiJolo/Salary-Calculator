import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;  
import java.util.HashMap;
public class MainFrame {

    public MainFrame(){
        //Main frame
        JFrame f= new JFrame("Panel Example");

        Expenses expenses = new Expenses();

        //Buttons
        JButton calculate = new JButton("Calculate");
        JButton addExpense = new JButton("Add Expense");

        //Layouts
        JScrollPane scroll = new JScrollPane(expenses);
        JPanel buttonLayout = new JPanel();
        buttonLayout.add(addExpense);
        buttonLayout.add(calculate);
        buttonLayout.setLayout(new GridLayout(2,1));

        //Setting components
        f.setLayout(new BorderLayout());
        f.add(scroll, BorderLayout.CENTER);
        f.add(buttonLayout, BorderLayout.SOUTH);

        f.setSize(250,250);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //button handler functions
        addExpense.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Expense button pressed");
            }
        });
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==calculate){
                    expenses.calculate(f);
                }
            }
        });
    }
    
}
