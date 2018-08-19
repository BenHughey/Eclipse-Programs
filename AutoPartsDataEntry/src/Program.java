import java.sql.*;

public class Program {
	
	private static final String USERNAME = "benhughey";
	private static final String PASSWORD = "sunset1";
	private static final String CONN_STRING = "jdbc:mysql://localhost/autoparts";
	
	public static void main (String[] args) throws SQLException {
		
		Connection conn = null;
		Statement stmt = null; 
		ResultSet rs = null;
		String sql = null;
		
		try {
		
		conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
		stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		stmt = conn.createStatement();
		//Begins transaction
		sql = ("START TRANSACTION;");
		stmt.executeUpdate(sql);
		//If table not in database, creates table "customers" with 5 Columns and id as the key
		sql=  ("CREATE TABLE IF NOT EXISTS customers (id INT NOT NULL KEY AUTO_INCREMENT, firstName varchar(50),"
				+ " lastName varchar(50), contactNumber varchar(25), address varchar(100))");
		
		stmt.executeUpdate(sql);
		//Adds 3 new rows to customers table
		sql = (
				"INSERT INTO customers (firstName, lastName, contactNumber, address)"
					+ "VALUES('Paul', 'Atreides', '0411558899', '65 Zelazny Road, Dunesville'),"
					+ "('Vladamir', 'Harkonnen', '0477663344', '19 Chani Way, Fenring City'),"
					+ "('Feyd', 'Rautha', '0422314567', 'Unit 1, 84 Idaho avenue, Duncan')");
		
		stmt.executeUpdate(sql);
		//Adds new customer John Smith to customers table
		sql = (
				" INSERT INTO customers (firstName, lastName, contactNumber, address)"
				+ "VALUES('John', 'Smith', '0453251869', '123 Fake Street Canmore');"
				);
		stmt.executeUpdate(sql);
		//Changes Feyd Rautha's contact number
		sql = (
				" UPDATE customers"
				+ " SET contactNumber = '0498745632'"
				+ " WHERE firstName = 'Feyd' AND lastName = 'Rautha';"
				);
		stmt.executeUpdate(sql);
		//Removes Vladamir Harkonnen from customers table
		sql = (
				
				 " DELETE FROM customers WHERE firstName = 'Vladamir' AND lastName = 'Harkonnen';"
				 );
		stmt.executeUpdate(sql);
				 
		//Returns first entry from customers table
		rs = stmt.executeQuery("SELECT * FROM customers LIMIT 1;");
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnsNumber = rsmd.getColumnCount();
		while (rs.next()) {
		for (int i = 1; i <= columnsNumber; i++) {
			System.out.println(rsmd.getColumnName(i) + " : " +rs.getString(i));
		}
			
		}
		//Ends transaction 
		stmt.executeUpdate("COMMIT;");
				
		
	}catch (SQLException e) {
		System.err.println(e);
	}finally {
		//closes all connections when finished
		
		if( rs != null) {
			rs.close();
		}
			
		if (stmt != null) {
			stmt.close();
		}
		if (conn != null) {
			conn.close();
		}
		
	}
	}
}

	
	


