package com.example.study.member.api.dto;

import java.util.UUID;

public record BookRegisterDto() {
    public record BookWriteRequestDto(
        UUID memberId,
        UUID genreId,
        String ISBN_CIP,
        String bookTitle,
        String bookDescription,
        String bookCover,
        Integer avgScore
        //BookGenre genre_name
    ){}
    public record BookWriteResponseDto(
            boolean  success
    ) {}
}
