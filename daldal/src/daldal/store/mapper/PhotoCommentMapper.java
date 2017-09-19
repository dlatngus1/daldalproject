package daldal.store.mapper;

import java.util.List;

import daldal.domain.PhotoComment;

public interface PhotoCommentMapper {
	
	PhotoComment create(PhotoComment photoComments);
	List<PhotoComment> retrieveAll(int photoId);
	void delete(int photoCommentId);
	void deleteAll(int photoId);

}
