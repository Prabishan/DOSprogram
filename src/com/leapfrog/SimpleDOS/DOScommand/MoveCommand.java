/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.SimpleDOS.DOScommand;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Prabishan
 */
public class MoveCommand extends DOScommand{

   
    public void execute(String[] cmd) {
       try{
        BufferedReader reader = new BufferedReader(new FileReader(cmd[1]));
        String line ="";
        StringBuilder content = new StringBuilder();
        while((line=reader.readLine())!=null){
            content.append(line).append("\r\n");
            
        }
        reader.close();
        FileWriter writer = new FileWriter(cmd[2]);
        writer.write(content.toString());
        writer.close();
        
        File file=new File(cmd[1]);
        file.delete();
            
           

        } catch (IOException ioe) {
            ioe.getMessage();
        }
    }
    
    
}
