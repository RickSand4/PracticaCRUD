package com.upiiz.Practica_IV.Services;


import com.upiiz.Practica_IV.Models.LibroModel;
import com.upiiz.Practica_IV.Repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService implements LibroRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<LibroModel> findAll(){
        return jdbcTemplate.query("SELECT * FROM libros", new BeanPropertyRowMapper<>(LibroModel.class));
    }
    @Override
    public LibroModel findById(int id_libro){
        return jdbcTemplate.query("SELECT * FROM libros WHERE id_libro=?",
                new BeanPropertyRowMapper<>(LibroModel.class),id_libro)
                .stream().findFirst().orElse(new LibroModel());
    }

    @Override
    public void save(LibroModel libro) {
        jdbcTemplate.update("INSERT INTO libros(id_libro, titulo, autor, anio_publicacion, disponible) VALUES (?,?,?,?,?)"
        ,libro.getId_libro(), libro.getAutor(), libro.getTitulo(), libro.getAnio_publicacion(), libro.isDisponible());
    }

    @Override
    public void update(LibroModel libro) {
        jdbcTemplate.update("UPDATE libros SET titulo = ?, autor = ?, anio_publicacion = ?, disponible = ? WHERE id_libro = ?",
                libro.getTitulo(), libro.getAutor(), libro.getAnio_publicacion(), libro.isDisponible(), libro.getId_libro());
    }

    @Override
    public void delete(int id_libro) {
        jdbcTemplate.update("DELETE FROM libros WHERE id_libro=?",id_libro);
    }

}
