package daldal.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import daldal.domain.Story;
import daldal.store.StoryStore;
import daldal.store.mapper.StoryMapper;

public class StoryStoreLogic implements StoryStore {

	@Override
	public void upload(Story story) {
		SqlSession session = DaldalSessionFactory.getInstance().getSession();

		try {
			StoryMapper mapper = session.getMapper(StoryMapper.class);
			mapper.insert(story);
			session.commit();
		} finally {
			session.close();
		}
		
	}

	@Override
	public List<Story> retrieveAll(int coupleId) {
		SqlSession session = DaldalSessionFactory.getInstance().getSession();
		List<Story> list = null;
		try {
			StoryMapper mapper = session.getMapper(StoryMapper.class);
			list = mapper.selectAll();	
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public Story retrieve(int storyId) {
		SqlSession session = DaldalSessionFactory.getInstance().getSession();
		
		Story story = null;
		
		try {
			StoryMapper mapper = session.getMapper(StoryMapper.class);
			story = mapper.select(storyId);
		} finally {
			session.close();
		}
		return story;
	}

	@Override
	public void delete(int storyId) {
		SqlSession session = DaldalSessionFactory.getInstance().getSession();
		
		try {
			StoryMapper mapper = session.getMapper(StoryMapper.class);
			mapper.delete(storyId);
			session.commit();
		} finally {
			session.close();
		}
		
	}

	@Override
	public void update(Story story) {
		SqlSession session = DaldalSessionFactory.getInstance().getSession();
		
		try {
			StoryMapper mapper = session.getMapper(StoryMapper.class);
			mapper.update(story);
			session.commit();
		} finally {
			session.close();
		}
		
	}

	@Override
	public void deleteAll(int coupleId) {
		SqlSession session = DaldalSessionFactory.getInstance().getSession();
		
		try {
			StoryMapper mapper = session.getMapper(StoryMapper.class);
			mapper.delete(coupleId);
			session.commit();
		} finally {
			session.close();
		}
		
	}

	

}
