package com.example.practice.controller;

import com.example.practice.model.Category;
import com.example.practice.model.Product;
import com.example.practice.service.ICategoryService;
import com.example.practice.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ICrudService<Product, Long> iCrudService;

    @Autowired
    private ICategoryService iCategoryService;

    @Value("${upload}")
    private String upload;

    @ModelAttribute("categories")
    public List<Category> getCategories() {
        return iCategoryService.findCategories();
    }

    @GetMapping
    public ModelAndView listProducts(@PageableDefault(size = 3) Pageable pageable,
                                     @RequestParam("search") Optional<String> name) {
        ModelAndView modelAndView = new ModelAndView("/product/list");
        if (!name.isPresent()) {
            modelAndView.addObject("products", iCrudService.findAll(pageable));
        } else {
            modelAndView.addObject("products", iCrudService.findByName(name.get(), pageable));
            modelAndView.addObject("search", name.get());
        }
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView createForm() {
        ModelAndView modelAndView = new ModelAndView("/product/form");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    @GetMapping("/update/{id}")
    public ModelAndView updateForm(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("/product/form");
        Optional<Product> product = iCrudService.findOne(id);
        if (product.isPresent()) {
            modelAndView.addObject("product", product.get());
        } else {
            return new ModelAndView("/404");
        }
        return modelAndView;
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Product product) {
        MultipartFile image = product.getImg();
        String name = image.getOriginalFilename();
        try {
            FileCopyUtils.copy(image.getBytes(), new File(upload + name));
        } catch (Exception e) {
            e.printStackTrace();
        }
        product.setImage(name);
        iCrudService.save(product);
        return "redirect:/products";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        iCrudService.deleteByID(id);
        return "redirect:/products";
    }
}
