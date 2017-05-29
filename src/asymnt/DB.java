/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asymnt;

/**
 *
 * @author Pathum
 */
import java.sql.*;
public class DB {
     public static Statement getStatement(){
    try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","");
            Statement stat = con.createStatement();
            
            return stat;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
     }
}
