package com.example.study.member.config;

import javax.sql.DataSource;

import com.example.study.member.util.security.EncoderFactory;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


import lombok.RequiredArgsConstructor;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.security.Key;

@Configuration
@RequiredArgsConstructor
public class SecurityConfig{



    private final DataSource dataSource;// 임포트 패키지 주의
    private final EncoderFactory encoderFactory;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity hs) throws Exception {
        hs
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .formLogin().disable()
                .httpBasic().disable()
                .authorizeRequests()
                .antMatchers("/login").permitAll();
//                .and()
//                .addFilterBefore(new JwtAuthenticationFilter(jwtTokenProvider), UsernamePasswordAuthenticationFilter.class);

        return hs.build();
    }


    // 단방향 비밀번호 암호화
    @Bean
    public PasswordEncoder passwordEncoder() {
        // return PasswordEncoderFactories.createDelegatingPasswordEncoder();
        // return encoderFactory.createEncoder(EncoderType.BCRYPT);
        return encoderFactory.defaultEncoder();
    }


}