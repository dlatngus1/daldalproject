package daldal.domain;

public class StoryComment {
	
	private int storyCommentId;
	private int storyId;
	private String authorId;
	private String storyComment;
	private int storyCommentDate;
	
	public StoryComment() {
	}
	
	public StoryComment(String storyComment) {
		this.storyComment = storyComment;
	}

	public int getStoryCommentId() {
		return storyCommentId;
	}

	public void setStoryCommentId(int storyCommentId) {
		this.storyCommentId = storyCommentId;
	}

	public int getStoryId() {
		return storyId;
	}

	public void setStoryId(int storyId) {
		this.storyId = storyId;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getStoryComment() {
		return storyComment;
	}

	public void setStoryComment(String storyComment) {
		this.storyComment = storyComment;
	}

	public int getStoryCommentDate() {
		return storyCommentDate;
	}

	public void setStoryCommentDate(int storyCommentDate) {
		this.storyCommentDate = storyCommentDate;
	}

	@Override
	public String toString() {
		return "StoryComment [storyCommentId=" + storyCommentId + ", storyId=" + storyId + ", authorId=" + authorId
				+ ", storyComment=" + storyComment + ", storyCommentDate=" + storyCommentDate + "]";
	}
	
}
