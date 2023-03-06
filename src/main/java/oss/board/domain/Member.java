package oss.board.domain;

public class Member {
    private Long id; //아이디 식별자
    private String name; //고객이름

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
