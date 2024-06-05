package jpabook.jpashop.service;

import jakarta.persistence.EntityManager;
import jpabook.jpashop.domain.item.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ItemUpdateTest {

    @Autowired
    EntityManager em;

    @Test
    void updateTest() {
        Book book = em.find(Book.class, 1L);

        //트랜잭션이 변경을 감지하면
        book.setIsbn("1111");

        //변경감지 == dirty checking
        //TX commit
        //영속성에 저장된 book객체가 변경이 감지가되면 지혼자 Commit해줌..

    }
}
