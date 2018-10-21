/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steganografi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Rahmad Nurhuda
 */


public class Controller {
    String pesan = "";
    File dirGambarKom;
    steganografi.UserInterface ui = new steganografi.UserInterface();
    
    public void SelectText(){
        String dir1 = null;
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(null);
        try{
           jfc.addChoosableFileFilter(new FileNameExtensionFilter("text file", "txt"));
           File file = jfc.getSelectedFile();
           String dir = file.getAbsolutePath();
           dir1=dir;
           txtTeks.setText(dir);
        }catch(Exception E){
           JOptionPane.showMessageDialog(null, "Pilih file text");
        }
        File file = new File(dir1);
        BufferedReader br = null; 
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
        }

        String st; 
        try {
            while ((st = br.readLine()) != null){
                pesan += st+"\n";
            }
        } catch (IOException ex) {
            Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Plainteks :\n " + pesan );
    }
    
    public void SelectImageKompres(){
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(null);
        try{
           jfc.setFileFilter(new ImageFilter());
           File file = jfc.getSelectedFile();
           dirGambarKom = file;
           String dir = file.getAbsolutePath(); 
           txtGambar.setText(dir);
        }catch(Exception E){
           JOptionPane.showMessageDialog(null, "Silahkan Pilih file gambar");
        } 
    }
}
