/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBUTIL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aish
 */
public class DBUTIL {
    private String dburl= "jdbc:oracle:thin:@localhost:1521;XE";
     private  String user = "SYSTEM";
private String pass = "abcd";
   public DBUTIL() {
       
    this.dburl=dburl;
    this.pass=pass;
    this.user=user;
       
  }
       
  public Connection getConnection()
  {

        Connection con= null;
        System.out.println("Connecting .....");
        try {
           // Connection conn = DriverManager.getConnection(dburl, user, pass);
            Class.forName(("oracle.jdbc.OracleDriver"));
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","abcd");
             System.out.println("Now connected..!");
             //return conn;
        } catch (SQLException ex) {
             System.out.println(" dbutil catch not Connected to database !");
            Logger.getLogger(DBUTIL.class.getName()).log(Level.SEVERE, null, ex);
       
        }catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
           
 return con;
}  
    
}

    

