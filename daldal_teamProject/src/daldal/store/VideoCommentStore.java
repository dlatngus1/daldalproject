package daldal.store;

import java.util.List;

import daldal.domain.VideoComment;

public interface VideoCommentStore {
	
	VideoComment create(VideoComment videoComments);
	List<VideoComment> retrieveAll(int videoId);
	void delete(int videoCommentId);
	void deleteAll(int videoId);

}
