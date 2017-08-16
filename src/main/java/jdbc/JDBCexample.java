/**
 * 
 */
package jdbc;

import java.sql.*;

/**
 * @author chentianle
 *
 */
public class JDBCexample {

	/**
	 * 
	 */
	public JDBCexample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//test for import
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("import package success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		// connect
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@10.0.82.163:1521:db11g", "system", "Bigdata2017");
			Statement statement = con.createStatement();

			String sql = "select * from students";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
			System.out.println("result print done");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

		
		

	}

}
