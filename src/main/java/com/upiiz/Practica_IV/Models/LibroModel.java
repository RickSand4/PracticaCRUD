package com.upiiz.Practica_IV.Models;

public class LibroModel {

    private int id_libro;
    private String titulo;
    private String autor;
    private int anio_publicacion;
    private boolean disponible;

    public LibroModel() {
    }

    public LibroModel(int id_libro, String titulo, String autor, int anio_publicacion, boolean disponible) {

        this.id_libro = id_libro;
        this.titulo = titulo;
        this.autor = autor;
        this.anio_publicacion = anio_publicacion;
        this.disponible = disponible;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setAnio_publicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
