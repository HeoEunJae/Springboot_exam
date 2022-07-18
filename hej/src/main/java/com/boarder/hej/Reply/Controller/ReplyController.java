package com.boarder.hej.Reply.Controller;

import com.boarder.hej.Article.Service.ArticleService;
import com.boarder.hej.Article.domain.Article;
import com.boarder.hej.Reply.Service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/reply")
public class ReplyController {

    @Autowired
    private ReplyService replyService;

    @Autowired
    private ArticleService articleService;

    @PostMapping("/create/{id}")
    public String createReply(Model model, @PathVariable("id") Integer id, @RequestParam String content){
        Article article = this.articleService.getArticle(id);
        this.replyService.create(article, content);
        return String.format("redirect:/article/detail/%s", id);
    }
}
