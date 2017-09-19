package daldal.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import daldal.domain.StoryComment;
import daldal.store.StoryCommentStore;
import daldal.store.mapper.StoryCommentMapper;

public class StoryCommentStoreLogic implements StoryCommentStore{

	@Override
	public StoryComment create(StoryComment storyComments) {
		SqlSession session = DaldalSessionFactory.getInstance().getSession();
		
		try {
			StoryCommentMapper mapper = session.getMapper(StoryCommentMapper.class);
			mapper.create(storyComments);
			session.commit();
		}finally {
			session.close();
		}
		return storyComments;
	}

	@Override
	public List<StoryComment> retrieveAll(int storyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int storyCommentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(int storyId) {
		// TODO Auto-generated method stub
		
	}

}
