package com.example.practice2.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ICrudService<E,ID> {
List<E> findAll();
List<E> findByName(String name);
    E save(E e);
Optional<E> findOne(ID k);
void deleteById(ID k);
}
