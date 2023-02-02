package com.example.bai91.service;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();
    Optional<T> findById(Long id) throws Exception;
    void save(T t);
    void remove(Long id);
}
