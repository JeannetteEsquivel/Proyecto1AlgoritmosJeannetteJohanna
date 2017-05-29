/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author jeannette
 */
public class MyNodeCountry {

    private Pelicula pelicula;
    private MyNodeCountry next;
    private MyNodeCountry prev;

    public MyNodeCountry(Pelicula pelicula) {
        this.pelicula = pelicula;
        this.next = null;
        this.prev = null;
    }//constructor

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public MyNodeCountry getNext() {
        return next;
    }

    public void setNext(MyNodeCountry next) {
        this.next = next;
    }

    public MyNodeCountry getPrev() {
        return prev;
    }

    public void setPrev(MyNodeCountry prev) {
        this.prev = prev;
    }
}//class
