/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashsorting;

import java.io.File;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 *
 * @author ryan
 */
public class HashSplitterTest
{
    /**
     * Test 
     */
    @Test
    public void splitterTest1()
    {
        // set up fixture and input
        File path = new File("testFile.txt");
        HashFileSplitter splitter;
       
        // send test message
        
        splitter = new HashFileSplitter(path.toPath());
        splitter.SplitFile();

        // check results
        assert splitter.getDir().exists();

        // remove test file
        splitter.getDir().deleteOnExit();
            
        
        
        
    }
    
}
