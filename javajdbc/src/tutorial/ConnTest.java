package tutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnTest {

	public static Connection getConnection() {
		String user = "hr";
		String pwd = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("database connected successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}// end of getConnection()
	
	static public void selectList(Connection conn, PreparedStatement pstmt, ResultSet result) throws SQLException {
		String sql = "SELECT * FROM employees";
		pstmt = conn.prepareStatement(sql);
		result = pstmt.executeQuery();
		while(result.next()) {
			int employee_id = result.getInt("employee_id");
			String first_name = result.getString("first_name");
			String last_name = result.getString("last_name");
			String email = result.getString("email");
			String phone_number = result.getString("phone_number");
			String hire_date = result.getString("hire_date");
			String job_id = result.getString("job_id");
			int  salary = result.getInt("salary");
			int  commission_pct = result.getInt("commission_pct");
			int  manager_id = result.getInt("manager_id");
			int  department_id = result.getInt("department_id");
			
			System.out.println(employee_id + " : " + first_name + " : " + last_name + " : " + email + " : " 
			                 + phone_number + " : " + hire_date + " : " + job_id + " : " 
			                 + salary + " : " + commission_pct + " : " + manager_id + " : " + department_id);
		}// end of while
	}// end of selectList

	public static void main(String[] args) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet result = null;
		String sql;

		// while loop 이용, CRUD 만들어 보기		
		try {
			selectList(conn, pstmt, result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//result.close();
				//pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		


	}

}
