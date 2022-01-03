import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamid
 */

public class Intermediate {
    Connection con=null;
    public static String Name;
    public static String depart;
    public static String userName;
    public static String student;
    public static String quizID;
    
     public java.sql.Connection Connect()
    {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root","");
           return con;
            
        } catch (Exception ex) {
           return con;
        }
        
        
 
    }
    
}
