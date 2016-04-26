/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filepractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alancerio18
 */
public class GarageTotalsReader implements TextFileReader {

    @Override
    public List getData(String filePath) throws FileNotFoundException, IOException {
        File file = new File(filePath);
        BufferedReader input = null;
        List lines = new ArrayList<>();

        input = new BufferedReader(new FileReader(file));
        
         String line = input.readLine();
        int counter = 0;
        while (line != null) {
            if (counter == 0) {
                double totalHours = Double.parseDouble(line);
                lines.add(totalHours);
            } else  {
                double totalFees = Double.parseDouble(line);
                lines.add(totalFees);
            }
            counter++;
            line = input.readLine();

        }
        input.close();
    
        return lines;
    }
}
