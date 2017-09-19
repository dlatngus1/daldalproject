package daldal.service;

import java.util.List;

import daldal.domain.Video;
import daldal.domain.VideoComment;

public interface VideoService {
	
	void videoRegister(Video video);
	List<Video> videoFindAll(int coupleId);
	Video videoFind(int videoId);
	List<VideoComment> findVideComments(int videoId);
	void videoRemove(int videoId);
	void removeAllVideoComments(int videoId);
	void videoModify(Video video);
	void registerVideoComment(VideoComment comment);
	void removeVideoComment(int videoCommentId);

}
