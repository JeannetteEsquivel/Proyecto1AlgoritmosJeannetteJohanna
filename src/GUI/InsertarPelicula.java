/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Business.ArchivoBusiness;
import Domain.Pelicula;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author johana
 */
public class InsertarPelicula extends JInternalFrame implements ActionListener {

    private JLabel jlbCodigo;
    private JTextField jtfCodigo;
    private JLabel jlbTitulo;
    private JTextField jtfTitulo;
    private JLabel jlbGenero;
    private JTextField jtfGenero;
    private JLabel jlbTotal;
    private JTextField jtfTotal;
    private JLabel jlbSubtitulo;
    private JTextField jtfSubtitulo;
    private JLabel jlbPremier;
    private JTextField jtfPremier;

    private JButton jbtInsertar;

    public InsertarPelicula() {
        super();
        this.setLayout(null);
        this.setSize(new Dimension(250, 300));
        this.setClosable(true);
        init();
        this.setVisible(true);
    }

    private void init() {

        this.jlbCodigo = new JLabel("Codigo: ");
        this.jlbCodigo.setBounds(10, 10, 200, 100);
        this.add(this.jlbCodigo);
        this.jtfCodigo = new JTextField(10);
        this.jtfCodigo.setBounds(90, 50, 100, 20);
        this.add(this.jtfCodigo);

        this.jlbTitulo = new JLabel("Titulo: ");
        this.jlbTitulo.setBounds(10, 30, 100, 100);
        this.add(this.jlbTitulo);
        this.jtfTitulo = new JTextField(10);
        this.jtfTitulo.setBounds(90, 70, 100, 20);
        this.add(this.jtfTitulo);

        this.jlbGenero = new JLabel("Genero: ");
        this.jlbGenero.setBounds(10, 50, 100, 100);
        this.add(this.jlbGenero);
        this.jtfGenero = new JTextField(10);
        this.jtfGenero.setBounds(90, 90, 100, 20);
        this.add(this.jtfGenero);

        this.jlbTotal = new JLabel("Total: ");
        this.jlbTotal.setBounds(10, 70, 100, 100);
        this.add(this.jlbTotal);
        this.jtfTotal = new JTextField(10);
        this.jtfTotal.setBounds(90, 110, 100, 20);
        this.add(this.jtfTotal);

        this.jlbSubtitulo = new JLabel("Subtitulo: ");
        this.jlbSubtitulo.setBounds(10, 90, 100, 100);
        this.add(this.jlbSubtitulo);
        this.jtfSubtitulo = new JTextField(10);
        this.jtfSubtitulo.setBounds(90, 130, 100, 20);
        this.add(this.jtfSubtitulo);

        this.jlbPremier = new JLabel("Premier: ");
        this.jlbPremier.setBounds(10, 110, 100, 100);
        this.add(this.jlbPremier);
        this.jtfPremier = new JTextField(10);
        this.jtfPremier.setBounds(90, 150, 100, 20);
        this.add(this.jtfPremier);

        this.jbtInsertar = new JButton("Ingresar");
        this.jbtInsertar.setBounds(20, 150, 100, 100);
        this.jbtInsertar.addActionListener(this);
        this.jbtInsertar.setBounds(65, 190, 100, 20);
        this.add(this.jbtInsertar);

    }//init

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtInsertar) {
            
            try {
                ArchivoBusiness ab = new ArchivoBusiness();
                String cod = (this.jtfCodigo.getText() + "");
                Pelicula pelicula = new Pelicula((this.jtfCodigo.getText()), 
                        this.jtfTitulo.getText(),
                        this.jtfGenero.getText(),
                        Integer.parseInt(this.jtfTotal.getText()),
                        Integer.parseInt(this.jtfSubtitulo.getText()),
                        Integer.parseInt(this.jtfPremier.getText()));
               
                        
                ab.insertarArchivo(pelicula);
            } catch (IOException ex) {
                Logger.getLogger(InsertarPelicula.class.getName()).log(Level.SEVERE, null, ex);
            }
            jtfCodigo.setText("");
            jtfTitulo.setText("");
            jtfGenero.setText("");
            jtfTotal.setText("");
            jtfSubtitulo.setText("");
            jtfPremier.setText("");
            
        }//if

    }

}
