import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Expenses extends JPanel{
    JLabel salary;
    ArrayList<JLabel> expense;
    ArrayList<JTextField> expenseField;
    JTextField salaryField;
    JLabel remainingIncome;
    JLabel expensePercentage;

    SalaryCalculator mySal;

    public Expenses(){
        this.setBackground(Color.gray);
        this.salary=new JLabel("Annual Salary");
        this.salaryField=new JTextField(10);
        onlyNum(this.salaryField);


        this.expense = new ArrayList<JLabel>();
        this.expenseField = new ArrayList<JTextField>();
        this.add(salary); this.add(salaryField);

        addNewExpense("Gas");
        addNewExpense("Rent");
        addNewExpense("Grocery");
        addNewExpense("Internet");
        this.setLayout(new GridLayout(5,2));

        this.remainingIncome = new JLabel("Remaining Income: ");
        this.expensePercentage = new JLabel("Expense Percentage: ");

    }
    public void addNewExpense(String label){
        JLabel newLabel = new JLabel(label);
        JTextField newField = new JTextField();
        this.expense.add(newLabel);
        this.expenseField.add(newField);
        this.add(newLabel); this.add(newField);

        onlyNum(newField);
    }
    public void calculate(){
        int salary = Integer.valueOf(this.salaryField.getText());
        mySal = new SalaryCalculator(salary);
        for(int i=0; i<this.expense.size(); i++){
            mySal.addExpense(this.expense.get(i).getText(), Integer.valueOf(this.expenseField.get(i).getText()));
        }
        System.out.println(mySal.getPercentageAfterTax());
        System.out.println(mySal.getRemainingIncome_withTax());

    }

    public void onlyNum(JTextField input){
        input.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = input.getText();
                int l = value.length();
                if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') ||
                        ke.getKeyCode()==KeyEvent.VK_BACK_SPACE || ke.getKeyCode()==KeyEvent.VK_DELETE) {

                    input.setEditable(true);
                } else {
                    input.setEditable(false);
                }
            }
        });
    }
}