package com.example.bai112.service.category;

import com.example.bai112.model.Category;
import com.example.bai112.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    private ICategoryRepository categoryRepository;
    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Category save(Category category) {
       return categoryRepository.save(category);

    }

    @Override
    public void remove(Long id) {
        categoryRepository.deleteById(id);

    }
}
