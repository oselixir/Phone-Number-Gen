/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mentorship_01;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author OSE
 */
public class AsignmentMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Assignment_01 codeTest = new Assignment_01();
        
        codeTest.generate();
        codeTest.sortNumbers();
        
        codeTest.printSorted();
        
        try {
            codeTest.saveToFile(codeTest.getNumberFile());
            System.out.println("Successfully saved!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
