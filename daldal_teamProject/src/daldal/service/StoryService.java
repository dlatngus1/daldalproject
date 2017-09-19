package daldal.service;

import java.util.List;

import daldal.domain.Story;
import daldal.domain.StoryComment;

public interface StoryService {
	
	void storyRegister(Story story);
	List<Story> storyFindAll(int coupleId);
	Story storyFind(int storyId);
	List<StoryComment> findStoryComments(int storyId);
	void storyRemove(int storyId);
	void removeAllStoryComments(int storyId);
	void storyModify(Story story);
	void registerStoryComment(StoryComment comment);
	void removeStoryComment(int storyCommentId);

}
