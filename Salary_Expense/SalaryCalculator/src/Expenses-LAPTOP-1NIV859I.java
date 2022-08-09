import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Expenses extends JPanel{
    JLabel salary;
    ArrayList<JLabel> expense;
    ArrayList<JTextField> expenseField;
    JTextField salaryField;
    public Expenses(){
        this.setBackground(Color.gray);
        JLabel salary=new JLabel("Annual Salary");
        JTextField salaryField=new JTextField("Ex: 50000");
        this.expense = new ArrayList<JLabel>();
        this.expenseField = new ArrayList<JTextField>();
        this.add(salary); this.add(salaryField);
        JButton addExpense = new JButton("Add Expense");
        this.add(addExpense);

        /*
        for(int i=0; i<10; i++){
            JLabel newLabel = new JLabel("New Label");
            JTextField newField = new JTextField("New Expense");
            this.expense.add(newLabel);
            this.expenseField.add(newField);
            this.add(newLabel); this.add(newField);
        }
        * */


        this.setLayout(new GridLayout(15,2));
    }
}