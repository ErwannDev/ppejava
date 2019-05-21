package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {

  public static Connection Connection() throws SQLException, ClassNotFoundException {
    
      Class.forName("com.mysql.cj.jdbc.Driver");
      
//      String url = "jdbc:oracle:thin:172.15.11.102/btssio@//localhost:1521/xe";
//      String user = "btssio";
//      String password = "btssio";
      
            String url = "jdbc:mysql://localhost:3306/movedb?serverTimezone=UTC";
            String user = "root";
            String password = "";

      Connection con = DriverManager.getConnection(url, user, password);

      return con;
      
  }
}