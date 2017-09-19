package daldal.domain;

public class VideoComment {
	
	private int videoCommentId;
	private int videoId;
	private String authorId;
	private String videoComment;
	private int videoCommentDate;
	
	public VideoComment() {
	}
	
	public VideoComment(String videoComment) {
		this.videoComment = videoComment;
	}

	public int getVideoCommentId() {
		return videoCommentId;
	}

	public void setVideoCommentId(int videoCommentId) {
		this.videoCommentId = videoCommentId;
	}

	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getVideoComment() {
		return videoComment;
	}

	public void setVideoComment(String videoComment) {
		this.videoComment = videoComment;
	}

	public int getVideoCommentDate() {
		return videoCommentDate;
	}

	public void setVideoCommentDate(int videoCommentDate) {
		this.videoCommentDate = videoCommentDate;
	}

	@Override
	public String toString() {
		return "VideoComment [videoCommentId=" + videoCommentId + ", videoId=" + videoId + ", authorId=" + authorId
				+ ", videoComment=" + videoComment + ", videoCommentDate=" + videoCommentDate + "]";
	}
	
}
