package daldal.domain;

import java.util.List;

public class Story {
	
	private int storyId;
	private int coupleId;
	private String authorId;
	private String storyContent;
	private int storyDate;
	private List<StoryComment> storyComments;
	
	public Story() {
	}
	
	public Story(String storyContent) {
		this.storyContent = storyContent;
	}

	public int getStoryId() {
		return storyId;
	}

	public void setStoryId(int storyId) {
		this.storyId = storyId;
	}

	public int getCoupleId() {
		return coupleId;
	}

	public void setCoupleId(int coupleId) {
		this.coupleId = coupleId;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getStoryContent() {
		return storyContent;
	}

	public void setStoryContent(String storyContent) {
		this.storyContent = storyContent;
	}

	public int getStoryDate() {
		return storyDate;
	}

	public void setStoryDate(int storyDate) {
		this.storyDate = storyDate;
	}

	public List<StoryComment> getStoryComments() {
		return storyComments;
	}

	public void setStoryComments(List<StoryComment> storyComments) {
		this.storyComments = storyComments;
	}

	@Override
	public String toString() {
		return "Story [storyId=" + storyId + ", coupleId=" + coupleId + ", authorId=" + authorId + ", storyContent="
				+ storyContent + ", storyDate=" + storyDate + ", storyComments=" + storyComments + "]";
	}
	
}
