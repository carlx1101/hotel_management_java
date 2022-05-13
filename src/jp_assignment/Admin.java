/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jp_assignment;

/**
 *
 * @author Carl
 */
public class Admin {
    
    protected String defaultUsername = "Admin";
    protected String defaultPassword = "Admin";
    
    public void returnAdminMenu()
    {
        ActionClass ac = new ActionClass();
        ac.returnMenu();
    }
    
}
