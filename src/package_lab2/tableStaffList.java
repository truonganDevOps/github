package package_lab2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class tableStaffList extends JFrame {

	private JPanel contentPane;
	private JLabel lblStaffList;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tableStaffList frame = new tableStaffList();
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
	public tableStaffList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblStaffList = new JLabel("Staff List");
		lblStaffList.setBounds(32, 11, 140, 45);
		lblStaffList.setForeground(new Color(0, 153, 0));
		lblStaffList.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblStaffList);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 55, 444, 290);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "FULLNAME", "COUNTRY", "GENDER", "STATUS"
			}
		));
		
		JButton btnLoad = new JButton("Load");
		btnLoad.setBounds(303, 351, 89, 23);
		contentPane.add(btnLoad);
		
		JButton btnStore = new JButton("Store");
		btnStore.setBounds(392, 351, 89, 23);
		contentPane.add(btnStore);
	}
}
