package com.upiiz.Practica_IV.Services;


import com.upiiz.Practica_IV.Models.OrderLineModelLibro;
import com.upiiz.Practica_IV.Repositories.OrderLineLibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderLineLibroService implements OrderLineLibroRepository {
    @Override
    public List<OrderLineModelLibro> findAll() {
        return List.of();
    }

    @Override
    public OrderLineModelLibro findById(int id_libro) {
        return null;
    }

    @Override
    public void save(OrderLineModelLibro orderLineModelLibro) {

    }

    @Override
    public void delete(int id_libro) {

    }

    @Override
    public void update(OrderLineModelLibro orderLineModelLibro) {

    }
}
