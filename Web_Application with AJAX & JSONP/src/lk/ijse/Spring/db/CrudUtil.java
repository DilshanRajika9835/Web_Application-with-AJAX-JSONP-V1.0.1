package lk.ijse.Spring.db;/*@author:Dilshan Rajika Withanachchi*/

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudUtil {
    public  static <T>T execute(String Sql,Object ...param) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(Sql);
        for (int i = 0; i < param.length; i++) {
            preparedStatement.setObject((i+1),param[i]);
        }
        if(Sql.startsWith("Select")){
            return (T)preparedStatement.executeQuery();

        }
        return ((T)(Boolean)(preparedStatement.executeUpdate()>0));
    }
}
