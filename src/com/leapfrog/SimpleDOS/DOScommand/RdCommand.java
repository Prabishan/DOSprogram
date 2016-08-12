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
public class RdCommand extends DOScommand {

    @Override
    public void execute(String[] cmd) {
        new File(cmd[1]).delete();
    }

}
