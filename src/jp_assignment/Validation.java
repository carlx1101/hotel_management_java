/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jp_assignment;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Carl
 */
public class Validation {
    private String emailAddress; 
    
    public static boolean emailAddressValidation(String emailInput)
    {
        String emailRegrex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPattern = Pattern.compile(emailRegrex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPattern.matcher(emailInput);
        return matcher.find();
    }
    
    public static boolean roomAvailable(String roomNumber)
    {
        String line; 
        String searchRoomNumber = roomNumber;
      
        String filePath = "C:\\Users\\Carl\\Documents\\NetBeansProjects\\JP_Assignment\\src\\jp_assignment\\Database\\Rooms.txt";
        
        ArrayList<String> tempArray = new ArrayList<>();
        try 
        {
            try (FileReader fr = new FileReader(filePath) )
            {
                Scanner reader = new Scanner(fr);
                String[] lineArr;
                
                while ((line = reader.nextLine()) != null)
                {
                    lineArr = line.split(",");
                    if (lineArr[0].equals(searchRoomNumber) && lineArr[2].equals("Reserved") || lineArr[2].equals("Occupied")  )
                    {
                        
                        ActionClass ac = new ActionClass();
                        ac.showInvalidMessage("Room Has Reserved and Occupied ");
                        return false; 
                         
                    }
                    fr.close();
                }
            }
            catch (Exception e)
            {
                
            }
        }catch (Exception e)
        {
            
        }
        return true; 
    }
    
    public static boolean passportValidation(String passporNumber)
    {
        String passportRegrex = "^(?!^0+$)[a-zA-Z0-9]{12}$";
        Pattern passportPattern = Pattern.compile(passportRegrex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = passportPattern.matcher(passporNumber);
        return matcher.find();
    }
    
    
    
}
