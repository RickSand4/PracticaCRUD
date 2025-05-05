package com.upiiz.Practica_IV.Repositories;


import com.upiiz.Practica_IV.Models.PrestamoModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrestamoRepository {
    //Menú

    //todos los prestamos
    List<PrestamoModel> findAll();
    PrestamoModel findById(int id_prestamo);
    void save(PrestamoModel prestamo);
    void delete(int id_prestamo);
    void update(PrestamoModel prestamo);
}
