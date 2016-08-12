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
public class RenameCommand extends DOScommand{

    @Override
    public void execute(String[] cmd) {
        new File(cmd[1]).renameTo(new File (cmd[2]));
    }
    
}
