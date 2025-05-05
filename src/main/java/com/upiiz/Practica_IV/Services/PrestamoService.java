package com.upiiz.Practica_IV.Services;

import com.upiiz.Practica_IV.Models.PrestamoModel;
import com.upiiz.Practica_IV.Repositories.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoService implements PrestamoRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<PrestamoModel> findAll() {
        return jdbcTemplate.query("SELECT * FROM prestamos",new BeanPropertyRowMapper<>(PrestamoModel.class));
    }

    @Override
    public PrestamoModel findById(int id_prestamo) {
        return jdbcTemplate.query("SELECT * FROM prestamos WHERE id_prestamo=?",
                new BeanPropertyRowMapper<>(PrestamoModel.class),id_prestamo)
                .stream().findFirst().orElse(new PrestamoModel());
    }

    @Override
    public void save(PrestamoModel prestamo) {
        jdbcTemplate.update("INSERT INTO prestamos(id_prestamo, id_libro, fecha_prestamo, fecha_devolucion, nombre_usuario) VALUES(?,?,?,?,?)",
                prestamo.getId_prestamo(), prestamo.getId_libro(), prestamo.getFecha_prestamo(), prestamo.getFecha_devolucion(), prestamo.getNombre_usuario());
    }

    @Override
    public void delete(int id_prestamo) {
        // Primero actualiza el id_libro a NULL si se va a eliminar un préstamo
        jdbcTemplate.update("UPDATE prestamos SET id_libro=NULL WHERE id_prestamo=?", id_prestamo);

        // Luego elimina el préstamo
        jdbcTemplate.update("DELETE FROM prestamos WHERE id_prestamo=?", id_prestamo);
    }


    @Override
    public void update(PrestamoModel prestamo) {
        jdbcTemplate.update("UPDATE prestamos SET id_libro=?, fecha_prestamo=?, fecha_devolucion=?, nombre_usuario=? WHERE id_prestamo=?",
                prestamo.getId_libro(), prestamo.getFecha_prestamo(), prestamo.getFecha_devolucion(), prestamo.getNombre_usuario(), prestamo.getId_prestamo());

    }
}
