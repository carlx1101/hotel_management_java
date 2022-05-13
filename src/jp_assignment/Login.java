/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jp_assignment;

/**
 *
 * @author Carl
 */
public class Login extends Admin {

    private String username;
    private String password; 
    private String isValidated;
    
    
    // Login Class Constuctor
    public Login() {
       this.username = username; 
       this.password = password; 
    }
    
    public void setUsername(String newUsername)
    {
        username = newUsername;
    }
    
    public void setUserPassword(String newPassword)
    {
        password = newPassword;
    }
    
      
   public String getUsername()
    {
       return username;
    }
  
    public String getUserPassword()
    {
       return password;
    }
    
    public String accountValidation()
    {
     if (username.contains(defaultUsername) && password.contains(defaultPassword))
        {
            isValidated = "True";
            
        }
        return isValidated; 
    }
    
}
