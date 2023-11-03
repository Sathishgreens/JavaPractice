package org.jdbccon;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JDBCConnection {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Map m = new LinkedHashMap();
		//1.Load the Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.Establish the Connection to Database
		Connection connection = DriverManager.getConnection
				("java:oracle:thin:@localhost:1521:xe", "hr", "hr");
		
		//3. Write SQL Queries
		String sql = "Select * from Employees";
		
		//4. Prepare SQL Statement
		PreparedStatement statement = connection.prepareStatement(sql);
		
		//5. Execute the statement
		ResultSet resultSet = statement.executeQuery();
		
		
		//6. Iterate the Result
		while(resultSet.next()) {
			String string = resultSet.getString("first_name");
			String string2 = resultSet.getString("Salary");
//			System.out.println("Name : "+string);
//			System.out.println("Salary : "+string2);
			m.put(string, string2);
		}
		Set<Entry> entrySet = m.entrySet();
		int size = entrySet.size();
		String a[][] = new String[size][2];
		int i=0;
		for(Entry x:entrySet) {
			Object key = x.getKey();
			Object value = x.getValue();
			a[i][0]=(String) key;
			a[i][1]=(String) value;
			i++;
		}
		System.out.println(a[2][0]);
		//7. Close Your Connection
		connection.close();
		
	}
}
