package com.upiiz.Practica_IV.Models;

import java.util.Date;

public class OrderLineModelLibro {
    private LibroModel libroModel;

    private int numero;
    private Date fecha1;
    private String titulo;

    public OrderLineModelLibro() {

    }
    public OrderLineModelLibro(LibroModel libroModel, int numero,Date fecha1, String titulo){
        this.libroModel = libroModel;
        this.numero = numero;
        this.fecha1 = fecha1;
        this.titulo = titulo;

    }
    public LibroModel getLibroModel() { return  libroModel; }
    public void setLibroModel(LibroModel libroModel) {this.libroModel = libroModel; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
    public Date getFecha1() { return fecha1; }
    public void setFecha1(Date fecha1) { this.fecha1 = fecha1; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

}
