/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author jeannette
 */
public class Window extends JFrame implements ActionListener{
        
    private JDesktopPane escritorio;
    private JMenuBar jmb;
    private JMenu cargarListas, buscar, listadoGeneral, insertarPelicula;
    private JMenuItem cargarL, bPelicula, listaGeneral, iPelicula;

    public Window() {
        super("Menú Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450, 450);
        init();
    }//

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public void init() {

        this.jmb = new JMenuBar();
        this.setJMenuBar(jmb);

        this.cargarListas = new JMenu("Cargar");
        jmb.add(cargarListas);

        this.buscar = new JMenu("Buscar");
        jmb.add(buscar);

        this.insertarPelicula = new JMenu("Insertar");
        jmb.add(insertarPelicula);

        this.listadoGeneral = new JMenu("Listado");
        jmb.add(listadoGeneral);

        this.cargarL = new JMenuItem("Cargar_Lista");
        cargarL.addActionListener(this);
        cargarListas.add(cargarL);

        this.bPelicula = new JMenuItem("Buscar_Pelicula");
        bPelicula.addActionListener(this);
        buscar.add(bPelicula);

        this.listaGeneral = new JMenuItem("Lista_General");
        listaGeneral.addActionListener(this);
        listadoGeneral.add(listaGeneral);

        this.iPelicula = new JMenuItem("Insertar_Pelicula");
        iPelicula.addActionListener(this);
        insertarPelicula.add(iPelicula);

        escritorio = new JDesktopPane();
        //escritorio.setSize(800,600);
        this.add(escritorio);
        this.setVisible(true);
        this.setResizable(true);
    }//init

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == cargarL) {
            CargarLista cL= new CargarLista();
//            escritorio.add(cL);
        }
         if (e.getSource() == bPelicula) {
            BuscarPelicula i = new BuscarPelicula();
            escritorio.add(i);
        } 
         if (e.getSource() == listaGeneral) {
            ListadoGeneral lg = new ListadoGeneral();
//            escritorio.add(lg);
        }         
        if (e.getSource() == iPelicula) {
            InsertarPelicula iP = new InsertarPelicula();
            escritorio.add(iP);
        }
    }
    
   
}
