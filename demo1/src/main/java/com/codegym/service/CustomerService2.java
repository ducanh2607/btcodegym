package com.codegym.service;

import com.codegym.model.Category;
import com.codegym.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService2 implements ICustomerService{
    private static final Map<Integer, Customer> customers;
    private static final ArrayList<Category> categories;

    static {
        categories = new ArrayList<>();
        categories.add(new Category(1, "RnD"));
        categories.add(new Category(2, "Bussiness"));
        categories.add(new Category(3, "Human resources"));
        customers = new HashMap<>();
        customers.put(1, new Customer(1,"John", "john@codegym.vn", "Hanoi", categories.get(0)));
        customers.put(2, new Customer(2,"Bill", "bill@codegym.vn", "Danang", categories.get(1)));
        customers.put(3, new Customer(3,"Alex", "alex@codegym.vn", "Saigon", categories.get(2)));
        customers.put(4, new Customer(4,"Adam", "adam@codegym.vn", "Beijin", categories.get(1)));
        customers.put(5, new Customer(5,"Sophia", "sophia@codegym.vn", "Miami", categories.get(2)));
        customers.put(6, new Customer(6,"Rose","rose@codegym.vn","Newyork",categories.get(2)));


    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }

    @Override
    public List<Customer> search(String name) {
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        for (Customer c : findAll()){
            if (c.getName().toLowerCase().contains(name.toLowerCase())){
                    customerArrayList.add(c);
            }
        }
        return customerArrayList;
    }

    @Override
    public List<Category> findAllCategory() {
        return categories;
    }
    @Override
    public Category findId(int id){
        return categories.get(id-1);
    }
}
