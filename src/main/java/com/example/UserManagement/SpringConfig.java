package com.example.UserManagement;

import com.example.UserManagement.repository.MemberRepository;
import com.example.UserManagement.repository.MemoryMemberRepository;
import com.example.UserManagement.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
