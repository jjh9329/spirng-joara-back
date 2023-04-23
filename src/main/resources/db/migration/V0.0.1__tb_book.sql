--작품(BookGenre)장르 테이블
CREATE TABLE IF NOT EXISTS joara_basic.book_genre (
    id                  UUID                                PRIMARY KEY,
    genre_name          VARCHAR(30)                         NOT NULL
);

--작품(Book)테이블
CREATE TABLE IF NOT EXISTS joara_basic.book (
    id                  UUID                                PRIMARY KEY,
    member_id           UUID                                ,
    genre_id            UUID                                NOT NULL,
    isbn_cip            VARCHAR(30)                         ,
    book_title          VARCHAR(30)                         NOT NULL,
    book_description    TEXT                                NOT NULL,
    book_cover          VARCHAR(255)                        ,
    avg_score           INTEGER                             ,
    create_at           DATE                                NOT NULL,
    update_at           DATE                                ,
    delete_at           DATE
);

--작품태그 목록(BookTag)테이블
CREATE TABLE IF NOT EXISTS joara_basic.book_tag (
    id                  UUID                                PRIMARY KEY,
    book_id             UUID                                NOT NULL
);