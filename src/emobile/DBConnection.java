/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package emobile;
/**
 *
 * @author hnd
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DBConnection {
   
    private Connection getConnection() throws Exception{
    
      String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
      String URL="jdbc:odbc:OOP77";
      
      String UserName="sa";
      String password="hnd";
       
      Class.forName(driver);
              
      return DriverManager.getConnection(URL, UserName, password);
    }
    
    public void addvalue(String SQL)throws Exception{
    
      Connection conn= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=77OOP062;user=sa;password=hnd");
      Statement st=conn.createStatement();
      st.executeUpdate(SQL);
      conn.close();
    }
}
