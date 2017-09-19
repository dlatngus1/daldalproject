package daldal.store.mapper;

import java.util.List;

import daldal.domain.Video;

public interface VideoMapper {
    void insert(Video board);
    Video select(int boardId);
    void update(Video board);
    void delete(int boardId);
	List<Video> selectAll();
}
