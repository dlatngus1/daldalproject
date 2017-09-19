package daldal.store;

import daldal.domain.MiniHomePage;

public interface MiniHomePageStore {
	
	void create(MiniHomePage homePage);
	MiniHomePage retrieve(int coupleId);
	void update(MiniHomePage homePage);
	void deleteAll(int coupleId);

}
