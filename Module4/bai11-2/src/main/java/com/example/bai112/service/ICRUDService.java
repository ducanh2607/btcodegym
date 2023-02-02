package com.example.bai112.service;

import java.util.Optional;

public interface ICRUDService <E,K>{
    Iterable<E> findAll();
    Optional<E> findById(K id);
    E save(E e);
    void remove(K id);
}
