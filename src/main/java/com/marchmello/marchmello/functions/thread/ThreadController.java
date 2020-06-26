package com.marchmello.marchmello.functions.thread;

import com.marchmello.marchmello.functions.comment.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@Controller
public class ThreadController {
    @Autowired
    private ThreadRepository threadRepository;

    @Autowired
    private CommentRepository commentRepository;

    private long maxId = 0;

    /*
    *
    * add thread
    * */
    @RequestMapping(value = "/threads", method = RequestMethod.POST)
    public @ResponseBody
    boolean addThread(@RequestBody Thread thread){
        if(
                thread.getDescription().isBlank()
                || thread.getTitle().isBlank()
        ) {
            return false;
        }else{
            thread.setId(maxId++);
            thread.setCreateTime(new Date().getTime());
            threadRepository.save(thread);
        }

        return true;
    }


    /*
    *
    * get threads
    * */

    @RequestMapping(value = "/threads", method = RequestMethod.GET)
    public @ResponseBody
    List<Thread> getThreads() {
        return threadRepository.findAll();
    }

    /*
     *
     * delete thread
     * */
    @RequestMapping(value = "/threads/{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    boolean removeThread(@PathVariable("id") long id){
        if(threadRepository.findById(id).isEmpty()){
            return false;
        }
        else{
            commentRepository.deleteByCommentLocation(id);
            threadRepository.deleteById(id);
            return threadRepository.findById(id).isEmpty();
        }
    }


    /*
    *
    * get thread
    * */
    @RequestMapping(value = "/threads/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Optional<Thread> getThread(@PathVariable("id") long id){
        return threadRepository.findById(id);
    }


    /*
    *
    * find by title
    * */
    @RequestMapping(value = "/threads/search", method = RequestMethod.GET)
    public @ResponseBody
    Collection<Thread> findByTitle(@RequestParam("title") String title){
        return threadRepository.findByTitle(title);
    }


}
