/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.SimpleDOS.DOScommand;

/**
 *
 * @author Prabishan
 */
public class DOSfactory {
    
    public static DOScommand get(String a){
        if(a.equalsIgnoreCase("md")){
            return new mdCommand();
        }else if(a.equalsIgnoreCase("rd")){
        return new RdCommand();
    }
        else if(a.equalsIgnoreCase("ren")){
            return new RenameCommand();
        
        }
        else if (a.equalsIgnoreCase("copy")){
            return new CopyCommand();
        }
        else if (a.equalsIgnoreCase("move")){
            return new MoveCommand();
        }
        else if(a.equalsIgnoreCase("dir")){
            return new DirCommand();
        }      
        else if(a.equalsIgnoreCase("vi")){
             return new ViCommand();
                    }
        return null;
        }
        
    }
    

