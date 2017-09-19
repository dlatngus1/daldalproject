package daldal.store;

import java.util.List;

import daldal.domain.StoryComment;

public interface StoryCommentStore {
	
	StoryComment create(StoryComment storyComments);
	List<StoryComment> retrieveAll(int storyId);
	void delete(int storyCommentId);
	void deleteAll(int storyId);

}
