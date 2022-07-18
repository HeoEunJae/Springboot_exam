package com.boarder.hej.Article.Controller;


import com.boarder.hej.Article.Service.ArticleService;
import com.boarder.hej.Article.dao.ArticleRepositoty;
import com.boarder.hej.Article.domain.Article;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleController {


    @Autowired
    private ArticleService articleService;

    @RequestMapping("/list")
    public String article(Model model) {
        List<Article> articleList = articleService.getlist();
        model.addAttribute("articleList", articleList);
        return "Article_List";
    }

    @RequestMapping("/detail/{id}")
    public String article_detail(Model model, @PathVariable("id") Integer id) {
        Article article = this.articleService.getArticle(id);
        model.addAttribute("article", article);
        return "Article_detail";
    }

}
