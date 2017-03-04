/**
 * This class will be used to split the larger files of Password 
 * Hashes into smaller easy to manage files.
 * The amount of hashes per file can be specified,
 * will default to 1_000_000
 */

package hashsorting;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author ryan
 */
public class HashFileSplitter {
    
    private long hashesPerFile;
    private long totalHashes;
    private Path hashFile;
    private File dir;
    /**
     * Constructor defaults hashes per File 
     * to 1_000_000
     * @param hashFile
     */
    public HashFileSplitter(Path hashFile)
    {
        this.hashesPerFile = 1_000_000;
        this.hashFile = hashFile;
    }
    
    void setHashesPerFile(long hashesPerFile)   {this.hashesPerFile = hashesPerFile;}
    
    /**
     * Splits the file into multiple files
     * and outputs the to Output folder.
     */
    void SplitFile()
    {
        // br = null;
        // bw = null;
        String outputFileName = "outputhashlist"; 
        String line = "";
        long lineCount = 0;
        int fileCount = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(this.hashFile.toFile())))
        {
            
            
            // find out hashes perFile
            while((line = br.readLine()) != null) {lineCount++;}
            
            //Print the amount of hashes in file
            System.out.println("Hashes in file: " + this.hashFile + " = " + lineCount );
            // get the number of files to create
            fileCount = (int)fileCounter(lineCount);
            
            // create new directory for output files
            dir = new File("C:\\HashSeperaterOutput\\OutputFiles" + this.hashFile.getFileName());
            Files.createDirectory(dir.toPath());
            // Needed to open new buffer to read from // 
            //
            ///
            /// 
            try(BufferedReader br2 = new BufferedReader(new FileReader(this.hashFile.toFile())))
            {
                // read lines for first file and  write file
                // use for loop
            
                for(int i = 0; i <= fileCount; i++)
                {
                    try(BufferedWriter bw = new BufferedWriter(new FileWriter(dir + "\\" +  outputFileName + i + ".txt")))
                    {
                        line = "";
                        // for each line in hashesPerFile , write to file
                        int counter = 0;
                    
                        while(((line = br2.readLine()) != null)&& counter < hashesPerFile)
                        {
                            bw.write(line);
                            bw.newLine();
                            counter++; 
                        } // close while loop
                    
                    }
                    catch(IOException e)
                    {
                        System.err.println(e);
                    }
                
                
                }    // close for loop
                
            }
            
        }
        catch(IOException e)
        {
           System.err.println(e); 
           
        }
        System.out.println("Finished ");
        
    } // close method
    
    File getDir()
    {
        return dir;
    }
    /**
     * Helper method for splitFile
     * @param lineCount
     * @return 
     */
    private int fileCounter(long lineCount)
    {
        int fileCount = 0;
        
        if(lineCount < this.hashesPerFile)
        {
            fileCount = 1;
        }
        else
        {
           fileCount = (int) Math.abs(lineCount / this.hashesPerFile);
        }
        return fileCount;
    }

}

