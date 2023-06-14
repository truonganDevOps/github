package package_lab3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class PhepTinh extends JFrame {

    private JPanel contentPane;
    private JTextField textFieldleft;
    private JTextField textFieldright;
    private JLabel lblResult;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PhepTinh frame = new PhepTinh();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public PhepTinh() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 683, 605);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        textFieldleft = new JTextField();
        textFieldleft.setBounds(53, 44, 96, 20);
        contentPane.add(textFieldleft);
        textFieldleft.setColumns(10);

        textFieldright = new JTextField();
        textFieldright.setBounds(208, 44, 96, 20);
        contentPane.add(textFieldright);
        textFieldright.setColumns(10);

        JButton btnNewButton = new JButton("Click Result");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int left = Integer.parseInt(textFieldleft.getText());
                    int right = Integer.parseInt(textFieldright.getText());
                    int result = left + right;
                    lblResult.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    lblResult.setText("nhập số ba ơi");
                }
            }
        });
        btnNewButton.setBounds(357, 43, 89, 23);
        contentPane.add(btnNewButton);

        JLabel lblPlus = new JLabel("+");
        lblPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblPlus.setBounds(169, 42, 17, 17);
        contentPane.add(lblPlus);

        lblResult = new JLabel("");
        lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblResult.setBounds(53, 88, 393, 20);
        contentPane.add(lblResult);
    }
}
