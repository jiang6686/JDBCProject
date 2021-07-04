import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDome {
	private static  String URL="jdbc:mysql://localhost:3306/outdoor";
	private static String USER="root";
	private static String PWD="vrfdatamysql";
	public	static void update(){
		Connection connection=null;
		Statement cst=null;
				
		try {
		Class.forName("com.mysql.jdbc.Driver");
		 connection = DriverManager.getConnection(URL, USER, PWD);
		String sql="insert into out_1 values(1010,'GMV-615WM/X',615,'gmv','2016-07-01')";
		 cst = connection.createStatement();
		int count=cst.executeUpdate(sql);
		if(count>0) {
			System.out.print("更新成功");
		}else {
			System.out.print("更新失败");
		}
		
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch( SQLException e) {
 	}finally{
		try {       
			cst.close();
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
		
	}
	public static void main(String[] args) {
		update();
	}
		
}
