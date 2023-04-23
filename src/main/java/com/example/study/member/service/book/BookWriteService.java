package com.example.study.member.service.book;

import static com.example.study.member.api.dto.BookRegisterDto.BookWriteRequestDto;

import com.example.study.member.repository.book.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookWriteService {
    private final BookRepository bookRepository;

    @Transactional
    public boolean writeBook(UUID uuid,BookWriteRequestDto bookWriteRequest){
//       Member member = memberFindService.findById(uuid);
//        Book book = Book.builder()
//                //Reqeust의 담긴 내용을 Book 객체 담는
//                .bookTitle(bookWriteRequest.bookTitle())
////                .writer(member.getNickname())
//                .bookDescription(bookWriteRequest.bookDescription())
//                //.bookGenre(bookWriteRequest.genre_name())
//                .build();
//        //Repository에 book객체를 저장
//        bookRepository.save(book);
        return true;
    }
//    @Transactional
//    public Long updateBook(UUID uuid, Long boardId, BookUpdateRequestDto boardUpdateRequest) {
//        Member member = memberFindService.findById(uuid);
//        Board board = boardFindService.findById(boardId);
//        checkBoardLoginUser(user, board);
//        Long updatedBoardId = board.update(
//                boardUpdateRequest.getTitle(),
//                boardUpdateRequest.getContent(),
//                boardUpdateRequest.getCategory()
//        );
//
//        return updatedBoardId;
//    }
}
