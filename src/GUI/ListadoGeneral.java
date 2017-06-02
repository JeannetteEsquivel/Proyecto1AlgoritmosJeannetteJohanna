/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Domain.MyCirculeDoubleLinkedListDrama;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author johana
 */
public class ListadoGeneral extends JInternalFrame implements ActionListener{

    private JTextField jtfID;
    private JTextField jtfNombre;

    private JLabel jlblID;
    private JLabel jlblNombre;

    private JButton jbtnRegistrar;

    public ListadoGeneral() {
        super();
        this.setSize(400, 400);
        this.setLayout(new FlowLayout());
        init();
        this.setVisible(true);
    }

    private void init() {
        this.jlblID = new JLabel("ID Genero: ");
        this.add(this.jlblID);
        this.jtfID = new JTextField(10);
        this.add(this.jtfID);

        this.jlblNombre = new JLabel("Nombre Genero: ");
        this.add(this.jlblNombre);
        this.jtfNombre = new JTextField(10);
        this.add(this.jtfNombre);

        this.jbtnRegistrar = new JButton("Registrar ");
        this.jbtnRegistrar.addActionListener(this);
        this.add(this.jbtnRegistrar);

        this.setClosable(true);

    }//metodo

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtnRegistrar) {

            
                MyCirculeDoubleLinkedListDrama myCirculeDoubleLinkedListDrama=new MyCirculeDoubleLinkedListDrama();
                
        }

    }
    
}
