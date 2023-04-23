package com.example.study.member.service.book;

import com.example.study.member.api.dto.BookRegisterDto;
import com.example.study.member.api.dto.BookRegisterDto.*;

public interface BookService {
    public boolean writeBook(BookWriteRequestDto dto);
}
