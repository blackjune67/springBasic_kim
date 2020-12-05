package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class MemmoryMemberRepositoryTest {

    //MemberRepository memberRepository = new MemoryMemberRepository();
    MemoryMemberRepository memberRepository = new MemoryMemberRepository();

    //테스트가 되고 나면 저장된 데이터를 지움.
    @AfterEach
    public void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    public void 회원가입() {
        Member member = new Member();
        member.setName("spring1234");
        memberRepository.save(member);
        Member result = memberRepository.findById(member.getId()).get();

        //Assertions.assertEquals(member, result);
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("hajune1");
        memberRepository.save(member1);

        Member member2 = new Member();
        member2.setName("hajune2");
        memberRepository.save(member2);

        Member resutlt =  memberRepository.findByName("hajune1").get();
        Member resutlt2 =  memberRepository.findByName("hajune2").get();

        assertThat(member1).isEqualTo(resutlt);
        assertThat(member2).isEqualTo(resutlt2);
    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("hajune1");
        memberRepository.save(member1);

        Member member2 = new Member();
        member1.setName("hajune2");
        memberRepository.save(member2);

        List<Member> result = memberRepository.findAll();

        assertThat(result.size()).isEqualTo(2);

    }

}
