package daldal.service;

import daldal.domain.MiniHomePage;

public interface MiniHomePageService {
	
	void homeRegister(MiniHomePage homePage);
	MiniHomePage homeFind(int coupleId);
	void homeModify(MiniHomePage homePage);
	void removeAll(int coupleId);

}
