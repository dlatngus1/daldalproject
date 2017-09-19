package daldal.store;

import java.util.List;

import daldal.domain.CoupleDiary;

public interface CoupleDiaryStore {
	
	void create(CoupleDiary coupleDiary);
	List<CoupleDiary> retrieve(int coupleId);
	void deleteAll(int coupleId);

}
