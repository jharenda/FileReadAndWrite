/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filepractice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jennifer
 */
public class GarageTotalsWriter implements TextFileWriter {

    @Override
    public void setData(String filePath, List data) throws FileNotFoundException, IOException {
        boolean append = true;   // you can change this

        // This references the file in the working directory
        //this is where I would pass in filepath
        File file = new File(filePath);

       

        // This is where we setup our streams (append = false means overwrite)
        // new FileWriter() creates the file if doesn't exit
        PrintWriter out = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(file, append)));
 List<Double> dataArray = new ArrayList<>(data);
        for (Double fileData : dataArray) {

           out.println(String.valueOf(fileData));
        }
        // }
         out.close();  // be sure you close your streams when done!!
        System.out.println("Wrote file to: " + file.getAbsolutePath());
    }
}
