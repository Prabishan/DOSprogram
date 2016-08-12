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
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Prabishan
 */
public class ViCommand extends DOScommand {

    @Override
    public void execute(String[] cmd) {
        Scanner vi= new Scanner(System.in);
       
        try{
       
        String line ="";
        line = vi.nextLine();
        StringBuilder content = new StringBuilder();
        while(!(line=vi.nextLine()).equalsIgnoreCase("exit")){
            content.append(line).append("\r\n");
            
        }
        vi.close();
        FileWriter writer = new FileWriter(cmd[1]);
        writer.write(content.toString());
        writer.close();
        }
        catch(IOException ioe){
            ioe.getMessage();
            
        }
      
    }
    
}
