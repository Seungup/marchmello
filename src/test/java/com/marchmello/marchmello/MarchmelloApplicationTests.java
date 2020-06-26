package com.marchmello.marchmello;

import com.marchmello.marchmello.functions.comment.Comment;
import com.marchmello.marchmello.functions.comment.CommentController;
import com.marchmello.marchmello.functions.comment.CommentRepository;
import com.marchmello.marchmello.functions.thread.Thread;
import com.marchmello.marchmello.functions.thread.ThreadController;
import com.marchmello.marchmello.functions.thread.ThreadRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.test.StepVerifier;

import javax.servlet.http.HttpServletResponse;

@SpringBootTest
class MarchmelloApplicationTests {


    @Test
    void contextLoads() {
        MarchmelloApplication.main(new String[0]);
    }

    /*
    * 정상적인 스레드는 추가되어야합니다.
    * */
    @Test
    void testAddThread_GOOD(@Autowired ThreadController c) {
        Thread thread = new Thread();
        thread.setTitle("TITLE");
        thread.setDescription("DES");
        boolean actual = c.addThread(thread);

        Assertions.assertEquals(true, actual);
    }

    /*
    * 제목, 내용이 존재하지 않는 스레드는 추가될 수 없습니다.
    * */
    @Test
    void testAddThread_BAD(@Autowired ThreadController c) {
        Thread thread = new Thread();
        boolean actual = c.addThread(thread);

        Assertions.assertEquals(false, actual);
    }

    /*
    * 존재하는 스레드는 지워져야 합니다.
    * */
    @Test
    void testDeleteThread_GOOD(@Autowired ThreadController c) {

        boolean actual = c.removeThread(1);
        Assertions.assertEquals(true, actual);
    }


    /*
    * 존재하지 않는 스레드는 지울 수 없습니다.
    * */
    @Test
    void testDeleteThread_BAD(@Autowired ThreadController c) {

        boolean actual = c.removeThread(-1);
        Assertions.assertEquals(false, actual);
    }
}
