package com.example.study.member.entity.member;

import com.example.study.support.MySchemaConstants;
import com.example.study.support.UuidBaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.OffsetDateTime;
import java.util.UUID;

import static com.example.study.support.Constants.DEFAULT_TIMEZONE_ID;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Table(
        name = MySchemaConstants.TB_FAVOR_BOOK,
        schema = MySchemaConstants.SCHEMA
        //		catalog = MySchemaConstants.SCHEMA
)
public class MemberFavorBook extends UuidBaseEntity {
    @Column
    private UUID memberId;
    @Column
    private UUID bookId;
    @Column
    private String favorBookName;
    @Column
    @Builder.Default
    private OffsetDateTime createAt = OffsetDateTime.now(DEFAULT_TIMEZONE_ID);
}