package com.example.study.member.repository.member;

import com.example.study.member.entity.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface MemberRepository extends JpaRepository<Member,UUID> {
    Optional<Member> findByEmail(String email); //optional은 Null이 들어오는걸 처리해준다

}
