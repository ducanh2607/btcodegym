package com.example.bai83.repository;

import com.example.bai83.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends PagingAndSortingRepository<User,Long> {
    Iterable<User> findAllById(Long id);
}
