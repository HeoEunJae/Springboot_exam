package com.boarder.hej.Reply.Service;

import com.boarder.hej.Article.domain.Article;
import com.boarder.hej.Reply.dao.ReplyRepository;
import com.boarder.hej.Reply.domain.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReplyService {

    @Autowired
    private ReplyRepository replyRepository;

    public void create(Article article, String content){
        Reply reply = new Reply();
        reply.setArticle(article);
        reply.setContent(content);
        reply.setCreateDate(LocalDateTime.now());
        this.replyRepository.save(reply);
    }
}
