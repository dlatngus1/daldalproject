package daldal.store.mapper;

import java.util.List;

import daldal.domain.CoupleDiary;

public interface CoupleDiaryMapper {

	void create(CoupleDiary coupleDiary);
	List<CoupleDiary> retrieve(int coupleId);
	void deleteAll(int coupleId);
	
}
