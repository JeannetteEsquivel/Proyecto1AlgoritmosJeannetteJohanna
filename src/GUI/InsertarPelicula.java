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
public class InsertarPelicula extends JInternalFrame implements ActionListener {

    private JLabel jlbNombre;
    private JTextField jtfNombre;
    private JLabel jlbGenero;
    private JTextField jtfGenero;
    private JLabel jlbCodigo;
    private JTextField jtfCodigo;
    private JLabel jlbSubtitulo;
    private JTextField jtfSubtitulo;
    private JLabel jlbPremier;
    private JTextField jtfPremier;
    
    private JButton jbtIngresar;

    public InsertarPelicula() {
        super();
        this.setLayout(null);
        this.setSize(new Dimension(250, 200));
        this.setClosable(true);
        init();
        this.setVisible(true);
    }

    private void init() {
        
        this.jlbNombre = new JLabel("Nombre: ");
        this.jlbNombre.setBounds(10,10, 200, 100);
        this.add(this.jlbNombre);
        this.jtfNombre = new JTextField(10);
        this.jtfNombre.setBounds(90, 50, 100, 20);
        this.add(this.jtfNombre);

        this.jlbGenero = new JLabel("Genero: ");
        this.jlbGenero.setBounds(10,30, 100, 100);
        this.add(this.jlbGenero);
        this.jtfGenero = new JTextField(10);
        this.jtfGenero.setBounds(90, 70, 100, 20);
        this.add(this.jtfGenero);
        
        this.jlbCodigo = new JLabel("Codigo: ");
        this.jlbCodigo.setBounds(10,50, 100, 100);
        this.add(this.jlbCodigo); 
        this.jtfCodigo = new JTextField(10);
        this.jtfCodigo.setBounds(90, 90, 100, 20);
        this.add(this.jtfCodigo);

        this.jbtIngresar = new JButton("Ingresar");
        this.jbtIngresar.setBounds(20,120, 100, 100);
        this.jbtIngresar.addActionListener(this);
        this.jbtIngresar.setBounds(65, 120, 100, 20);
        this.add(this.jbtIngresar);
       

    }//init

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
