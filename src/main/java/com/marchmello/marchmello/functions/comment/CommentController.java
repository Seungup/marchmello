package com.marchmello.marchmello.functions.comment;

import com.marchmello.marchmello.functions.thread.ThreadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Date;

@Controller
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private ThreadRepository threadRepository;

    private long maxId = 0;

    /*
    *
    * add Comment to thread
    * */
    @RequestMapping(value = "/threads/{id}/comments", method = RequestMethod.POST)
    public @ResponseBody
    boolean addComment(@PathVariable("id") long id, @RequestBody Comment comment){

        if(threadRepository.findById(id).isEmpty()){
            return false;
        } else {
            if(comment.getComment().isBlank() || comment.getComment().isEmpty()){
                return false;
            }
            else {
                comment.setId(maxId++);
                comment.setCreateTime(new Date().getTime());
                comment.setCommentLocation(id);
                commentRepository.save(comment);
                return true;
            }
        }

    }


    /*
    *
    * get Comments to thread
    * */
    @RequestMapping(value = "/threads/{id}/comments", method = RequestMethod.GET)
    public @ResponseBody
    Collection<Comment> getComments(@PathVariable("id") long id){
        return commentRepository.findAll();
    }

    /*
    *
    * delete Comment in thread
    * */
    @RequestMapping(value = "/threads/{t_id}/comments", method = RequestMethod.DELETE)
    public @ResponseBody
    Boolean deleteComment(@RequestParam("id") long id){
        commentRepository.deleteById(id);
        return commentRepository.findById(id).isEmpty();
    }
}
