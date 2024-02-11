/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multtextweb;

import java.awt.Component;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author lu
 */
public    class choisFile extends JFileChooser {
   
    
    
   public  choisFile(){
          FileFilter filter = new FileNameExtensionFilter(" File PDF", new String[] {"pdf"});
       this.setFileFilter(filter);
        this.addChoosableFileFilter(filter);
    }
    
   
   
   
   
   
    

}
 