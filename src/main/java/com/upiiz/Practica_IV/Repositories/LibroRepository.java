package com.upiiz.Practica_IV.Repositories;


import com.upiiz.Practica_IV.Models.LibroModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository {
    //Menú

    //todos los libros
    List<LibroModel> findAll();
    //Un solo libro por su id
    LibroModel findById(int id_libro);
    //Agregar un libro
    void save(LibroModel libro);

    void update(LibroModel libro);

    void delete(int id_libro);

}
