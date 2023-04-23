package com.example.study.member.service.book;

import com.example.study.member.api.dto.BookRegisterDto;
import com.example.study.member.api.dto.BookRegisterDto.*;
import com.example.study.member.entity.book.Book;
import com.example.study.member.entity.member.Member;
import com.example.study.member.repository.book.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultBookService implements BookService{
    private final BookRepository bookRepository;

    @Override
    public boolean writeBook(BookWriteRequestDto dto){
        Book book = Book.builder()
                .memberId(dto.memberId())
                .genreId(dto.genreId())
                .bookTitle(dto.bookTitle())
                .bookDescription(dto.bookDescription())
                .bookCover(dto.bookCover())
                .avgScore(dto.avgScore())
                .ISBN_CIP(dto.ISBN_CIP())
                .build();
        bookRepository.save(book);
        return true;
    }

}
