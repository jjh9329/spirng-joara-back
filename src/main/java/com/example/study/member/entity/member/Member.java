package com.example.study.member.entity.member;

import com.example.study.member.entity.types.AccountStatus;
import com.example.study.member.entity.types.Gender;
import com.example.study.support.MySchemaConstants;
import com.example.study.support.UuidBaseEntity;
import lombok.*;

import javax.persistence.*;
import java.time.OffsetDateTime;

import static com.example.study.support.Constants.DEFAULT_TIMEZONE_ID;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Table(
        name = MySchemaConstants.TB_MEMBER,
        schema = MySchemaConstants.SCHEMA
//		catalog = MySchemaConstants.SCHEMA
)
public class Member extends UuidBaseEntity {
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String name;
    @Column
    private String nickname;
    @Column
    private String phone;
    @Column
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column
    private String birth;
    @Column
    @Builder.Default
    private OffsetDateTime createAt = OffsetDateTime.now(DEFAULT_TIMEZONE_ID);
    @Column
    private OffsetDateTime updateAt;
    @Column
    private OffsetDateTime deleteAt;
    @Column
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
}