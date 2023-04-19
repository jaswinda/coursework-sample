import javax.swing.*;
import java.awt.*;

public class BankGUI extends JFrame {
    public BankGUI() {
        super("Bank");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        JLabel topLable = new JLabel("For Full time Employee");
        JLabel departmentsLabel = new JLabel("Departments: ");
        JLabel workingHoursLabel = new JLabel("Working Hours: ");
        JLabel contractPeriodLabel = new JLabel("Contract Period: ");
        JLabel interviwerNameLabel = new JLabel("Interviwer Name: ");
        JLabel salaryLabel = new JLabel("Salary: ");

        JTextField departments = new JTextField(10);
        JTextField workingHours = new JTextField(10);
        JTextField contractPeriod = new JTextField(10);
        JTextField interviwerName = new JTextField(10);
        JTextField salary = new JTextField(10);

        JButton button1 = new JButton("Add");

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        panel1.setLayout(layout);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel1.add(topLable, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel1.add(departmentsLabel, gbc);


        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel1.add(departments, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel1.add(interviwerNameLabel, gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel1.add(interviwerName, gbc);


        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel1.add(workingHoursLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel1.add(workingHours, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel1.add(salaryLabel, gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel1.add(salary, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel1.add(contractPeriodLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel1.add(contractPeriod, gbc);


        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel1.add(button1, gbc);



        add(panel1);




    }

    public static void main(String[] args) {
        BankGUI gui = new BankGUI();
    }
}
