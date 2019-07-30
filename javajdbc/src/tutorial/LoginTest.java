package tutorial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class LoginTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserID;
	private JTextField txtUserPWD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginTest frame = new LoginTest();
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
	public LoginTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserId = new JLabel("User ID ");
		lblUserId.setBounds(17, 69, 82, 21);
		contentPane.add(lblUserId);
		
		JLabel lblUserPwd = new JLabel("User PWD");
		lblUserPwd.setBounds(17, 121, 102, 21);
		contentPane.add(lblUserPwd);
		
		txtUserID = new JTextField();
		txtUserID.setBounds(163, 66, 166, 27);
		contentPane.add(txtUserID);
		txtUserID.setColumns(10);
		
		txtUserPWD = new JTextField();
		txtUserPWD.setColumns(10);
		txtUserPWD.setBounds(163, 118, 166, 27);
		contentPane.add(txtUserPWD);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DB Connection
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet result = null;
				String sql = null;
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "madang";
				String pwd = "madang";
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url, user, pwd);
					sql = "SELECT * FROM members WHERE userid = ? AND userpwd = ?";
					pstmt = conn.prepareStatement(sql);
					String uid = txtUserID.getText();
					String upwd = txtUserPWD.getText();
					pstmt.setString(1, uid);
					pstmt.setString(2, upwd);
					
					result = pstmt.executeQuery();
					
					if(result.next()) {
						JOptionPane.showMessageDialog(null, "로그인이 성공하였습니다.");
					}else {
						JOptionPane.showMessageDialog(null, "로그인이 실패하였습니다.");
					}
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				// sql 구문 구성
				
				// Prepared Statement 구성후 실행
				
 
				
				// 실행 결과 확인 
				
				
			}
		});
		btnLogin.setBounds(55, 179, 129, 29);
		contentPane.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(218, 179, 129, 29);
		contentPane.add(btnCancel);
		
		JLabel lblLoginTest = new JLabel("Login Test");
		lblLoginTest.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginTest.setFont(new Font("굴림", Font.BOLD, 30));
		lblLoginTest.setBounds(83, 15, 246, 39);
		contentPane.add(lblLoginTest);
	}

}
