import java.sql.*;
public class TestDB {
	
	//static Connection connection = null;
	//static Statement statement = null;
	//static ResultSet results = null;
	
	public static void main(String[] args) {
		// Use driver from Connect SW.
		//String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
		String driver = "com.mysql.jdbc.Driver";
		
		Connection connection = null;
		Statement statement = null;
		ResultSet results = null;
		
		try {
			Class.forName(driver);
			//String url = "jdbc:odbc:mydsn";
			String url = "jdbc:mysql://localhost:3306/sakila?profileSQL=true";
			String user = "root", password="root";
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();
			String query =
					"SELECT id, name FROM actor";
			// Execute query and save results.
			results = statement.executeQuery(query);
			//Print column names.
			String divider = "-----+------+-----";
			System.out.println("Col1 = id | Col2 = name \n" + divider);
			//Print results
			while(results.next()) {
				System.out.println
				(results.getString(1)+ " | " + results.getString(2) + " |  \n" + divider);
			}
			
		} catch(ClassNotFoundException cnfe) {
			System.out.println("No such class: " + driver);
		} catch(SQLException se) {
			System.out.println("SQLException: " + se);
		}
		finally{
			try{
				results.close();
				statement.close();
				connection.close();
			}
			catch(Exception e){
				System.out.println(" I am in trouble");
				e.printStackTrace();
			}
		}
	}
}