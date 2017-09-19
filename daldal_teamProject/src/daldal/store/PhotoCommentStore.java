package daldal.store;

import java.util.List;

import daldal.domain.PhotoComment;

public interface PhotoCommentStore {
	
	PhotoComment create(PhotoComment photoComments);
	List<PhotoComment> retrieveAll(int photoId);
	void delete(int photoCommentId);
	void deleteAll(int photoId);

}
