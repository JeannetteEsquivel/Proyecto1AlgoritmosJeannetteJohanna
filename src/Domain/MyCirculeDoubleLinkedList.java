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
public class MyCirculeDoubleLinkedList {
    
    private MyNodeCountry head;
    private MyNodeCountry tail;
    private MyNodeCountry node;
    private int size;

    public MyCirculeDoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }//constructor

    public void insertInOrder(Pelicula pelicula) {
        MyNodeCountry newNodeCountry = new MyNodeCountry(pelicula);
        MyNodeCountry node = this.getHead();

        while (node != null && node.getPelicula().getTitulo().compareTo(newNodeCountry.getPelicula().getTitulo()) < 0) {
            if (node == this.getTail()) {
                break;
            }//if para saber si llego al final de la lista
            node = node.getNext();
        }//while para recorrer la lista
        //preguntar porque se detuvo
        if (getSize() == 0) {
            this.setHead(newNodeCountry);
            this.setTail(newNodeCountry);
            this.getTail().setNext(this.getHead());
            this.getHead().setPrev(this.getTail());
        } else {
            if (node == this.getHead()) {
                if (node.getPelicula().getTitulo().compareTo(newNodeCountry.getPelicula().getTitulo()) > 0) {
                    newNodeCountry.setNext(this.getHead());
                    newNodeCountry.setPrev(this.getTail());
                    this.getHead().setPrev(newNodeCountry);
                    this.setHead(newNodeCountry);
                    this.getTail().setNext(this.getHead());
                    this.getHead().setPrev(this.getTail());
                } else {
                    newNodeCountry.setPrev(this.getHead());
                    newNodeCountry.setNext(this.getTail());
                    this.getHead().setNext(newNodeCountry);
                    this.setTail(newNodeCountry);
                    this.getTail().setNext(this.getHead());
                    this.getHead().setPrev(this.getTail());
                }//if si el nuevo nodo va antes o despues de head
            } else {
                if (node == this.getTail() && node.getPelicula().getTitulo().compareTo(newNodeCountry.getPelicula().getTitulo()) < 0) {
                    newNodeCountry.setPrev(this.getTail());
                    newNodeCountry.setNext(this.getHead());
                    this.getTail().setNext(newNodeCountry);
                    this.setTail(newNodeCountry);
                    this.getHead().setPrev(this.getTail());
                    this.getTail().setNext(this.getHead());
                } else {
                    node.getPrev().setNext(newNodeCountry);
                    newNodeCountry.setPrev(node.getPrev());
                    newNodeCountry.setNext(node);
                    node.setPrev(newNodeCountry);
                }//if para saber si el nuevo nodo va despues de tail o esta en medio de la lista
            }//if el en que posicion va el nuevo nodo
        }//if la lista esta llena o no
        this.setSize(this.getSize() + 1);
    }//fin method

    public void deleteFromList(String countryName) {
        MyNodeCountry temp = this.getHead();
        if (this.getSize() > 0) {
            while (!temp.getPelicula().getTitulo().equals(countryName)) {
                temp = temp.getNext();
            }//fin while
            //preguntar porque se detuvo
            if (this.getSize() == 1 && temp == this.getHead() && temp == this.getTail()) {
                this.setHead(null);
                this.setTail(null);
                this.setSize(this.getSize() - 1);
            } else {
                if (temp == this.getHead()) {
                    this.setHead(this.getHead().getNext());
                    this.getTail().setNext(this.getHead());
                    this.getHead().setPrev(this.getTail());
                    this.setSize(this.getSize() - 1);
                } else {
                    if (temp == this.getTail()) {
                        this.setTail(this.getTail().getPrev());
                        this.getHead().setPrev(this.getTail());
                        this.getTail().setNext(this.getHead());
                        this.setSize(this.getSize() - 1);
                    } else {
                        temp.getPrev().setNext(temp.getNext());
                        temp.getNext().setPrev(temp.getPrev());
                        this.setSize(this.getSize() - 1);
                    }//if para saber si es tail o no
                }//if para saber si es head o no
            }//if para saber si hay 1 o mas valores
        }//if para saber si la lista tiene algun valor
    }//end method

    public void printList() {
        MyNodeCountry temp = this.getHead();
        System.out.println("List size: " + this.getSize());
        System.err.print(this.getTail().getPelicula().getTitulo()+ "<-->");
        if (this.getSize() > 0) {
            while (temp != this.getTail()) {
                System.err.print(temp.getPelicula().getTitulo()+ "<-->");
                temp = temp.getNext();
                if (temp == this.getTail()) {
                    System.err.print(temp.getPelicula().getTitulo()+ "<-->");
                }//if
            }//while
            System.err.println(this.getHead().getPelicula().getTitulo());
        }//if
    }//end Method

    public MyNodeCountry getHead() {
        return head;
    }

    public void setHead(MyNodeCountry head) {
        this.head = head;
    }

    public MyNodeCountry getTail() {
        return tail;
    }

    public void setTail(MyNodeCountry tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MyNodeCountry getNode() {
        return node;
    }

    public void setNode(MyNodeCountry node) {
        this.node = node;
    }

}//end class
