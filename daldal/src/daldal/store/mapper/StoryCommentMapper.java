package daldal.store.mapper;

import java.util.List;

import daldal.domain.StoryComment;

public interface StoryCommentMapper {
	
	StoryComment create(StoryComment storyComments);
	List<StoryComment> retrieveAll(int storyId);
	void delete(int storyCommentId);
	void deleteAll(int storyId);

}
