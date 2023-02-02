package com.example.module3s2;

import java.util.List;

public interface CustomerService {
    List<Customer> findALL();
    void save(Customer customer);
    Customer findById(int id);
    void update(int id, Customer customer);
    void remove(int id);
}
