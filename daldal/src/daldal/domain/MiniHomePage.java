package daldal.domain;

public class MiniHomePage {
	
	private int coupleId;
	private String memberId;
	private String halfId;
	private int firstDate;
	private String homeTitle;
	private String mainImage;
	
	public MiniHomePage() {
	}
	
	public MiniHomePage(int firstDate, String homeTitle, String mainImage) {
		this.firstDate = firstDate;
		this.homeTitle = homeTitle;
		this.mainImage = mainImage;
	}

	public int getCoupleId() {
		return coupleId;
	}

	public void setCoupleId(int coupleId) {
		this.coupleId = coupleId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getHalfId() {
		return halfId;
	}

	public void setHalfId(String halfId) {
		this.halfId = halfId;
	}

	public int getFirstDate() {
		return firstDate;
	}

	public void setFirstDate(int firstDate) {
		this.firstDate = firstDate;
	}

	public String getHomeTitle() {
		return homeTitle;
	}

	public void setHomeTitle(String homeTitle) {
		this.homeTitle = homeTitle;
	}

	public String getMainImage() {
		return mainImage;
	}

	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

	@Override
	public String toString() {
		return "MiniHomePage [coupleId=" + coupleId + ", memberId=" + memberId + ", halfId=" + halfId + ", firstDate="
				+ firstDate + ", homeTitle=" + homeTitle + ", mainImage=" + mainImage + "]";
	}
	
}
