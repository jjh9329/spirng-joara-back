package com.example.study.member.api;

import static com.example.study.member.api.dto.BookRegisterDto.*;

import com.example.study.member.service.book.BookService;
import com.example.study.member.service.book.BookWriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class BookApi {

    private final BookService bookService;
    @PostMapping("/write")
    public BookWriteResponseDto write(
            @RequestBody @Valid BookWriteRequestDto body
    ) {
        // 서비스에 보내준후 wirteBook을 실행후 responseDto에 담아 생성
        return new BookWriteResponseDto(bookService.writeBook(body));
    }
    @PostMapping("/{bid}")
    public String write2(
            @RequestBody @Valid BookWriteRequestDto body
    ) {
        //Long boardId = bookWriteService.writeBook(userId, boardWriteRequest);
        return "성공";
    }

}
