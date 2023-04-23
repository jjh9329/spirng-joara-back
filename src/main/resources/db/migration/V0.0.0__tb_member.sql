--스키마 이름
CREATE SCHEMA IF NOT EXISTS joara_basic;

--토큰(Token)테이블
CREATE TABLE IF NOT EXISTS joara_basic.refresh_token (
    id                  UUID                                PRIMARY KEY,
    member_id           UUID                                NOT NULL,
    refresh_token       VARCHAR(255)                        ,
    create_at           DATE                                NOT NULL,
    update_at           DATE                                ,
    delete_at           DATE
);

--회원(Member)테이블
CREATE TABLE IF NOT EXISTS joara_basic.member (
    id                  UUID                                PRIMARY KEY,
    email               VARCHAR(30)                         NOT NULL        UNIQUE,
    password            VARCHAR(255)                        NOT NULL,
    name                VARCHAR(30)                         NOT NULL,
    nickname            VARCHAR(30)                         NOT NULL        UNIQUE,
    phone               VARCHAR(30)                         ,
    gender              CHAR(1)                             ,
    birth               VARCHAR(30)                         ,
    create_at          DATE                                NOT NULL,
    update_at           DATE                                ,
    delete_at           DATE                                ,
    status              VARCHAR(30)
);

CREATE UNIQUE INDEX udx_member_email ON joara_basic.member(email);


--회원선호장르(MemberFavorGenre)테이블
CREATE TABLE IF NOT EXISTS joara_basic.member_favor_genre (
    id                  UUID                                PRIMARY KEY,
    genre_id            UUID                                NOT NULL,
    member_id           UUID                                NOT NULL,
    favor_genre_name    VARCHAR(30)                         ,
    create_at          DATE                                 NOT NULL
);

CREATE TABLE IF NOT EXISTS joara_basic.member_favor_book (
    id                  UUID                                PRIMARY KEY,
    member_id           UUID                                NOT NULL,
    book_id             UUID                                NOT NULL,
    favor_book_name     VARCHAR(30)                         NOT NULL,
    create_at          DATE                                NOT NULL
);