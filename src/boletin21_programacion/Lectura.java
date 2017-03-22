
package boletin21_programacion;

import java.io.File; 
import java.io.FileWriter;  
import java.io.IOException; 
import java.io.PrintWriter; 
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.Scanner; 
import javax.swing.JOptionPane; 

/**
 *
 * @author Brais Núñez
 */
public class Lectura {

    Scanner scan;  File fichero; PrintWriter pw =null; 
 
    ArrayList <String> grupopalabras = new ArrayList<>(); 

    public void escribirFichero(){ 

        fichero = new File ("lectura.txt");

        try { 

        pw = new PrintWriter(new FileWriter(fichero,true)); 

        for(int i=0;i<grupopalabras.size();i++){ 
            
         pw.print(grupopalabras.get(i)+""); 
        
        } 
            pw.println(); 

        } catch (IOException ex) { 
            
            System.out.println("El fichero no ha sido encontrado "+ex); 
        } 
        
        finally{ 
        
            pw.close(); 
        } 
    } 


 
    public void visualizarPalabras(){ 

    scan = new Scanner("lectura.txt"); fichero = new File("lectura.txt"); 

        String palabras  = JOptionPane.showInputDialog("Escribe la palabra"); 
        JOptionPane.showMessageDialog(null,palabras); 
        palabras = scan.nextLine(); 
        String cadena[]= palabras.split(" "); 

        for(int i=0;i<cadena.length;i++){ 
        grupopalabras.add(cadena[i]); 
    } 
        Collections.sort(grupopalabras); 

        escribirFichero(); 
    } 
} 

