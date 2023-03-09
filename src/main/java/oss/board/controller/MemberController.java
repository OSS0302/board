package oss.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import oss.board.domain.Member;
import oss.board.service.MemberService;

import java.util.List;

@Controller
public class MemberController {
    private final MemberService memberService;
    @Autowired //스프링부트 컨트롤러와 memberService 가 자동으로 연결하는 어노테이션 된다.
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
    @GetMapping("/members/new")
    public String createForm(){
        return "members/createMemberForm";
    }
    @PostMapping("/members/new")
    public String create(MembersForm form){
        Member member =new Member();
        member.setName(form.getName());

        System.out.println("member.getName() = " + member.getName()); //sotuv
        memberService.join(member);
        return "redirect:/";
    }
    @GetMapping("/members")
    public String list(Model model){
        List<Member>members = memberService.findMember();
        model.addAttribute("members",members);
        return "members/memberList";
    }
}