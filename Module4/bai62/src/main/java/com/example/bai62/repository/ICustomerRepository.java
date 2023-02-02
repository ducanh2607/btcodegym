package com.example.bai62.repository;

import com.example.bai62.model.Customer;

public interface ICustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
}
