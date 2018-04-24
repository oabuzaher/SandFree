package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static final String hostName = "sandfree-001.database.windows.net";
    public static final String dbName = "SandFreeDatabase";
    public static final String user = "ServerAdmin@sandfree-001";
    public static final String password = "progressivesolutions!23";
    public static final String url = String.format("jdbc:sqlserver://%1$s:1433;database=%2$s;" +
            "user=%3$s;password=%4$s;encrypt=true;trustServerCertificate=false;" +
            "hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url);
        } catch (SQLException sqlExc) {
            throw new RuntimeException("Error connecting to the database", sqlExc);
        }
    }

/*    public static void main(String[] args) {
        ConnectionFactory cf = new ConnectionFactory();
       Connection connection = cf.getConnection();
   }
    finally {
        try {
            if (conn != null) { conn.close(); }
        } catch (SQLException sqlExc) {
            System.out.println(sqlExc.getMessage());
        } // try-catch
    } // try-catch-finally
*/
}