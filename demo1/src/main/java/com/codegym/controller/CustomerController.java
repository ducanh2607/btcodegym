package com.codegym.controller;

import com.codegym.model.Category;
import com.codegym.model.Customer;
import com.codegym.service.CustomerService2;
import com.codegym.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private final ICustomerService customerService2 = new CustomerService2();
    @GetMapping("")
    public String index(Model model){
        List<Customer> customerList = customerService2.findAll();
        model.addAttribute("customers", customerList);
        return "/index";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("customer", new Customer());
        ArrayList<Category> categories = (ArrayList<Category>) customerService2.findAllCategory();
        model.addAttribute("categories", categories);
        return "/create";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Customer customer, @RequestParam("category_id") int id){
        customer.setId((int) (Math.random() * 10000));
        customer.setCategory(customerService2.findId(id));
        customerService2.save(customer);
        return "redirect:/customer";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService2.findById(id));
        return "/edit";
    }
    @PostMapping("/update")
    public String update(Customer customer){
        customerService2.update(customer.getId(), customer);
        return "redirect:/customer";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService2.findById(id));
        return "/delete";
    }
    @PostMapping("/delete")
    public String delete(Customer customer, RedirectAttributes redirect) {
        customerService2.remove(customer.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/customer";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService2.findById(id));
        return "/view";
    }
    @PostMapping("/search/")
    public String search(@RequestParam String name, Model model){
        List<Customer> customerList = customerService2.search(name);
        model.addAttribute("customers", customerList);
        return "/index";
    }


}
