package package_lab2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;

public class StaffManagement extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffManagement frame = new StaffManagement();
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
	public StaffManagement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 687);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStaffManagement = new JLabel("Staff Management");
		lblStaffManagement.setBounds(63, 53, 207, 25);
		lblStaffManagement.setForeground(new Color(0, 0, 255));
		lblStaffManagement.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStaffManagement.setBackground(new Color(0, 51, 255));
		contentPane.add(lblStaffManagement);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(37, 123, 699, 469);
		contentPane.add(tabbedPane);
		
		JPanel panelEdittion = new JPanel();
		tabbedPane.addTab("EDITION", null, panelEdittion, null);
		panelEdittion.setLayout(null);
		
		JLabel lbLStaffId = new JLabel("Staff Id");
		lbLStaffId.setBounds(10, 27, 49, 14);
		panelEdittion.add(lbLStaffId);
		
		textField = new JTextField();
		textField.setBounds(76, 22, 575, 20);
		panelEdittion.add(textField);
		textField.setColumns(10);
		
		JLabel lblFullName = new JLabel("Full Name");
		lblFullName.setBounds(10, 55, 49, 14);
		panelEdittion.add(lblFullName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(76, 50, 575, 20);
		panelEdittion.add(textField_1);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(10, 87, 49, 14);
		panelEdittion.add(lblCountry);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 124, 49, 14);
		panelEdittion.add(lblGender);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(10, 162, 49, 14);
		panelEdittion.add(lblStatus);
		
		JLabel lblNotes = new JLabel("Notes");
		lblNotes.setBounds(10, 198, 49, 14);
		panelEdittion.add(lblNotes);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(76, 219, 575, 167);
		panelEdittion.add(textArea);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(265, 397, 89, 23);
		panelEdittion.add(btnAdd);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(364, 397, 89, 23);
		panelEdittion.add(btnRemove);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(463, 397, 89, 23);
		panelEdittion.add(btnUpdate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(562, 397, 89, 23);
		panelEdittion.add(btnReset);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Việt Nam", "Hàn", "Mỹ"}));
		comboBox.setBounds(76, 83, 83, 22);
		panelEdittion.add(comboBox);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setBounds(76, 118, 49, 23);
		panelEdittion.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBounds(127, 118, 70, 23);
		panelEdittion.add(rdbtnFemale);
		
		JCheckBox chckbxSingle = new JCheckBox("Single?");
		chckbxSingle.setBounds(76, 156, 99, 23);
		panelEdittion.add(chckbxSingle);
		
		JPanel panelList = new JPanel();
		tabbedPane.addTab("LIST", null, panelList, null);
		panelList.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 694, 441);
		panelList.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "FULLNAME", "COUNTRY", "GENDER", "STATUS"
			}
		));
	}
}
