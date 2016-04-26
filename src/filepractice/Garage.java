/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filepractice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alancerio18
 */
public class Garage {
    private String name;
    private double totalHours;
    private double TotalFees;

    public FileService getFileService() {
        return fileService;
    }

    public void setFileService(FileService fileService) {
        this.fileService = fileService;
    }
    
    
    private FileService fileService;

    public Garage(String name) {
        this.name = name;
        fileService = new FileService();
    }
    
    public List getData(String filePath) throws IOException{
        return fileService.getData(filePath);
    }
    
    public void setData(String filePath, List data) throws IOException {
       System.out.println(data.get(3));
        fileService.setData(filePath,data);
        System.out.println(data.get(3));
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    public double getTotalFees() {
        return TotalFees;
    }

    public void setTotalFees(double TotalFees) {
        this.TotalFees = TotalFees;
    }
    
    
}
