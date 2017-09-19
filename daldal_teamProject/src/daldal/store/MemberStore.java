package daldal.store;

public interface MemberStore {
	
	void create(MemberStore member);
	MemberStore retrieve(String memberId);
	void update(MemberStore member);
	void delete(String memberId);

}
