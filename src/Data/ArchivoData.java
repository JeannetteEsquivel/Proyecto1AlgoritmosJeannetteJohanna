/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

<<<<<<< HEAD
import Domain.MyCirculeDoubleLinkedListAction;
import Domain.MyCirculeDoubleLinkedListChildish;
import Domain.MyCirculeDoubleLinkedListComedy;
import Domain.MyCirculeDoubleLinkedListDrama;
import Domain.MyCirculeDoubleLinkedListFiction;
import Domain.MyCirculeDoubleLinkedListRomance;
import Domain.Pelicula;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
=======
import Domain.Pelicula;
import com.csvreader.CsvReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
>>>>>>> 78b944b0a7fb18e17acfd96e816c7d6acb0d12a1
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jeannette
 */
public class ArchivoData {

<<<<<<< HEAD
    File file = new File("datos.csv");

    public void insertarPelicula(Pelicula pelicula) throws FileNotFoundException, IOException {
        boolean alreadyExists = new File("datos").exists();

        if (alreadyExists) {
            File archivoPelicula = new File("datos");
            archivoPelicula.delete();
        }
        try {
            CsvWriter csvOutPut = new CsvWriter(new FileWriter(file, true), ',');

            csvOutPut.write((pelicula.getCodigo()));
            csvOutPut.write(pelicula.getTitulo());
            csvOutPut.write(pelicula.getGenero());
            csvOutPut.write(Integer.toString(pelicula.getTotal()));
            csvOutPut.write(Integer.toString(pelicula.getSubtitulo()));
            csvOutPut.write(Integer.toString(pelicula.getPremier()));
            csvOutPut.endRecord();
            csvOutPut.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//insertar

    public void leerArchivo() {
        MyCirculeDoubleLinkedListDrama myCirculeDoubleLinkedListDrama = new MyCirculeDoubleLinkedListDrama();
        MyCirculeDoubleLinkedListComedy myCirculeDoubleLinkedListComedy = new MyCirculeDoubleLinkedListComedy();
        MyCirculeDoubleLinkedListChildish myCirculeDoubleLinkedListChildish = new MyCirculeDoubleLinkedListChildish();
        MyCirculeDoubleLinkedListAction myCirculeDoubleLinkedListAction = new MyCirculeDoubleLinkedListAction();
        MyCirculeDoubleLinkedListRomance myCirculeDoubleLinkedListRomance = new MyCirculeDoubleLinkedListRomance();
        MyCirculeDoubleLinkedListFiction myCirculeDoubleLinkedListFiction = new MyCirculeDoubleLinkedListFiction();
                
        
        List<Pelicula> listPelicula = new ArrayList<Pelicula>();
        try {
            // List<Pelicula> usuarios = new ArrayList<Pelicula>();

            CsvReader empleados_import = new CsvReader("datos.csv");
            empleados_import.readHeaders();
            while (empleados_import.readRecord()) {

                String codigo = empleados_import.get(0);
                String titulo = empleados_import.get(1);
                String genero = empleados_import.get(2);
                String total = empleados_import.get(3);
                String subtitulo = empleados_import.get(4);
                String premier = empleados_import.get(5);
                Pelicula pelicula1 = new Pelicula(codigo, titulo, genero, Integer.parseInt(total), Integer.parseInt(subtitulo), Integer.parseInt(premier));
                if(pelicula1.getGenero().equals("1000"))
                myCirculeDoubleLinkedListDrama.insertInOrder(pelicula1);
                else if(pelicula1.getGenero().equals("2000"))
                    myCirculeDoubleLinkedListComedy.insertInOrder(pelicula1);
                else if(pelicula1.getGenero().equals("3000"))
                    myCirculeDoubleLinkedListChildish.insertInOrder(pelicula1);
                else if(pelicula1.getGenero().equals("4000"))
                    myCirculeDoubleLinkedListAction.insertInOrder(pelicula1);
                else if(pelicula1.getGenero().equals("5000"))
                    myCirculeDoubleLinkedListRomance.insertInOrder(pelicula1);
                else if(pelicula1.getGenero().equals("6000"))
                    myCirculeDoubleLinkedListFiction.insertInOrder(pelicula1);
            }

            empleados_import.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //return listPelicula;
        myCirculeDoubleLinkedListDrama.printList();
        myCirculeDoubleLinkedListComedy.printList();
        myCirculeDoubleLinkedListChildish.printList();
        myCirculeDoubleLinkedListAction.printList();
        myCirculeDoubleLinkedListRomance.printList();
        myCirculeDoubleLinkedListFiction.printList();


    }
    
    public List<Pelicula> array() {
        
        List<Pelicula> listPelicula = new ArrayList<Pelicula>();
        try {
            // List<Pelicula> usuarios = new ArrayList<Pelicula>();

            CsvReader empleados_import = new CsvReader("datos.csv");
            empleados_import.readHeaders();
            while (empleados_import.readRecord()) {

                String codigo = empleados_import.get(0);
                String titulo = empleados_import.get(1);
                String genero = empleados_import.get(2);
                String total = empleados_import.get(3);
                String subtitulo = empleados_import.get(4);
                String premier = empleados_import.get(5);
                Pelicula pelicula1 = new Pelicula(codigo, titulo, genero, Integer.parseInt(total), Integer.parseInt(subtitulo), Integer.parseInt(premier));
                listPelicula.add(pelicula1);
            }

            empleados_import.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return listPelicula;
    }
=======
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
>>>>>>> 78b944b0a7fb18e17acfd96e816c7d6acb0d12a1

}//class
