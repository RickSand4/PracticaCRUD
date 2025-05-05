package com.upiiz.Practica_IV.Repositories;


import com.upiiz.Practica_IV.Models.OrderLineModelLibro;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderLineLibroRepository {
    List<OrderLineModelLibro> findAll();
    OrderLineModelLibro findById(int id);

    void save(OrderLineModelLibro orderLineModelLibro);
    void delete(int id);
    void update(OrderLineModelLibro orderLineModelLibro);
}
