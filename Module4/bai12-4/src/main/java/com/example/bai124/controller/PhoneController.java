package com.example.bai124.controller;

import com.example.bai124.model.Phone;
import com.example.bai124.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/smartphones")
@CrossOrigin("*")

public class PhoneController {
    @Autowired
    private PhoneService phoneService;

    @GetMapping
    public ResponseEntity<List<Phone>> findAll() {
        return new ResponseEntity<>(phoneService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Phone> findById(@PathVariable Long id) {
        return new ResponseEntity<>(phoneService.findById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Phone> create(@RequestBody Phone phone) {
        return new ResponseEntity<>(phoneService.save(phone), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Phone> update(@RequestBody Phone phone, @PathVariable Long id) {
        Phone phoneUpdate = phoneService.findById(id);
        if (phoneUpdate != null) {
            return new ResponseEntity<>(phoneService.save(phone), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        phoneService.delete(id);
        return new ResponseEntity<>("Delete done!", HttpStatus.OK);
    }
}
