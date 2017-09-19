package daldal.store.mapper;

import java.util.List;

import daldal.domain.Video;

public interface VideoMapper {
	
	void upload(Video video);
	List<Video> retrieveAll(int coupleId);
	Video retrieve(int videoId);
	void delete(int videoId);
	void update(Video video);
	void deleteAll(int coupleId);

}
