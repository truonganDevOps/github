package package_lab2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 849);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername.setBounds(66, 140, 62, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setBounds(66, 170, 62, 14);
		contentPane.add(lblPassword);
		
		JLabel lblLoginForm = new JLabel("LOGIN FORM");
		lblLoginForm.setForeground(new Color(0, 0, 255));
		lblLoginForm.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblLoginForm.setBounds(163, 93, 141, 33);
		contentPane.add(lblLoginForm);
		
		textField = new JTextField();
		textField.setBounds(163, 137, 386, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxRememberMe = new JCheckBox("Remember me?");
		chckbxRememberMe.setBounds(163, 209, 118, 23);
		contentPane.add(chckbxRememberMe);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(163, 259, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(262, 259, 89, 23);
		contentPane.add(btnReset);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(163, 167, 386, 20);
		contentPane.add(passwordField);
	}
}
