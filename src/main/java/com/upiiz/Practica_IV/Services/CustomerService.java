package com.upiiz.Practica_IV.Services;

import com.upiiz.Practica_IV.Models.CustomerModel;
import com.upiiz.Practica_IV.Repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements CustomerRepository {

    @Override
    public List<CustomerModel> findAll() {
        return List.of();
    }

    @Override
    public CustomerModel findById(int id) {
        return null;
    }

    @Override
    public void save(CustomerModel customer) {

    }

    @Override
    public void delete(CustomerModel customer) {

    }

    @Override
    public void update(CustomerModel customer) {

    }
}