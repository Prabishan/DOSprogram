/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.SimpleDOS.DOScommand;

import java.io.File;

/**
 *
 * @author Prabishan
 */
public class DirCommand extends DOScommand {

    @Override
    public void execute(String[] cmd) {
        
        String path=(cmd.length==1)?".":cmd[1];
        File file = new File(path);
        for(File f:file.listFiles()){
            System.out.println(f);
        }
    
}
}