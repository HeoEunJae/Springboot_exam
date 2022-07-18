package com.boarder.hej.Article.dao;

import com.boarder.hej.Article.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepositoty extends JpaRepository<Article, Integer> {
}
