package comm.example;
import java.sql.Connection;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class JdbcDemo {
	private static Properties properties=null;
	
		static {
		properties=new Properties();
		properties.put("JDBC_URL", "jdbc:mysql://localhost:3306/courses");
		properties.put("USER", "root");
		properties.put("PASSWORD", "135246");
		}
		public JdbcDemo() {
			
		}
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Scanner scanner=new Scanner(System.in);
		MySqlConnectionFactory factory = MySqlConnectionFactory.createConnection();
		Connection connection=factory.getConnection();
		PreparedStatement pst=connection.prepareStatement("insert into courses values(?,?,?)");
		System.out.print("ID:");
		int id=scanner.nextInt();
		System.out.print("NAME:");
		String name=scanner.next();
		System.out.print("AMOUNT:");
		int amount=scanner.nextInt();
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setInt(3, amount);
		int count=pst.executeUpdate();
		System.out.println(count+" row(s) updated");
		pst= connection.prepareStatement("update courses set course=? where id=?");
		System.out.print("COURSE:");
		String course=scanner.next();
		System.out.print("ID:");
		 id=scanner.nextInt();
		pst.setString(1, course);
		pst.setInt(2, id);
		 count=pst.executeUpdate();
		System.out.println(count+" row(s) updated");
		pst= connection.prepareStatement("delete from courses where id=?");
		System.out.print("ID:");
		id=scanner.nextInt();
		pst.setInt(1, id);
		count=pst.executeUpdate();
		System.out.println(count+" row(s) deleted");
			
	}

}
