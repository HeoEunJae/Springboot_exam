package com.boarder.hej.Reply.dao;

import com.boarder.hej.Reply.domain.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Integer> {
}
