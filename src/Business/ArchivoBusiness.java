/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.ArchivoData;
import Domain.Pelicula;
import java.io.IOException;
<<<<<<< HEAD
=======
import java.util.List;
>>>>>>> 78b944b0a7fb18e17acfd96e816c7d6acb0d12a1

/**
 *
 * @author jeannette
 */
public class ArchivoBusiness {
    ArchivoData archivoData;

    public ArchivoBusiness() {
        archivoData = new ArchivoData();
    }
    
<<<<<<< HEAD
    public void recuperarDelArchivo() throws IOException {
        this.archivoData.leerArchivo();
    }
    public void insertarArchivo(Pelicula pelicula) throws IOException {
        this.archivoData.insertarPelicula(pelicula);
    }
=======
//    public List<Pelicula> recuperarDelArchivo() throws IOException {
//        return this.archivoData.recuperarDelArchivo();
//    }
    
    
    
>>>>>>> 78b944b0a7fb18e17acfd96e816c7d6acb0d12a1
}
