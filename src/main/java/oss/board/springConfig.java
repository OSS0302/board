package oss.board;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import oss.board.repository.MemoryMemberRepository;
import oss.board.service.MemberService;

@Configuration
public class springConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }
    @Bean
    public MemoryMemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
