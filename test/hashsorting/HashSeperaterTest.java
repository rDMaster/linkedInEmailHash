/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashsorting;

import java.nio.file.Path;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.*;
import java.nio.file.Files;

/**
 *
 * @author ryan
 */
public class HashSeperaterTest
{
    
   

    /**
     * Test 
     */
    @Test
    public void seperateTest1()
    {
        // set up fixture and input
        File path = new File("testFile.txt");
        HashSeperater seperater;
       
        // send test message
        try
        {
            seperater = new HashSeperater(path.toPath());
            seperater.seperateFile();
            
            // check results
            assert seperater.getOutputPath().toFile().exists() && (Files.size(path.toPath()) != 0) ;
                    
            // remove test file
            seperater.getOutputPath().toFile().deleteOnExit();
            
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        
        
    }
    
}
