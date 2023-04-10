package models;

import java.sql.Connection;
import java.sql.DriverManager;

// TODO: Auto-generated Javadoc
/**
 * The Class DAO.
 */
public class DAO {

	/** The driver. */
	private String driver = "com.mysql.cj.jdbc.Driver";
	
	/** The url. */
	private String url = "jdbc:mysql://127.0.0.1:3306/dboficina";
	
	/** The user. */
	private String user = "root";
	
	/** The password. */
	private String password = " ";

	/**
	 * Conectar.
	 *
	 * @return the connection
	 */
	public Connection conectar() {

		Connection con = null;

		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, password);

			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;

		}

	}

}
