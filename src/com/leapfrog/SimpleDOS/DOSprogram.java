/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.SimpleDOS;

import com.leapfrog.SimpleDOS.DOScommand.DOScommand;
import com.leapfrog.SimpleDOS.DOScommand.DOSfactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class DOSprogram {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = "";
            File file = new File(".");
            String path = file.getAbsolutePath();
            System.out.print(path + ">");
            while (!(line =reader.readLine()).equalsIgnoreCase("exit")) {
                
               String[] tokens = line.split(" ");
               DOScommand cmd =DOSfactory.get(tokens[0]);
                
                if(cmd!=null){
                    cmd.execute(tokens);
                }
                else{
                    System.out.println("Invalid Command");
                }
                
                System.out.print(path + ">");
                

            }

        } catch (IOException ioe) {

        }
    }

}
