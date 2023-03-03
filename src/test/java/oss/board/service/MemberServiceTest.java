package oss.board.service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import oss.board.domain.Member;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {
    MemberService memberService = new MemberService();
    @Test
    void 회원가입() {
        // given
        Member member = new Member();
        member.setName("hello");
        //when
        Long saveId =memberService.join(member);
        //than
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }
    @Test
    public void 중복_회원_예외(){
        //given
        Member member1=new Member();
        member1.setName("spring");

        Member member2=new Member();
        member2.setName("spring");

        //when
        memberService.join(member1);


        

        //than

    }


    @Test
    void findMember() {
    }

    @Test
    void findOne() {
    }
}