package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * Created by dedeHan on 27.12.2015.
 */
public class VeritabaniIslemleri implements IVeritabaniIslemleri{
    @Override
    public ResultSet select(String sqlText) {
        ResultSet result = null;

        try {

            Connection con = DBConnection.getConnection();
            Statement statement =  con.createStatement();
            result = statement.executeQuery(sqlText);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return result;
    }

    @Override
    public boolean insert(String sqlText) {
        try {

            Connection con = DBConnection.getConnection();
            Statement statement =  con.createStatement();
            statement.execute(sqlText);

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    @Override
    public boolean update(String sqlText) {
        try {

            Connection con = DBConnection.getConnection();
            Statement statement =  con.createStatement();
            statement.executeUpdate(sqlText);

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;

    }

    @Override
    public boolean delete(String sqlText) {
        try {

            Connection con = DBConnection.getConnection();
            Statement statement =  con.createStatement();
            statement.execute(sqlText);

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;

    }
}
