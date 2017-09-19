package daldal.store.mapper;

import java.util.List;

import daldal.domain.Story;



public interface StoryMapper {
    void insert(Story board);
    Story select(int boardId);
    void update(Story board);
    void delete(int boardId);
	List<Story> selectAll();
}
