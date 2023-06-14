package package_lab2;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Checkbox;
import javax.swing.JRadioButton;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
//import thư viện nhưng chưa dùng tới
import javax.swing.JTextPane;
import java.awt.List;
import javax.swing.JFormattedTextField;
import java.awt.FlowLayout;

public class StaffEdition extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffEdition frame = new StaffEdition();
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
	public StaffEdition() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 641);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNameLabel = new JLabel("Staff Edition");
		lblNameLabel.setBounds(110, 11, 230, 22);
		lblNameLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNameLabel.setBackground(new Color(240, 240, 240));
		lblNameLabel.setForeground(new Color(0, 128, 255));
		contentPane.add(lblNameLabel);
		
		textField = new JTextField();
		textField.setBounds(110, 67, 318, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 36, 318, 20);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JLabel lblStaffId = new JLabel("Staff Id");
		lblStaffId.setBounds(40, 36, 60, 14);
		contentPane.add(lblStaffId);
		
		JLabel lblFullname = new JLabel("Fullname");
		lblFullname.setBounds(40, 70, 60, 14);
		contentPane.add(lblFullname);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(40, 123, 60, 14);
		contentPane.add(lblCountry);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(40, 158, 60, 14);
		contentPane.add(lblGender);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(40, 199, 60, 14);
		contentPane.add(lblStatus);
		
		JLabel lblNotes = new JLabel("Notes");
		lblNotes.setBounds(40, 238, 60, 14);
		contentPane.add(lblNotes);
		
		JRadioButton rdbtnNam = new JRadioButton("Nam");
		buttonGroup.add(rdbtnNam);
		rdbtnNam.setBounds(110, 154, 69, 23);
		contentPane.add(rdbtnNam);
		
		JRadioButton rdbtnNu = new JRadioButton("Nữ");
		buttonGroup.add(rdbtnNu);
		rdbtnNu.setBounds(181, 154, 69, 23);
		contentPane.add(rdbtnNu);
		
		JRadioButton rdbtnKhc = new JRadioButton("Khác");
		buttonGroup.add(rdbtnKhc);
		rdbtnKhc.setBounds(252, 154, 69, 23);
		contentPane.add(rdbtnKhc);
		
		Checkbox checkbox = new Checkbox("Single?");
		checkbox.setBounds(110, 183, 92, 46);
		contentPane.add(checkbox);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(110, 235, 318, 100);
		contentPane.add(textArea);
		
//		Button btnAdd = new Button("Add");
//		btnAdd.setFont(new Font("Dialog", Font.PLAIN, 10));
//		btnAdd.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
		Button btnAdd = new Button("Add");
		btnAdd.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		// Thêm phần xử lý khi button được nhấn vào đây
			// Hiển thị thông báo đã add thành công
		    JOptionPane.showMessageDialog(null, "Đã add thành công");
		}
		});
		btnAdd.setBounds(110, 341, 68, 43);
		contentPane.add(btnAdd);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Việt Nam", "Mỹ", "Hàn"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(110, 119, 84, 22);
		contentPane.add(comboBox);
		
		Button btnUpdate = new Button("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Đã Update thành công");
			}
		});
		btnUpdate.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnUpdate.setBounds(193, 341, 68, 43);
		contentPane.add(btnUpdate);
		
		Button jbtnDelete = new Button("Delete");
		jbtnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Đã xóa thành công");
			}
		});
		jbtnDelete.setFont(new Font("Dialog", Font.PLAIN, 10));
		jbtnDelete.setBounds(267, 341, 68, 43);
		contentPane.add(jbtnDelete);
		
		Button btnReset = new Button("Reset");
		btnReset.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnReset.setBounds(341, 341, 68, 43);
		contentPane.add(btnReset);
	}
}
