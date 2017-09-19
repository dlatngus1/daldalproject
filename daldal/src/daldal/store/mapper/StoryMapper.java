package daldal.store.mapper;

import java.util.List;

import daldal.domain.Story;

public interface StoryMapper {
	
	void upload(Story story);
	List<Story> retrieveAll(int coupleId);
	Story retrieve(int storyId);
	void delete(int storyId);
	void update(Story story);
	void deleteAll(int coupleId);

}
