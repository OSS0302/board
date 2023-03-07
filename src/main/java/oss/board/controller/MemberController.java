package oss.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import oss.board.service.MemberService;

@Controller
public class MemberController {
    private final MemberService memberService;
    @Autowired //스프링부트 컨트롤러와 memberService 가 자동으로 연결하는 어노테이ㄹ
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}