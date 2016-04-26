/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filepractice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Jennifer
 */
public interface TextFileWriter {
   public void setData(String filePath, List data) throws FileNotFoundException, IOException; 
}
