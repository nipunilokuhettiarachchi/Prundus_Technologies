/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prundustechnologies.Model;

/**
 *
 * @author Nipuni
 */
public class AppUser {
    
    private String username;
    private String password1;
    private String role;
    
    // Default Constructor
    public AppUser(){
        this.username="";
        this.password1="";
    }
    
    // Constructor to assign user given password and username tio the private attributes username and password
    public AppUser(String usernameGiven,String passwordGiven){
        this.username=usernameGiven;
        this.password1=passwordGiven;
    }
    
    // Constructor to assign password from the database to the private attribute password
    public AppUser(String passwordGiven){
        this.password1=passwordGiven;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Access the value of username
    public String getUsername() {
        return username;
    }

    // Access the value of user role
    public String getRole() {
        return role;
    }
    
    // Access the value of password
    public String getPassword() {
        return password1;
    }
    
    
    
}
