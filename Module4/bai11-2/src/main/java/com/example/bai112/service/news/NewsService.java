package com.example.bai112.service.news;

import com.example.bai112.model.News;
import com.example.bai112.repository.INewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NewsService implements INewsService {
    @Autowired
    private INewsRepository newsRepository;
    @Override
    public Iterable<News> findAll() {
        return newsRepository.findAll();
    }

    @Override
    public Optional<News> findById(Long id) {
        return newsRepository.findById(id);
    }

    @Override
    public News save(News news) {
      return newsRepository.save(news);


    }

    @Override
    public void remove(Long id) {
        newsRepository.deleteById(id);

    }
}
