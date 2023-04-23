package com.example.study.member.repository.book;

import com.example.study.member.entity.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

//JpaRepository<book객체,PK UUID>와 매핑
public interface BookRepository extends JpaRepository<Book, UUID> {

    //List<Book> findByBook(BookGenre bookGenre);

//    List<Book> findByMember(Member member);

//    Optional<Book>  findById(UUID id);

//    List<Book> findByBookGenre(BookGenre bookgenre);
}