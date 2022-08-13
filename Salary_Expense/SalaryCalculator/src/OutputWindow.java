import javax.swing.*;
import java.awt.*;
public class OutputWindow {
    OutputWindow(JFrame parentFrame, SalaryCalculator sal){
        JFrame newWindow = new JFrame();
        JLabel remainingIncome = new JLabel("Remaining Income: $" + String.format("%,.2f", sal.getRemainingIncome_withTax()));
        JLabel incomePerMonth = new JLabel("Income per month: $" + String.format("%,.2f", sal.getRemainingIncome_withTax()/12));
        JLabel expensePercentage = new JLabel("Expense Percentage: " + String.format("%.2f", sal.getPercentage()) + '%');
        JLabel salary = new JLabel("Annual Salary: " + String.format("%,.2f", Double.valueOf(sal.getSalary())));

        newWindow.add(salary);
        newWindow.add(remainingIncome);
        newWindow.add(incomePerMonth);
        newWindow.add(expensePercentage);
        
        newWindow.setLayout(new GridLayout(4,1));
        newWindow.setSize(250,250);
        newWindow.setVisible(true);
        newWindow.setBounds(parentFrame.getBounds());

        System.out.println("New window opened");
    }
}
