package daldal.service;

import java.util.List;

import daldal.domain.Member;

public interface MemberService {
	
	void register(Member member);
	Member find(String memberId);
	void modify(Member member);
	void remove(String memberId);
	
	//커플연결 메소드 추가
	void coupleMatching(List<Member> members); 

}
