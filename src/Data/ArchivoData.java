/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.Pelicula;
import com.csvreader.CsvReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jeannette
 */
public class ArchivoData {

    public static final String SEPARATOR = ",";
    public static final String QUOTE = "\"";

    public List<Pelicula> recuperarDelArchivo() throws IOException {
        List<Pelicula> list = new ArrayList<Pelicula>();
        BufferedReader br = null;
        int cont=0;

        try {

            br = new BufferedReader(new FileReader("datos.csv"));
            String line = br.readLine();
            while (null != line) {
                String[] fields = line.split(SEPARATOR);
                if (cont != 0) {
                    Pelicula pelicula = new Pelicula(Integer.parseInt(fields[0]), fields[1], fields[2], Integer.parseInt(fields[3]), Integer.parseInt(fields[4]), Integer.parseInt(fields[5]));
                    list.add(pelicula);
                    //JOptionPane.showMessageDialog(null, pelicula.toString());
                }
                System.out.println(Arrays.toString(fields));
                line = br.readLine();
                cont++;
            }
        } catch (Exception e) {

        } finally {
            if (null != br) {
                br.close();
            }
        }
//        for (int i = 0; i < list.size(); i++) {
//            JOptionPane.showMessageDialog(null, list.get(i));
//            
//        }//for i
        return list;
    }//met

}//class
