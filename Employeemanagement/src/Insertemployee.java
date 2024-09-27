import java.sql.*;
public class Insertemployee {

	public static void insert() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/users";
		String username="root";
		String password="1234";
		String Query="insert into fieldsss values(?,?,?,?,?,?,?,?,?,?,?)";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setInt(1,101);
		pst.setString(2,"test");
		pst.setString(3,"test@gmail.com");
		pst.setString(4, "1234");
		pst.setInt(5,30);
		pst.setString(6,"male");
		pst.setInt(7, 175);
		pst.setInt(8,70);
		pst.setString(9,"moderate");
		pst.setInt(10,28-8-2003);
		pst.setInt(11,344567890);
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[]args) throws Exception {
		insert();
	}
	
	
}
	