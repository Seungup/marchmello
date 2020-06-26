package com.marchmello.marchmello.functions.comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByCommentLocation(long commentLocation);
    void deleteByCommentLocation(long commentLocation);
}
