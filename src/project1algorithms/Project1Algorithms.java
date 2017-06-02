/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1algorithms;

import Data.ArchivoData;
import Domain.Pelicula;
import java.awt.Window;
import java.io.IOException;

/**
 *
 * @author jeannette
 */
public class Project1Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
//        ArchivoData archivo =new ArchivoData();
//        Pelicula pelicula=new Pelicula(0, "titulo2", "genero", 0, 0, 0);
//        archivo.insertar(pelicula);
        Window window=new GUI.Window();
        window.setVisible(true);
        ArchivoData archivoData = new ArchivoData();
        archivoData.leerArchivo();
        
    }
    
}