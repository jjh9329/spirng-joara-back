package com.example.study.member.service.member;

import com.example.study.member.entity.member.Member;
import com.example.study.member.entity.types.AccountStatus;
import com.example.study.member.repository.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import static com.example.study.member.api.dto.MemberRegisterDto.MemberSignUpRequestDto;

@Service
@RequiredArgsConstructor
public final class DefaultMemberService implements MemberService{
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public boolean signUp(MemberSignUpRequestDto dto) {
        String rawPassword = dto.rawPassword(); //request로 가져온 비밀번호
        String digest = passwordEncoder.encode(rawPassword); // 가져온 비밀번호를 해싱(bycript)

        Member member = Member.builder()
                .email(dto.email())
                .password(digest) // FIXME hash it.
                .nickname(dto.nickname())
                .name(dto.name())
                .gender(dto.gender())
                .status(AccountStatus.ACTIVE)
                .build();
        memberRepository.save(member);
        return true;
    }
//    @Transactional
//    public String logIn(MemberLoginRequestDto dto) {
//        Member member = memberFindService.findByEmail(dto.email());
//        checkMatchedPassword(dto.rawPassword(), member.getPassword());
//        return member.getEmail();
//    }
//    private void checkDuplicatedEmail(String email) {
//        if (memberRepository.findByEmail(email).isPresent()) {
//            throw new DuplicatedEmailException(String.format("[ %s ]" + " already exist.", email));
//        }
//    }
//    private void checkMatchedPassword(String loginPassword, String userPassword) {
//        if (!loginPassword.equals(userPassword)) {
//            throw new UnMatchedPasswordException(String.format("Password is not matched"));
//        }
//    }


}
