package com.example.practice.service.impl;

import com.example.practice.model.Category;
import com.example.practice.repository.ICategoryRepository;
import com.example.practice.service.ICategoryService;
import com.example.practice.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements ICrudService<Category, Long>, ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;
    @Override
    public List<Category> findCategories() {
        return iCategoryRepository.findAll();
    }

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return iCategoryRepository.findAll(pageable);
    }

    @Override
    public Page<Category> findByName(String name, Pageable pageable) {
        return iCategoryRepository.findAllByNameContaining(name, pageable);
    }

    @Override
    public void save(Category category) {
        iCategoryRepository.save(category);

    }

    @Override
    public Optional<Category> findOne(Long aLong) {
        return iCategoryRepository.findById(aLong);
    }

    @Override
    public void deleteByID(Long aLong) {
        iCategoryRepository.deleteById(aLong);

    }
}
