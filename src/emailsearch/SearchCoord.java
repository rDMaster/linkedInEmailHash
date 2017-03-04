/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailsearch;

import hashsorting.HashFileSplitter;
import hashsorting.HashSeperater;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ryan
 */
public class SearchCoord {
    

    private String email;
    private EmailSearch searcher;
    private List<String> emailList;
    private Path filePath;
    
    /**
     * 
     * @param email
     */
    public SearchCoord() {
        
        emailList = new ArrayList<>();
    }
    
    /**
     * 
     * @param file 
     */
    public void setEmailFile(Path file) {this.filePath = file;}
    
    /**
     * 
     */
    public void setEmailAddress(String email) {this.email = email;}
    
    
    /**
     * File search method calling EmailSearch
     */
    public boolean beginEmailSearch(){
        
        searcher = new EmailSearch(email, filePath.toFile());
            
        return searcher.startSearch();
    }
    
    
    
    
    
}

