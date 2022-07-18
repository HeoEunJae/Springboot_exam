package com.boarder.hej.Article.Service;

import com.boarder.hej.Article.dao.ArticleRepositoty;
import com.boarder.hej.Article.domain.Article;
import com.boarder.hej.Util.DataNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {


    @Autowired
    private ArticleRepositoty articleRepositoty;

    public List<Article> getlist(){
        return articleRepositoty.findAll();
    }

    public Article getArticle(Integer id) {
        Optional<Article> article = this.articleRepositoty.findById(id);
        if (article.isPresent()) {
            return article.get();
        } else {
            throw new DataNotFoundException("article not found");
        }
    }



}
