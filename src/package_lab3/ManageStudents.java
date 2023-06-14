package package_lab3;

// import trước
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ManageStudents extends javax.swing.JFrame {

	List<Student> list = new ArrayList<>();
	DefaultTableModel model = new DefaultTableModel();
	int index = -1;

	/**
	 * Creates new form ManageStudents
	 */
	public ManageStudents() {
		initComponents();
		setLocationRelativeTo(null);

//        initTable();
//        fillTable();
	}

//    private void initTable() {
//        model.setColumnIdentifiers(new Object[]{"HỌ VÀ TÊN", "ĐIỂM", "NGÀNH", "HỌC LỰC","THƯỞNG"});
//        tblStudents.setModel(model);
//        
//        list.add(new Student("Nguyễn Văn Trường An", "Phát triển phần mềm",10));
//        list.add(new Student("Trần Như Nhọng", "Thiết kế đồ hoạ", 8));
//        list.add(new Student("Dương Không Âm", "Phát triển phần mềm", 3));
//        list.add(new Student("Bùi Là Chuối", "Thiết kế website", 5));
//        list.add(new Student("Ngô Là Bắp", "Lập trình máy tính", 7));
//        
//    }
//Phương thức hiển thị danh sách sinh viên lên bảng
//    public void fillTable() {
//        model.setRowCount(0);
//        for (Student sv : list) {
//            Object[] row = new Object[]{
//                sv.getName(), sv.getMarks(), sv.getGrade(), sv.getMajor(), sv.isBonus()
//            };
//            model.addRow(row);
//        }
//        model.fireTableDataChanged();
//    }
	
// Phương thức đọc thông tin sinh viên từ các trường nhập liệu trên form
	Student readForm() {
		Student sv = new Student();
		sv.name = txtHoTen.getText();
		sv.marks = Double.parseDouble(txtDiem.getText());
		sv.major = cboNganh.getSelectedItem().toString();
		return sv;
	}

//Phương thức ghi thông tin sinh viên lên các trường nhập liệu trên form
	private void writeForm(Student sv) {
		txtHoTen.setText(sv.name);
		txtDiem.setText("" + sv.getMarks());
		txtHocLuc.setText(sv.getGrade());
		cboNganh.setSelectedItem(sv.major);
		if (sv.isBonus()) {
			chkPhanThuong.setSelected(true);
		} else {
			chkPhanThuong.setSelected(false);
		}
	}

//Phương thức làm mới các trường nhập liệu trên form
	public void makeNew() {
		txtHoTen.setText("");
		txtDiem.setText("");
		txtHocLuc.setText("");
		cboNganh.setSelectedItem(0);
		chkPhanThuong.setSelected(false);
		txtHoTen.requestFocus();
	}

//Phương thức thêm sinh viên vào danh sách
	public void addStudent() {
		String hoten = txtHoTen.getText();
		String diem = txtDiem.getText();
		StringBuilder sb = new StringBuilder();
		if (hoten.equals("") || diem.equals("")) {
			sb.append("Cần nhập thông tin!\n");
		} else {
			Student sv = new Student();
			sv.name = txtHoTen.getText();
			sv.marks = Double.parseDouble(txtDiem.getText());
			sv.major = cboNganh.getSelectedItem().toString();
			list.add(sv);
			txtHocLuc.setText(sv.getGrade());
			chkPhanThuong.setSelected(sv.isBonus());
		}
		if (sb.length() > 0) {
			JOptionPane.showMessageDialog(this, sb.toString(), "Thông báo", JOptionPane.ERROR_MESSAGE);
		}
	}
	
//Phương thức cập nhật thông tin sinh viên trong danh sách
	public void updateStudent() {
		if (index == -1) {
			JOptionPane.showMessageDialog(this, "Vui lòng chọn sinh viên muốn cập nhật!");
		} else {
			Student sv = readForm();
			list.set(index, sv);
			this.fillToTable();
			this.writeForm(sv);
			tblStudents.setRowSelectionInterval(index, index);
		}
	}

//	Phương thức xóa sinh viên khỏi danh sách
	public void removeStudent() {
		if (index == -1) {
			JOptionPane.showMessageDialog(this, "Vui lòng chọn sinh viên muốn xoá!");
		} else {
			if (JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá sinh viên này không?", "Thông báo",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				list.remove(index);
				fillToTable();
				index = -1;
				makeNew();
				JOptionPane.showMessageDialog(this, "Xoá thành công!");
			}
		}
	}

//	Phương thức điền thông tin sinh viên vào bảng
	public void fillToTable() {
		model = (DefaultTableModel) tblStudents.getModel();
		model.setRowCount(0);
		for (Student sv : list) {
			Object[] row = new Object[] { sv.name, sv.marks, sv.major, sv.getGrade(), sv.isBonus() };
			model.addRow(row);
		}
	}
//Phương thức hiển thị chi tiết sinh viên được chọn
	public void showDetail() {
		int show = tblStudents.getSelectedRow();
		Student sv = list.get(show);
		txtHoTen.setText(sv.getName());
		txtDiem.setText("" + sv.getMarks());
		cboNganh.setSelectedItem(sv.getMajor());
		txtHocLuc.setText(sv.getGrade());
		chkPhanThuong.setSelected(sv.isBonus());

	}

//Phương thức sắp xếp danh sách sinh viên theo tên	
	public void orderByName() {
		Comparator<Student> st = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}
		};
		Collections.sort(list, st);
	}

//Phương thức sắp xếp danh sách sinh viên theo điểm
	public void orderByMarks() {
		Comparator<Student> st = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				Double d1 = o1.marks;
				Double d2 = o2.marks;
				return d1.compareTo(d2);
			}
		};
		Collections.sort(list, st);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
//name layout	
	private void initComponents() {

		title = new javax.swing.JLabel();
		jLabelHoVaTen = new javax.swing.JLabel();
		jLabelDiem = new javax.swing.JLabel();
		jLabelNganh = new javax.swing.JLabel();
		jLabelHocLuc = new javax.swing.JLabel();
		txtHoTen = new javax.swing.JTextField();
		txtHocLuc = new javax.swing.JTextField();
		cboNganh = new javax.swing.JComboBox<>();
		chkPhanThuong = new javax.swing.JCheckBox();
		btnAdd = new javax.swing.JButton();
		btnDelete = new javax.swing.JButton();
		btnUpdate = new javax.swing.JButton();
		btnReset = new javax.swing.JButton();
		jSeparator1 = new javax.swing.JSeparator();
		jScrollPaneTable = new javax.swing.JScrollPane();
		tblStudents = new javax.swing.JTable();
		btnOrderName = new javax.swing.JButton();
		btnOrderMark = new javax.swing.JButton();
		txtDiem = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("QUẢN LÝ SINH VIÊN");
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}
		});

		title.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
		title.setForeground(new java.awt.Color(0, 51, 102));
		title.setText("QUẢN LÝ SINH VIÊN");
		title.setToolTipText("");

		jLabelHoVaTen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabelHoVaTen.setText("HỌ VÀ TÊN");

		jLabelDiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabelDiem.setText("ĐIỂM");

		jLabelNganh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabelNganh.setText("NGÀNH");

		jLabelHocLuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabelHocLuc.setText("HỌC LỰC");

		txtHocLuc.setEditable(false);

		cboNganh.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Phát triển phần mềm", "Thiết kế website", "Thiết kế đồ hoạ", "Lập trình máy tính" }));

		chkPhanThuong.setText("Có phần thưởng?");
		chkPhanThuong.setEnabled(false);

		btnAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		btnAdd.setText("THÊM");
		btnAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAddActionPerformed(evt);
			}
		});

		btnDelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		btnDelete.setText("XOÁ");

		btnDelete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDeleteActionPerformed(evt);
			}
		});

		btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		btnUpdate.setText("CẬP NHẬT");
		btnUpdate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnUpdateActionPerformed(evt);
			}
		});

		btnReset.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		btnReset.setText("NHẬP MỚI");
		btnReset.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnResetActionPerformed(evt);
			}
		});

		tblStudents.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "HỌ VÀ TÊN", "ĐIỂM", "NGÀNH", "HỌC LỰC", "THƯỞNG" }));
		tblStudents.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tblStudentsMouseClicked(evt);
			}
		});
		jScrollPaneTable.setViewportView(tblStudents);

		btnOrderName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		btnOrderName.setText("SẮP XẾP THEO TÊN");
		btnOrderName.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnOrderNameActionPerformed(evt);
			}
		});

		btnOrderMark.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		btnOrderMark.setText("SẮP XẾP THEO ĐIỂM");
		btnOrderMark.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnOrderMarkActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jSeparator1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(jLabelHoVaTen)
										.addComponent(jLabelDiem).addComponent(jLabelNganh).addComponent(jLabelHocLuc))
								.addGap(37)
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(txtHoTen, 440, 440, 440).addComponent(chkPhanThuong)
										.addGroup(layout.createSequentialGroup()
												.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 75,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 75,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnUpdate)
												.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnReset))
										.addComponent(cboNganh, GroupLayout.PREFERRED_SIZE, 150,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(txtDiem, 440, 440, 440).addComponent(txtHocLuc, 440, 440, 440))
								.addGap(13))
						.addComponent(jScrollPaneTable, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(title)
								.addGroup(layout.createSequentialGroup().addComponent(btnOrderName)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnOrderMark)))
								.addGap(0, 269, Short.MAX_VALUE)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(18).addComponent(title).addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabelHoVaTen).addComponent(txtHoTen,
						GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabelDiem).addComponent(txtDiem,
						GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(cboNganh, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabelNganh))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabelHocLuc).addComponent(txtHocLuc,
						GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(chkPhanThuong).addGap(18)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(jScrollPaneTable, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnOrderName, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOrderMark, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddActionPerformed
		// TODO add your handling code here:
		this.addStudent();
		this.fillToTable();
		btnAdd.setEnabled(true);
		index = tblStudents.getRowCount() - 1;
		tblStudents.setRowSelectionInterval(index, index);
	}// GEN-LAST:event_btnAddActionPerformed

	private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDeleteActionPerformed
		// TODO add your handling code here:
		// isValidated();
		this.removeStudent();
		btnAdd.setEnabled(true);
	}// GEN-LAST:event_btnDeleteActionPerformed

	private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUpdateActionPerformed
		// TODO add your handling code here:
		// isValidated();
		this.updateStudent();
	}// GEN-LAST:event_btnUpdateActionPerformed

	private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnResetActionPerformed
		// TODO add your handling code here:
		// isValidated();
		makeNew();
		this.fillToTable();
	}// GEN-LAST:event_btnResetActionPerformed

	private void tblStudentsMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblStudentsMouseClicked
		// TODO add your handling code here:
		this.showDetail();
	}// GEN-LAST:event_tblStudentsMouseClicked

	private void btnOrderNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnOrderNameActionPerformed
		// TODO add your handling code here:
		this.orderByName();
		this.fillToTable();
	}// GEN-LAST:event_btnOrderNameActionPerformed

	private void btnOrderMarkActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnOrderMarkActionPerformed
		// TODO add your handling code here:
		this.orderByMarks();
		this.fillToTable();
	}// GEN-LAST:event_btnOrderMarkActionPerformed

	private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
		// TODO add your handling code here:
		txtHoTen.requestFocus();
	}// GEN-LAST:event_formWindowOpened

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ManageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ManageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ManageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ManageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ManageStudents().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnAdd;
	private javax.swing.JButton btnDelete;
	private javax.swing.JButton btnOrderMark;
	private javax.swing.JButton btnOrderName;
	private javax.swing.JButton btnReset;
	private javax.swing.JButton btnUpdate;
	private javax.swing.JComboBox<String> cboNganh;
	private javax.swing.JCheckBox chkPhanThuong;
	private javax.swing.JLabel jLabelHoVaTen;
	private javax.swing.JLabel jLabelDiem;
	private javax.swing.JLabel jLabelNganh;
	private javax.swing.JLabel jLabelHocLuc;
	private javax.swing.JScrollPane jScrollPaneTable;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTable tblStudents;
	private javax.swing.JLabel title;
	private javax.swing.JTextField txtDiem;
	private javax.swing.JTextField txtHoTen;
	private javax.swing.JTextField txtHocLuc;
	// End of variables declaration//GEN-END:variables

}
