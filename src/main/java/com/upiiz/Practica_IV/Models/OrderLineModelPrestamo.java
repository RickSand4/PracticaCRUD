package com.upiiz.Practica_IV.Models;

import java.util.Date;

public class OrderLineModelPrestamo {
    private PrestamoModel prestamoModel;

    private String nombre;
    private int cantidad;
    private Date fecha2;

    public OrderLineModelPrestamo() {

    }
    public OrderLineModelPrestamo(String nombre, int cantidad, Date fecha2) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fecha2 = fecha2;

    }
    public PrestamoModel getPrestamoModel() {return prestamoModel;}

    public void setPrestamoModel(PrestamoModel prestamoModel) {this.prestamoModel = prestamoModel;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getCantidad() {return cantidad;}
    public void setCantidad(int cantidad) {this.cantidad = cantidad;}
    public Date getFecha2() {return fecha2;}
    public void setFecha2(Date fecha2) {this.fecha2 = fecha2;}

}
