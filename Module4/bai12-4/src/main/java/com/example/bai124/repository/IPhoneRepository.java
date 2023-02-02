package com.example.bai124.repository;

import com.example.bai124.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPhoneRepository extends JpaRepository<Phone, Long> {
}
