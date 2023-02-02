package com.example.bai92.controller;

import com.example.bai92.exception.DuplicateEmailException;
import com.example.bai92.model.Customer;
import com.example.bai92.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customers/{id}")
    public ModelAndView showInformation(@PathVariable Long id) {
        try {
            ModelAndView modelAndView = new ModelAndView("/info");
            Optional<Customer> customerOptional = customerService.findById(id);
            modelAndView.addObject("customer", customerOptional.get());
            return modelAndView;
        } catch (Exception e) {
            return new ModelAndView("redirect:/customers");
        }
    }

    @GetMapping("/customers")
    public ModelAndView listCustomers() {
        Iterable<Customer> customers = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/edit-customer/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) throws Exception {
        Optional<Customer> customer = customerService.findById(id);
        if (customer.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/edit");
            modelAndView.addObject("customer", customer.get());
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

//        @PostMapping("/edit-customer")
//    public ModelAndView updateCustomer(Customer customer) throws DuplicateEmailException {
//        customerService.save(customer);
//        return new ModelAndView("redirect:/customers");
//    }

    @PostMapping("/edit-customer")
    public ModelAndView updateCustomer(Customer customer) {
        try {
            customerService.save(customer);
            return new ModelAndView("redirect:/customers");
        } catch (DuplicateEmailException e) {
            return new ModelAndView("/inputs-not-acceptable");
        }
    }
//    @ExceptionHandler(DuplicateEmailException.class)
//    public ModelAndView showInputNotAcceptable() {
//        return new ModelAndView("/inputs-not-acceptable");
//    }
}
