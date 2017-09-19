package daldal.service;

import java.util.List;

import daldal.domain.CoupleDiary;

public interface CoupleDiaryService {
	
	void diaryRegister(CoupleDiary coupleDiary);
	List<CoupleDiary> diaryFindAll(int coupleId);

}
