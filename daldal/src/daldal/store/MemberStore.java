package daldal.store;

import daldal.domain.Member;

public interface MemberStore {
	
	void create(Member member);
	MemberStore retrieve(String memberId);
	void update(Member member);
	void delete(String memberId);

}
