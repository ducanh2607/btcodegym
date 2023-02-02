package com.example.practice2.service.impl;

import com.example.practice2.model.Product;
import com.example.practice2.repository.IProductRepository;
import com.example.practice2.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductService implements ICrudService<Product, Long> {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findByName(String name) {
        return productRepository.findAllByNameContaining(name);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> findOne(Long k) {
        return productRepository.findById(k);}

    @Override
    public void deleteById(Long k) {
        productRepository.deleteById(k);
    }
}
