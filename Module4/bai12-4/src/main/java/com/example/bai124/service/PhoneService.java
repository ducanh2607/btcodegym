package com.example.bai124.service;

import com.example.bai124.model.Phone;
import com.example.bai124.repository.IPhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService {
    @Autowired
    private IPhoneRepository phoneRepository;

    public List<Phone> findAll() {
        return phoneRepository.findAll();
    }

    public Phone findById(Long id) {
        return phoneRepository.findById(id).get();
    }

    public Phone save(Phone phone) {
        return phoneRepository.save(phone);
    }

    public void delete(Long id) {
        phoneRepository.deleteById(id);
    }
}
