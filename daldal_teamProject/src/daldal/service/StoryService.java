package daldal.service;

import java.util.List;

import daldal.domain.Story;
import daldal.domain.StoryComment;

public interface StoryService {
	//게시글 등록
	void storyRegister(Story story);
	
	//게시글 목록 출력
	List<Story> storyFindAll(int coupleId);
	
	//게시물 내부 보기
	Story storyFind(int storyId);
	
	//게시글 내부 댓글 보기
	List<StoryComment> findStoryComments(int storyId);
	
	//게시글 삭제
	void storyRemove(int storyId);
	
	//게시글 삭제시 게시글에 딸린 댓글 전체삭제
	void removeAllStoryComments(int storyId);
	
	//게시글 수정
	void storyModify(Story story);
	
	//댓글등록
	void registerStoryComment(StoryComment comment);
	
	//댓글 삭제
	void removeStoryComment(int storyCommentId);

}
