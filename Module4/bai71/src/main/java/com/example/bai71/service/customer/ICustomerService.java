package com.example.bai71.service.customer;

import com.example.bai71.model.Customer;
import com.example.bai71.model.Province;
import com.example.bai71.service.IGeneralService;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
