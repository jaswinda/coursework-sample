package coursework2.views;

import coursework2.BankCard;
import coursework2.DebitCard;

import javax.swing.*;
import java.util.ArrayList;

public class DisplayDebitCards extends JFrame {

    public DisplayDebitCards(ArrayList<BankCard> bankCards){
        super("Display Debit Cards");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(700, 700);
        setLocationRelativeTo(null);
        //RESIZEABLE
        setResizable(false);
        setVisible(true);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        String[] columnNames = {"Card Id", "Bank Account", "Balance", "Client Name", "Card Type", "Pin", "Has Withdrawn"};
        String[][] data = new String[bankCards.size()][7];
        for (int i = 0; i < bankCards.size(); i++) {
            try {
                DebitCard debitCard = (DebitCard) bankCards.get(i);
                data[i][0] = String.valueOf(debitCard.getCardId());
                data[i][1] = String.valueOf(debitCard.getBankAccount());
                data[i][2] = String.valueOf(debitCard.getBalanceAmount());
                data[i][3] = String.valueOf(debitCard.getClientName());
                data[i][4] = String.valueOf(debitCard.getCardType());
                data[i][5] = String.valueOf(debitCard.getPinNumber());
                data[i][6] = String.valueOf(debitCard.hasWithdrawn());
            } catch (Exception e) {
                System.out.println("Not a debit card");
            }
        }
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane);
        add(panel);
    }
}
