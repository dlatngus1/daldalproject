package daldal.service;

import java.util.List;

import daldal.domain.Photo;
import daldal.domain.PhotoComment;

public interface PhotoService {
	
	void photoRegister(Photo photo);
	List<Photo> photoFindAll(int coupleId);
	Photo photoFind(int photoId);
	List<PhotoComment> findPhotoComments(int photoId);
	void photoRemove(int photoId);
	void removeAllPhotoComments(int photoId);
	void photoModify(Photo photo);
	void registerPhotoComment(PhotoComment comment);
	void removePhotoComment(int photoCommentId);

}
