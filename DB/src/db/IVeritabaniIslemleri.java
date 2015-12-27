package db;

import java.sql.ResultSet;

/**
 * Created by dedeHan on 27.12.2015.
 */
public interface IVeritabaniIslemleri {

    public ResultSet select(String sqlText);

    public boolean insert(String sqlText);

    public boolean update(String sqlText);

    public boolean delete(String sqlText);
}
