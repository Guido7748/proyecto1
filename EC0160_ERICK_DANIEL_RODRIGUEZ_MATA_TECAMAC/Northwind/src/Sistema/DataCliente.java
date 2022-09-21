package Sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Client;
import com.mysql.cj.xdevapi.PreparableStatement;

public class DataCliente {
	private static final String controlador = "com.mysql.jc.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/northwind";
	private static final String user = "";
	private static final String password = "";

	static {
		try {
			Class.forName(controlador);
			System.out.println("Conexion Exitosa");
		} catch (ClassNotFoundException e) {
			System.out.println("Error");
		}
	}

	public Connection conectar() throws SQLException {
		Connection cx = null;
		try {
			cx = DriverManager.getConnection(url, user, password);
			System.out.println("Conexion Exitosa");
		} catch (ClassCastException e) {
			System.out.println("Error");
			e.printStackTrace();

			return cx;

		}
		return cx;
	}

	public static void main(String[] args) throws SQLException {
		DataCliente dc = new DataCliente();

		dc.conectar();
	}

	public boolean InsertarCliente(Client c) throws SQLException {
	   PreparedStatement ps=null
			   ps=conectar().prepareStatement("INSERT INTO costumers VALUES(?,?,?,?,?,?,?,?,?,?,?,)");
	   ps.setString(1, c.getCustomerID());
	  ps.setString(2, c.getCompanyName());
	  ps.setString(3, c.getContactName());
	  ps.setSttring(4, c.getContactTitle());
	  ps.setString(5, c.getaddresss());
	  ps.setString(6, c.getcity());
	  ps.setString(7, c.getregion());
	  ps.setString(8, c.getpostalCode());
	  ps.setString(9, c.getcountry());
	  ps.setString(10, c.getphone());
	  ps.setString(11, c.getfax());
	  
	  
   }
}