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
public class Pelicula {
    
    private int codigo;
    private String titulo;
    private String genero;
    private int total;
    private int subtitulo;
    private int premier;

    public Pelicula(int codigo, String titulo, String genero, int total, int subtitulo, int premier) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.total = total;
        this.subtitulo = subtitulo;
        this.premier = premier;
    }

    public Pelicula(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public Pelicula(int codigo, String titulo, String genero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
    }
    

    public Pelicula() {
        this.codigo = 0;
        this.titulo = "";
        this.genero = "";
        this.total = 0;
        this.subtitulo = 0;
        this.premier = 0;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "codigo=" + codigo + ", titulo=" + titulo + ", genero=" + genero + ", total=" + total + ", subtitulo=" + subtitulo + ", premier=" + premier + '}';
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(int subtitulo) {
        this.subtitulo = subtitulo;
    }

    public int getPremier() {
        return premier;
    }

    public void setPremier(int premier) {
        this.premier = premier;
    }
    
    
    
    
}
