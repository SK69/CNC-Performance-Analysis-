
package filereaderexample;

import java.io.*;

public class FileReaderExample {

    public static void main(String[] args) {
        
try
{
//make a 'file' object 
    File file = new File("H:\\7th sem\\New Text Document (2).txt");
//Get data from this file using a file reader. 
    FileReader fr = new FileReader(file);
//To store the contents read via File Reader
    BufferedReader br = new BufferedReader(fr);                                                 
//Read br and store a line in 'data', print data
    String data;
    while((data=br.readLine( )) != null) 
{
    //data = br.readLine( );                                     
    System.out.println(data);
}                                
}
        catch(IOException e){System.out.println("bad !");
                }
 
}
    }
    
