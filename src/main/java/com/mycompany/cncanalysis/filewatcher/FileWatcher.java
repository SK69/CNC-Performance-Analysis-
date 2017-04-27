/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cncanalysis.filewatcher;
import static com.sun.nio.file.ExtendedWatchEventModifier.FILE_TREE;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardWatchEventKinds.*;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

/**
 *
 * @author Raksha
 */
public class FileWatcher {
      public static void main(String[] args) throws Exception
    {
        FileSystem fs = FileSystems.getDefault();
        WatchService ws = fs.newWatchService();
        Path pTemp = Paths.get("R:\\New Folder");
        String path;
        pTemp.register(ws, new WatchEvent.Kind[] {ENTRY_MODIFY, ENTRY_CREATE, ENTRY_DELETE}, FILE_TREE);
        while(true)
        {
            WatchKey k = ws.take();
            for (WatchEvent<?> e : k.pollEvents())
            {
                Object c = e.context();
                System.out.printf("%s %d %s\n", e.kind(), e.count(), c);
                if(e.kind().toString() == "ENTRY_CREATE" || e.kind().toString() == "ENTRY_MODIFY"){
                    path = pTemp.toString()+ "\\" + c;
                    System.out.println(path);
                    readFile(path);
                }
            }
            k.reset();
        }
    }
      
    public static void readFile(String path){
                  
        try
            {
//make a 'file' object 
                File file = new File(path);
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
