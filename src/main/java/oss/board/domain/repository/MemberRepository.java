package oss.board.domain.repository;

import oss.board.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member>findById(Long id);
    Optional<Member>findById(String name); //optional을 감싸서 쓰면 아무것도 안하면 null 로 반환된다. 자바 8부터 된다.
    List<Member> findAll();

}
