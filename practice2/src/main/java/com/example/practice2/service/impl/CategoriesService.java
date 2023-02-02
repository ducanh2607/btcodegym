package com.example.practice2.service.impl;

import com.example.practice2.model.Category;
import com.example.practice2.repository.ICategoryRepository;
import com.example.practice2.service.ICategoryService;
import com.example.practice2.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoriesService implements ICrudService<Category, Long>{
    @Autowired
    private ICategoryRepository categoryRepository;


    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public List<Category> findByName(String name) {
        return categoryRepository.findAllByNameContaining(name);
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);

    }

    @Override
    public Optional<Category> findOne(Long k) {
        return categoryRepository.findById(k);
    }

    @Override
    public void deleteById(Long k) {
        categoryRepository.deleteById(k);

    }
}
