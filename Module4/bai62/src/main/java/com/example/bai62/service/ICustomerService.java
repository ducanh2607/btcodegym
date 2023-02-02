package com.example.bai62.service;

import com.example.bai62.model.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
