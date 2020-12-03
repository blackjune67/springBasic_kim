package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class Member {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)//이것은 PK
    //임의의 값
    private Long id;

    //@Column(name="userName")
    private String name;

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
