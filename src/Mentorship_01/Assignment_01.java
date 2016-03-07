/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mentorship_01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 *
 * @author OSE
 */
public class Assignment_01 {
    //This code try to make code reusable as possible
    private static final int numberCount = 10;
    
    List<Integer> list = new ArrayList<>();
    HashSet<String> set = new HashSet<>();
    
    String[] numbers = new String[numberCount];
    String[][] sortedNumbers = new String[numberCount][2];
    StringBuilder numberFile = new StringBuilder("");
    
    
    FileWriter fileWriter;
    PrintWriter printWriter;

    
    
    public void generate() {
        // to generate a set of numberCount phone Numbers

        while (set.size() < numberCount) {
            int firstPref = 7 + (int) (Math.random() * 3);
            int secondPref = (int) (Math.random() * 2);
            int realNumber = 10000000 + (int) (Math.random() * 99999999);
           set.add(""+firstPref + secondPref + realNumber);
           //.set.add(""+realNumber);
        }

        numbers = set.toArray(new String[set.size()]);
        
    }
    
   
    public void printSorted(){
        //print value into a Stringbuilder file
        int roller = 0; //:( roller? wut
        
        while(roller < sortedNumbers.length){
            numberFile.append(sortedNumbers[roller][0]);
            numberFile.append(" : ");
            numberFile.append(sortedNumbers[roller][1]);
            numberFile.append("\t");
            numberFile.append("\n");
            roller++;
        }
    }
    //sorts numbers into different number types
    public void sortNumbers(){

        int counter = 0;
        while(counter < numberCount){
            if(numbers[counter].startsWith("805")||numbers[counter].startsWith("807")||numbers[counter].startsWith("705")||numbers[counter].startsWith("707")){
                sortedNumbers[counter][0] = "0"+numbers[counter];
                sortedNumbers[counter][1] = "GLO";
            }else if(numbers[counter].startsWith("803")||numbers[counter].startsWith("806")||numbers[counter].startsWith("813")||numbers[counter].startsWith("703")){
                sortedNumbers[counter][0] = "0"+numbers[counter];
                sortedNumbers[counter][1] = "MTN";
            }else{
                sortedNumbers[counter][0] = "0"+numbers[counter];
                sortedNumbers[counter][1] = "AIRTEL";
            }
            
            counter++;
        }
        
    }
    //sends file to output location
    public void saveToFile(String doc) throws IOException{
        // to save list of Phone Numbers to a file
        File file = new File("Phone Number.txt");
        fileWriter = new FileWriter(file, false);
        fileWriter.write(doc);
        
        printWriter = new PrintWriter(fileWriter);
        
        fileWriter.flush();
    }
    
    //return a String value to be used as file
    public String getNumberFile(){
        return String.valueOf(numberFile);
    }
    
}
