package com.upiiz.Practica_IV.Models;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;

public class PrestamoModel {

    private int id_prestamo;
    private int id_libro;
    private LocalDate fecha_prestamo;
    private LocalDate fecha_devolucion;
    private String nombre_usuario;

    public PrestamoModel() {}
    public PrestamoModel(int id_prestamo,int id_libro,LocalDate fecha_prestamo,LocalDate fecha_devolucion,String nombre_usuario) {
        this.id_prestamo = id_prestamo;
        this.id_libro = id_libro;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
        this.nombre_usuario = nombre_usuario;
    }

    public int getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public LocalDate getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(LocalDate fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public LocalDate getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(LocalDate fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }
}
