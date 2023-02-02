package com.example.bai112.repository;

import com.example.bai112.model.News;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INewsRepository extends PagingAndSortingRepository<News, Long> {
}
