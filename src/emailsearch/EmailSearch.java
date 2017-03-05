/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package emailsearch;

import java.io.*;

/**
 *
 * @author ryan
 */
public class EmailSearch {
    
    private String email;
    File emailList;
    
    public EmailSearch(String emailAddress, File emailList){
        this.email = emailAddress;
        this.emailList = emailList;
    }
    
    public boolean startSearch(){
        
        
        
        try(BufferedReader br = new BufferedReader(new FileReader(this.emailList.toString())))
        {
            
            
            String line = ""; 
            
            
            while((line = br.readLine()) != null)
            {
                // Remove the email addresses
                if(line.contains(email)){
                    return true;
                }
                
                
            }
        } catch (IOException ex)
        {
            System.out.println("Error:  " + ex);
        }
        
        return false;
    }
}
