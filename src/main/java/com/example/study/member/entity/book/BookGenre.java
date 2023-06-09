package com.example.study.member.entity.book;

import com.example.study.support.MySchemaConstants;
import com.example.study.support.UuidBaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Table(
        name = MySchemaConstants.TB_BOOK_GENRE,
        schema = MySchemaConstants.SCHEMA
        //		catalog = MySchemaConstants.SCHEMA
)
public class BookGenre extends UuidBaseEntity {
    @Column
    private String genreName;
}
