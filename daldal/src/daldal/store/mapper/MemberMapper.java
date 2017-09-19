package daldal.store.mapper;

import daldal.store.MemberStore;

public interface MemberMapper {
	
	void create(MemberStore member);
	MemberStore retrieve(String memberId);
	void update(MemberStore member);
	void delete(String memberId);

}
