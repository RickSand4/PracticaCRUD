package com.upiiz.Practica_IV.Repositories;


import com.upiiz.Practica_IV.Models.OrderLineModelPrestamo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderLinePrestamoRepository {
    List<OrderLineModelPrestamo> findAll();
    OrderLineModelPrestamo findById(int id);
    void save(OrderLineModelPrestamo orderLineModelPrestamo);
    void delete(int id);
    void update(OrderLineModelPrestamo orderLineModelPrestamo);

}
