/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailsearch;

import java.io.File;
import org.junit.Test;

/**
 *
 * @author ryan
 */
public class EmailSearchTest {
    
    private final String validEmail = "rohan_varsha@yahoo.co.in";
    private final String invalidEmail = "jimbo...1325com";
    private final String validEmailFail = "randy12345@fe3nce.com";
    private final File testFile = new File("testFile.txt");
    private EmailSearch searcher;
    
    /**
     * Test 1
     */
    @Test
    public void emailSearchValidFailTest()
    {
        // set up fixture and input
        searcher = new EmailSearch(validEmailFail, testFile);
       
        // send test message
        assert !searcher.startSearch();
        
        
    }
    
    /**
     * Test 2
     */
    @Test
    public void emailSearchValidTest()
    {
        // set up fixture and input
        searcher = new EmailSearch(validEmail, testFile);
       
        // send test message
        assert searcher.startSearch();
        
        
    }
    
    /**
     * Test 3
     */
    @Test
    public void emailSearchInvalidTest()
    {
        // set up fixture and input
        searcher = new EmailSearch(invalidEmail, testFile);
       
        // send test message
        assert !searcher.startSearch();
        
        
    }
}
