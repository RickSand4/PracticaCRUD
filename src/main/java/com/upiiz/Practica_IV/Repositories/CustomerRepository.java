package com.upiiz.Practica_IV.Repositories;


import com.upiiz.Practica_IV.Models.CustomerModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository {
    List<CustomerModel> findAll();
    CustomerModel findById(int id);
    void save(CustomerModel customer);
    void delete(CustomerModel customer);
    void update(CustomerModel customer);
}
