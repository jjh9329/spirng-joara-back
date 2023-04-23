package com.example.study.member.service.book;

import com.example.study.member.repository.book.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookFindService {
    private final BookRepository bookRepository;

//    @Transactional(readOnly = true)
//    public Optional<Book> findById(UUID id){
//
//        return bookRepository.findById(id);
//    }
//    @Transactional(readOnly = true)
//    public List<Book> findAll() {
//        return bookRepository.findAll();
//    }

//    @Transactional(readOnly = true)
//    public List<Book> findByGenre(BookGenre bookGenre) {
//        return bookRepository.findByBookGenre(bookGenre);
//    }

//    @Transactional(readOnly = true)
//    public List<Book> findByMember(UUID uuid) {
//        Member member = memberFindService.findByEmail(uuid);
//        return bookRepository.findByMember(member);
//    }
}
