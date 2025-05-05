package com.upiiz.Practica_IV.Services;


import com.upiiz.Practica_IV.Models.OrderLineModelPrestamo;
import com.upiiz.Practica_IV.Repositories.OrderLinePrestamoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderLinePrestamoService implements OrderLinePrestamoRepository {
    @Override
    public List<OrderLineModelPrestamo> findAll() {
        return List.of();
    }

    @Override
    public OrderLineModelPrestamo findById(int id) {
        return null;
    }

    @Override
    public void save(OrderLineModelPrestamo orderLineModelPrestamo) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(OrderLineModelPrestamo orderLineModelPrestamo) {

    }
}
