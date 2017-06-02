/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Business.ArchivoBusiness;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author jeannette
 */
public class ManejoLista {
    
    private ArchivoBusiness archivoBusiness;
    private MyCirculeDoubleLinkedList myCirculeDoubleLinkedList;
    List<Pelicula> list;

    public ManejoLista() throws IOException {
        //list = archivoBusiness.recuperarDelArchivo();
        clasificarLista();
    }
    
    
    
    public void clasificarLista() {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getGenero().equals(1000)){
                myCirculeDoubleLinkedList.insertInOrder(list.get(i));
            }
            
        }//for i
        
    }
    
    
}
