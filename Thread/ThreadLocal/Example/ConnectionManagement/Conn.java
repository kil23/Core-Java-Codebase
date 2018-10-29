import java.sql.*;

class Conn{
	private static ThreadLocal<Connection> connHolder = new ThreadLocal<Connection>(){
		public Connection initialValue(){
			return DriverManager.getConnection(DB_URL);
		}
	};

	public static Connection getConnection(){
		return connHolder.get();
	}
	public static void main(){
		Conn c = new Conn();
		c.getConnection();
	}
}