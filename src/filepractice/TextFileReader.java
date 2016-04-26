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
 * @author alancerio18
 */
public interface TextFileReader {

    List getData(String filePath) throws FileNotFoundException, IOException;
    
}
