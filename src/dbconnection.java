
import java.sql.*;  
class dbconnection
{  
	public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/machine_works","root","");  
con.close();
}
catch(Exception e)
{
	System.out.println("connection error");
}
}
}
	