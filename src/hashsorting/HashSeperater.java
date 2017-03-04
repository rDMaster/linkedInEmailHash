/**
 * This class is responsible for removing the email addresses
 * from the hash file.
 * I have zero interest in email addresses so they will be
 * removed from my files.
 * Output files will be created in the directory C:\\HashSeperaterOutput 
 */

package hashsorting;

import java.util.*;
import java.io.*;
import java.net.URI;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;



/**
 *
 * @author ryan
 */
public class HashSeperater {

    private Path hashFile;
    private long hashCount;
    private File dir;
    private File file;
    
    /**
     * 
     * @param hashFile
     * @throws IOException
     * @throws FileAlreadyExistsException if the directory already exists
     */
    public HashSeperater(Path hashFile) throws IOException , FileAlreadyExistsException
    {
        this.hashFile = hashFile;
        this.hashCount = 0;
        this.dir = new File("C:\\HashSeperaterOutput");
        if(!Files.exists(this.dir.toPath()))
        {
            Files.createDirectory(dir.toPath());
        }

        this.file = new File(dir + "\\outputFile" + hashFile.getFileName().toString());
    }
    
    /**
     * 
     * @return 
     */
    Path getOutputPath(){return file.toPath();}
    /**
     * Reads the hash file, removes the email addresses
     * and writes to new file.
     */
    void seperateFile()
    {
        
        
    }
    
    
    /**
     * Returns the total hashCount/lineCount of the output file
     * 
     * @return hashCount
     */
    long getHashCount(){return hashCount;}
    
    
    
     
}

