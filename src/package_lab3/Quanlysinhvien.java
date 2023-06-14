package package_lab3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Quanlysinhvien extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldHoVaTen;
	private JTextField textFieldDiem;
	private JTextField textFieldHocLuc;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quanlysinhvien frame = new Quanlysinhvien();
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
	public Quanlysinhvien() {
		setTitle("Quản Lý Sinh Viên");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnSapXepTheoTen = new JButton("Sắp Xếp Theo Tên");
		btnSapXepTheoTen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblquanlysinhvien = new JLabel("Quản Lý Sinh Viên");
		lblquanlysinhvien.setForeground(new Color(255, 0, 0));
		lblquanlysinhvien.setHorizontalAlignment(SwingConstants.CENTER);
		lblquanlysinhvien.setBackground(new Color(255, 0, 0));
		lblquanlysinhvien.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblHoVaTen = new JLabel("HỌ VÀ TÊN");
		
		textFieldHoVaTen = new JTextField();
		textFieldHoVaTen.setColumns(10);
		
		JButton btnCapNhat = new JButton("CẬP NHẬT");
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnCapNhat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lbldiem = new JLabel("ĐIỂM");
		
		textFieldDiem = new JTextField();
		textFieldDiem.setColumns(10);
		
		JLabel lblNganh = new JLabel("NGÀNH");
		
		JComboBox comboBoxNganh = new JComboBox();
		comboBoxNganh.setModel(new DefaultComboBoxModel(new String[] {"Phát Triển Phần Mềm", "Ứng Dụng Phần Mềm", "Thiết Kế Web"}));
		
		JLabel lblHocLuc = new JLabel("HỌC LỰC");
		
		textFieldHocLuc = new JTextField();
		textFieldHocLuc.setEditable(false);
		textFieldHocLuc.setColumns(10);
		
		JCheckBox chckbxCoPhanThuong = new JCheckBox("Có phần thưởng?");
		chckbxCoPhanThuong.setSelected(true);
		
		JButton btnThem = new JButton("THÊM");
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		JButton btnXoa = new JButton("XÓA");
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		JButton btnNhapMoi = new JButton("NHẬP MỚI");
		btnNhapMoi.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNhapMoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"H\u1ECD V\u00E0 T\u00EAn", "\u0110i\u1EC3m", "Ng\u00E0nh", "H\u1ECDc L\u1EF1c", "Th\u01B0\u1EDFng"
			}
		));
		
		JButton btnSapXepTheoDiem = new JButton("Sắp Xếp Theo Điểm");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(128)
					.addComponent(lblquanlysinhvien))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblHoVaTen)
					.addGap(5)
					.addComponent(textFieldHoVaTen, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lbldiem, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(textFieldDiem, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNganh)
					.addGap(25)
					.addComponent(comboBoxNganh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblHocLuc)
					.addGap(17)
					.addComponent(textFieldHocLuc, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(62)
					.addComponent(chckbxCoPhanThuong))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(62)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(66)
							.addComponent(btnXoa))
						.addComponent(btnThem, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addComponent(btnCapNhat)
					.addGap(7)
					.addComponent(btnNhapMoi, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(btnSapXepTheoTen)
					.addGap(5)
					.addComponent(btnSapXepTheoDiem))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblquanlysinhvien)
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(lblHoVaTen))
						.addComponent(textFieldHoVaTen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(lbldiem))
						.addComponent(textFieldDiem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNganh)
						.addComponent(comboBoxNganh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(lblHocLuc))
						.addComponent(textFieldHocLuc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addComponent(chckbxCoPhanThuong)
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnXoa)
						.addComponent(btnThem)
						.addComponent(btnCapNhat)
						.addComponent(btnNhapMoi))
					.addGap(5)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSapXepTheoTen)
						.addComponent(btnSapXepTheoDiem)))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
