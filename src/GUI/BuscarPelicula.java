/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author johana
 */
public class BuscarPelicula extends JInternalFrame implements ActionListener{
    private JLabel jlbPelicula;
    private JTextField jtfPelicula;
    private JButton jbtnBuscar;
    
    public BuscarPelicula(){
        super();
        this.setLayout(new FlowLayout());
        this.setSize(new Dimension(200, 150));
        this.setClosable(true);
        init();
        this.setVisible(true);
    }
    
     private void init() {
    this.jlbPelicula = new JLabel("NombrePelicula: ");
    this.add(this.jlbPelicula);
    this.jtfPelicula = new JTextField(10);
    this.add(this.jtfPelicula);
    
    this.jbtnBuscar = new JButton("Buscar");
    this.jbtnBuscar.addActionListener(this);
    this.add(this.jbtnBuscar);

  }//init
  
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
