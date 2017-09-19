package daldal.store.mapper;

import daldal.domain.MiniHomePage;

public interface MiniHomePageMapper {
	
	void create(MiniHomePage homePage);
	MiniHomePage retrieve(int coupleId);
	void update(MiniHomePage homePage);
	void deleteAll(int coupleId);

}
