package db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by dedeHan on 27.12.2015.
 */
public class DBConnection {

    public static Connection getConnection()
    {
        Connection connection = null;
        try
        {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/JAVA";
            connection = DriverManager.getConnection(url, "postgres", "postgres");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            connection=null;
        }

        return connection;
    }

}
