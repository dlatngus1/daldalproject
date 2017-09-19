package daldal.domain;

import java.util.List;

public class Photo {
	
	private int photoId;
	private int coupleId;
	private String authorId;
	private String photoTitle;
	private String photoContent;
	private String photoFile;
	private int photoDate;
	private List<PhotoComment> photoComments;
	
	public Photo() {
	}
	
	public Photo(String photoTitle, String photoContent, String photoFile) {
		this.photoTitle = photoTitle;
		this.photoContent = photoContent;
		this.photoFile = photoFile;
	}

	public int getPhotoId() {
		return photoId;
	}

	public void setPhotoId(int photoId) {
		this.photoId = photoId;
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

	public String getPhotoTitle() {
		return photoTitle;
	}

	public void setPhotoTitle(String photoTitle) {
		this.photoTitle = photoTitle;
	}

	public String getPhotoContent() {
		return photoContent;
	}

	public void setPhotoContent(String photoContent) {
		this.photoContent = photoContent;
	}

	public String getPhotoFile() {
		return photoFile;
	}

	public void setPhotoFile(String photoFile) {
		this.photoFile = photoFile;
	}

	public int getPhotoDate() {
		return photoDate;
	}

	public void setPhotoDate(int photoDate) {
		this.photoDate = photoDate;
	}

	public List<PhotoComment> getPhotoComments() {
		return photoComments;
	}

	public void setPhotoComments(List<PhotoComment> photoComments) {
		this.photoComments = photoComments;
	}

	@Override
	public String toString() {
		return "Photo [photoId=" + photoId + ", coupleId=" + coupleId + ", authorId=" + authorId + ", photoTitle="
				+ photoTitle + ", photoContent=" + photoContent + ", photoFile=" + photoFile + ", photoDate="
				+ photoDate + ", photoComments=" + photoComments + "]";
	}
	
}
