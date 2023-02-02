package com.example.practice.service.impl;

import com.example.practice.model.Product;
import com.example.practice.repository.IProductRepository;
import com.example.practice.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductService implements ICrudService<Product,Long> {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return iProductRepository.findAll(pageable);
    }

    @Override
    public Page<Product> findByName(String name, Pageable pageable) {
        return iProductRepository.findAllByNameContaining(name, pageable);
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public Optional<Product> findOne(Long aLong) {
        return iProductRepository.findById(aLong);
    }

    @Override
    public void deleteByID(Long aLong) {
        iProductRepository.deleteById(aLong);
    }
}
