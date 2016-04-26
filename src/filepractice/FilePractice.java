/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filepractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jennifer 
 */
public class FilePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "src" + File.separatorChar + "List.txt";

        File file = new File(path);

        Garage garage = new Garage("Jen's garage");
        
        garage.getFileService().setReader(new GarageTotalsReader());
        List data = garage.getData(path);
        double totalHours = Double.parseDouble(data.get(0).toString());
        double totalFees = Double.parseDouble(data.get(1).toString());
        garage.setTotalFees(totalFees);
        garage.setTotalHours(totalHours);

        System.out.println("Garage totals: Total hours = " + garage.getTotalHours());
        System.out.println("Garage total fees = " + garage.getTotalFees());
        
        
        double newHours = 34.5;
        double newFees = 124.5;
        data.add(newHours);
        data.add(newFees);
      // was getting null pointer at filePractice.setData becuase I did not have this 
         garage.getFileService().setWriter(new GarageTotalsWriter());
        garage.setData(path, data);
        data = garage.getData(path);
        for(Object d: data){
            System.out.println(d);
        }

//         if(file.exists()){
//             System.out.println("Found file");
//         }else{
//             System.out.println("Can't find file");
//         }
    }

}
