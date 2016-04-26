/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filepractice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alancerio18
 */
public class FileService {

    private TextFileReader reader;
    private TextFileWriter writer; 

    public FileService() {
    }

    public List getData(String filePath)
            throws FileNotFoundException, IOException {

        return reader.getData(filePath);
    }
      public void setData(String filePath, List data) throws FileNotFoundException, IOException {
         
        writer.setData(filePath,data);
    }

    public TextFileReader getReader() {
        return reader;
    }

    public void setReader(TextFileReader reader) {
        this.reader = reader;
    }

    public TextFileWriter getWriter() {
        return writer;
    }

    public void setWriter(TextFileWriter writer) {
        this.writer = writer;
    }
    
    
}
