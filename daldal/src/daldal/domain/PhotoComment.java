package daldal.domain;

public class PhotoComment {
	
	private int photoCommentId;
	private int photoId;
	private String authorId;
	private String photoComment;
	private int photoComentDate;
	
	public PhotoComment() {
	}
	
	public PhotoComment(String photoComment) {
		this.photoComment = photoComment;
	}

	public int getPhotoCommentId() {
		return photoCommentId;
	}

	public void setPhotoCommentId(int photoCommentId) {
		this.photoCommentId = photoCommentId;
	}

	public int getPhotoId() {
		return photoId;
	}

	public void setPhotoId(int photoId) {
		this.photoId = photoId;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getPhotoComment() {
		return photoComment;
	}

	public void setPhotoComment(String photoComment) {
		this.photoComment = photoComment;
	}

	public int getPhotoComentDate() {
		return photoComentDate;
	}

	public void setPhotoComentDate(int photoComentDate) {
		this.photoComentDate = photoComentDate;
	}

	@Override
	public String toString() {
		return "PhotoComment [photoCommentId=" + photoCommentId + ", photoId=" + photoId + ", authorId=" + authorId
				+ ", photoComment=" + photoComment + ", photoComentDate=" + photoComentDate + "]";
	}
	
}
