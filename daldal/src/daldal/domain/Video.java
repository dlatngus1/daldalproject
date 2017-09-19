package daldal.domain;

import java.util.List;

public class Video {
	
	private int videoId;
	private int coupleId;
	private String authorId;
	private String videoTitle;
	private String videoContent;
	private String videoFile;
	private int videoDate;
	private List<VideoComment> videoComments;
	
	public Video() {
	}
	
	public Video(String videoTitle, String videoContent, String videoFile) {
		this.videoTitle = videoTitle;
		this.videoContent = videoContent;
		this.videoFile = videoFile;
	}

	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
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

	public String getVideoTitle() {
		return videoTitle;
	}

	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}

	public String getVideoContent() {
		return videoContent;
	}

	public void setVideoContent(String videoContent) {
		this.videoContent = videoContent;
	}

	public String getVideoFile() {
		return videoFile;
	}

	public void setVideoFile(String videoFile) {
		this.videoFile = videoFile;
	}

	public int getVideoDate() {
		return videoDate;
	}

	public void setVideoDate(int videoDate) {
		this.videoDate = videoDate;
	}

	public List<VideoComment> getVideoComments() {
		return videoComments;
	}

	public void setVideoComments(List<VideoComment> videoComments) {
		this.videoComments = videoComments;
	}

	@Override
	public String toString() {
		return "Video [videoId=" + videoId + ", coupleId=" + coupleId + ", authorId=" + authorId + ", videoTitle="
				+ videoTitle + ", videoContent=" + videoContent + ", videoFile=" + videoFile + ", videoDate="
				+ videoDate + ", videoComments=" + videoComments + "]";
	}
	
}
