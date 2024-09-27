import java.sql.*;
public class Deleteemployee {
	public static void insert() throws Exception {
	String url="jdbc:mysql://127.0.0.1:3306/users";
	String username="root";
	String password="1234";
	String Query="delete from fieldsss where UserId=101";
	Connection con=DriverManager.getConnection(url,username,password);
	PreparedStatement pst = con.prepareStatement(Query);
	
	pst.executeUpdate();
	con.close();
}
public static void main(String[]args) throws Exception {
	insert();
}


}

