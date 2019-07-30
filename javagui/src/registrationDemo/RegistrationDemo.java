/*
 * Gui를 이용한 작업 요령 전달... 
 * 1. 프로젝트 ... 패키지.... Window Builder > Jframe으로 메인 클래스를 만들고...
 * 2. setBounds()로 위치 0,0 크기는 1400, 800으로 설정한 후  
 *    private JPanel contentPane; 아래에
 *    private JFrame frame;
 * 3. design 창 열어서 layout을 absolute layout으로 설정한다. 생성자 마지막 라인이 contentPane.setLayout(null);으로 변경되는 것 확인
 * 4. 타이틀 레이블용으로 panel 하나 추가...하고 레이아웃을 absolute으로 세트  
 * 
 */
package registrationDemo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrationDemo extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField txtUserID;
	private JTextField txtName;
	private JTextField txtPassword;
	private JTextField txtEmail;
	private JTextField txtMobile;
	private JTextField txtDateRegistered;
	private JTable table;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationDemo frame = new RegistrationDemo();
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
	public RegistrationDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(211, 211, 211)));
		panel.setBounds(10, 10, 1370, 730);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(211, 211, 211)));
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(14, 12, 1342, 93);
		panel.add(panel_1);
		
		JLabel lblMembershipRegistrationSystem = new JLabel("Membership Registration System");
		lblMembershipRegistrationSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblMembershipRegistrationSystem.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblMembershipRegistrationSystem.setBounds(122, 12, 1083, 69);
		panel_1.add(lblMembershipRegistrationSystem);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(211, 211, 211)));
		panel_2.setBackground(SystemColor.menu);
		panel_2.setBounds(20, 117, 403, 471);
		panel.add(panel_2);
		
		JLabel lblUserID = new JLabel("UserID");
		lblUserID.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblUserID.setBounds(14, 32, 110, 30);
		panel_2.add(lblUserID);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblName.setBounds(14, 94, 110, 30);
		panel_2.add(lblName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPassword.setBounds(14, 156, 110, 30);
		panel_2.add(lblPassword);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblEmail.setBounds(14, 218, 110, 30);
		panel_2.add(lblEmail);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblAddress.setBounds(14, 280, 110, 30);
		panel_2.add(lblAddress);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblMobile.setBounds(14, 342, 110, 30);
		panel_2.add(lblMobile);
		
		JLabel lblDateRegistrated = new JLabel("Date Registrated");
		lblDateRegistrated.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDateRegistrated.setBounds(14, 404, 179, 30);
		panel_2.add(lblDateRegistrated);
		
		txtUserID = new JTextField();
		txtUserID.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtUserID.setBounds(198, 30, 172, 30);
		panel_2.add(txtUserID);
		txtUserID.setColumns(10);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtName.setColumns(10);
		txtName.setBounds(198, 90, 172, 30);
		panel_2.add(txtName);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtPassword.setColumns(10);
		txtPassword.setBounds(198, 150, 172, 30);
		panel_2.add(txtPassword);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtEmail.setColumns(10);
		txtEmail.setBounds(198, 210, 172, 30);
		panel_2.add(txtEmail);
		
		txtMobile = new JTextField();
		txtMobile.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtMobile.setColumns(10);
		txtMobile.setBounds(198, 350, 172, 30);
		panel_2.add(txtMobile);
		
		txtDateRegistered = new JTextField();
		txtDateRegistered.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtDateRegistered.setColumns(10);
		txtDateRegistered.setBounds(198, 410, 172, 30);
		panel_2.add(txtDateRegistered);
		
		JComboBox comboAddress = new JComboBox();
		comboAddress.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Sangdang-gu", "Seowon-gu", "Cheonwon-gu", "Heungdeok-gu"}));
		comboAddress.setFont(new Font("Tahoma", Font.BOLD, 24));
		comboAddress.setBounds(198, 270, 172, 50);
		panel_2.add(comboAddress);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(211, 211, 211)));
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBounds(14, 609, 1342, 92);
		panel.add(panel_3);
		
		JButton btnAddRecord = new JButton("AddRecord");
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
						txtUserID.getText(),
						txtName.getText(),
						txtPassword.getText(),
						txtEmail.getText(),
						comboAddress.getSelectedItem(),
						txtMobile.getText(),
						txtDateRegistered.getText()
				});
				
				if(table.getSelectedRow() == -1 ) {
					if(table.getRowCount() == 0 ) {
						JOptionPane.showMessageDialog(null, "Membership Updated Confirmed", "Membership Management System", JOptionPane.OK_OPTION);
					}
				}// end of if
			}
		});
		btnAddRecord.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnAddRecord.setBounds(64, 25, 191, 46);
		panel_3.add(btnAddRecord);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUserID.setText("");
				txtName.setText("");
				txtPassword.setText("");
				txtEmail.setText("");
				comboAddress.setSelectedItem("Make a Selection");
				txtMobile.setText("");
				txtDateRegistered.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnReset.setBounds(319, 25, 191, 46);
		panel_3.add(btnReset);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null,  "No data to delete", "Membership Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,  "Select a row to delete", "Membership Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnDelete.setBounds(574, 25, 191, 46);
		panel_3.add(btnDelete);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					table.print();
				} catch (java.awt.print.PrinterException pe) {
					System.err.format("No Printer found", pe.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnPrint.setBounds(829, 25, 191, 46);
		panel_3.add(btnPrint);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you wnat to exit", "Membership Registration System", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnExit.setBounds(1084, 25, 191, 46);
		panel_3.add(btnExit);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(211, 211, 211)));
		panel_4.setBackground(SystemColor.menu);
		panel_4.setBounds(437, 117, 919, 471);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(14, 12, 879, 447);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"UserID", "Name", "Password", "Email", "Address", "Mobile", "Date Registered"
			}
		));
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
	
		//scrollPane.setColumnHeaderView(table);
		scrollPane.setViewportView(table);		
	
		
	}
}
