import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
public class Main {
    public static void main(String[]args){
        //Initializing values
        HashMap<String, Integer> myExp = new HashMap<String, Integer>();
        int salary = 75000;

        //Adding expenses at any number
        myExp.put("Gas", 240);
        myExp.put("Rent", 2200);
        myExp.put("Grocery", 200);
        myExp.put("Internet", 100);

        //Finalizing/Calculating
        SalaryCalculator mySal = new SalaryCalculator(salary, myExp);

        /*
        System.out.println("Without tax");
        System.out.println(mySal.getRemainingIncome());
        System.out.println(mySal.getPercentage());

        System.out.println("With tax");
        System.out.println(mySal.getRemainingIncome_withTax());
        System.out.println(mySal.getPercentageAfterTax());
         */


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

        addExpense.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Expense button pressed");
            }
        });
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expenses.calculate();
            }
        });

    }
}
