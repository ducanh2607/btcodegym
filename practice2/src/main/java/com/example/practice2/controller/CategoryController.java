package com.example.practice2.controller;
import com.example.practice2.model.Category;
import com.example.practice2.service.impl.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoriesService categoriesService;

    @GetMapping()
    public ResponseEntity<List<Category>> findAll() {
        return new ResponseEntity<>(categoriesService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
            return new ResponseEntity<>(categoriesService.findOne(id).get(), HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Category> update(@RequestBody Category category, @PathVariable Long id){
            Category categoryUpdate = categoriesService.findOne(id).get();
            if (categoryUpdate != null){
                return new ResponseEntity<>(categoriesService.save(category), HttpStatus.CREATED);
            }else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);

            }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        categoriesService.deleteById(id);
        return new ResponseEntity<>("Delete done!", HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Category> create(@RequestBody Category category){
        return new ResponseEntity<>(categoriesService.save(category), HttpStatus.CREATED);
    }


}
