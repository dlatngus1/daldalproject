package daldal.service.logic;

import java.util.List;

import daldal.domain.Story;
import daldal.domain.StoryComment;
import daldal.service.StoryService;
import daldal.store.StoryCommentStore;
import daldal.store.StoryStore;
import daldal.store.logic.StoryCommentStoreLogic;
import daldal.store.logic.StoryStoreLogic;

public class StoryServiceLogic implements StoryService{

	private StoryStore storyStore;
	private StoryCommentStore storyCommentStore;
	
	public StoryServiceLogic() {
		storyStore = new StoryStoreLogic();
		storyCommentStore = new StoryCommentStoreLogic(); 
	}
	@Override
	public void storyRegister(Story story) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Story> storyFindAll(int coupleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Story storyFind(int storyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StoryComment> findStoryComments(int storyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void storyRemove(int storyId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAllStoryComments(int storyId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void storyModify(Story story) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerStoryComment(StoryComment comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeStoryComment(int storyCommentId) {
		// TODO Auto-generated method stub
		
	}

}
