package daldal.store.mapper;

import java.util.List;

import daldal.domain.Photo;

public interface PhotoMapper {
	
	void upload(Photo photo);
	List<Photo> retrieveAll(int coupleId);
	Photo retrieve(int photoId);
	void delete(int photoId);
	void update(Photo photo);
	void deleteAll(int coupleId);

}
