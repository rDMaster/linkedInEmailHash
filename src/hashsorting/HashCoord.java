/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hashsorting;

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
public class HashCoord {

    
    private HashFileSplitter splitter;
    private HashSeperater seperater;
    private List<String> splitFileList;
    private Path filePath;
    
    /**
     * 
     */
    public HashCoord() {splitFileList = new ArrayList<>();}
    
    /**
     * 
     * @param file 
     */
    public void setHashFile(Path file) {filePath = file;}
    
    /**
     * 
     * @return filePath
     */
    public Path getHashFile() {return filePath;}
    
    
    
    // File Splitter methods
    ///////////////////////
    /**
     * 
     */
    public void newSplitter() {splitter = new HashFileSplitter(filePath);}
    
    public void SplitFile() {splitter.SplitFile();}
    
    public void setHashesPerFile(long count) {splitter.setHashesPerFile(count);}
    
    public File getDir() {return splitter.getDir();}
    
    // Hash seperater methods
    ////////////////////////

    /**
     *
     * @throws IOException
     * @throws FileAlreadyExistsException
     */
    public void newSeperater() throws IOException , FileAlreadyExistsException
    {
         seperater = new HashSeperater(filePath);
    }
    
    
    public void seperateHashes() {seperater.seperateFile();}
        
    public long getHashCount() {return seperater.getHashCount();}
    
    public Path getOutputPath() {return seperater.getOutputPath();}
    
    
     

}

