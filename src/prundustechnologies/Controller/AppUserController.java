/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prundustechnologies.Controller;

import DBConnection.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import prundustechnologies.Model.AppUser;

/**
 *
 * @author Nipuni
 */
public class AppUserController {
    
    public static int addCustomer(AppUser user) throws ClassNotFoundException,SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        String sql="Insert into AppUsersu values ("+user.getUsername()+",'"+user.getPassword()+"')";
        int res=stm.executeUpdate(sql);
        return res;
    }
    
    public static AppUser confirmLogin(String username)throws ClassNotFoundException,SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        String sql="Select PASSWORD from PRUNDUSUSER.APPUSERS where USERNAME='"+username+"'";
        ResultSet rst=stm.executeQuery(sql);
        
        if(rst.next()){
            AppUser user=new AppUser(rst.getString("PASSWORD"));
            return user;
        }else{
            return null;
        }
    }  
    
    public static String getUserRole(String password)throws ClassNotFoundException,SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        String sql="Select ROLE from PRUNDUSUSER.APPUSERS where PASSWORD='"+password+"'";
        ResultSet rst=stm.executeQuery(sql);
        
        if(rst.next()){
            AppUser user=new AppUser();
            user.setRole(rst.getString("Role"));
            
            return user.getRole();
        }else{
            return null;
        }
    }
    
}
