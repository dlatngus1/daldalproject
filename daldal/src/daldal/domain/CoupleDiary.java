package daldal.domain;

public class CoupleDiary {
	
	private int diaryId;
	private int coupleId;
	private String authorId;
	private String diaryDate;
	private String diaryWeather;
	private String diaryTitle;
	private String diaryContent;
	
	public CoupleDiary() {
	}
	
	public CoupleDiary(String diaryDate, String diaryWeather, String diaryTitle, String diaryContent) {
		this.diaryDate = diaryDate;
		this.diaryWeather = diaryWeather;
		this.diaryTitle = diaryTitle;
		this.diaryContent = diaryContent;
	}

	public int getDiaryId() {
		return diaryId;
	}

	public void setDiaryId(int diaryId) {
		this.diaryId = diaryId;
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

	public String getDiaryDate() {
		return diaryDate;
	}

	public void setDiaryDate(String diaryDate) {
		this.diaryDate = diaryDate;
	}

	public String getDiaryWeather() {
		return diaryWeather;
	}

	public void setDiaryWeather(String diaryWeather) {
		this.diaryWeather = diaryWeather;
	}

	public String getDiaryTitle() {
		return diaryTitle;
	}

	public void setDiaryTitle(String diaryTitle) {
		this.diaryTitle = diaryTitle;
	}

	public String getDiaryContent() {
		return diaryContent;
	}

	public void setDiaryContent(String diaryContent) {
		this.diaryContent = diaryContent;
	}

	@Override
	public String toString() {
		return "CoupleDiary [diaryId=" + diaryId + ", coupleId=" + coupleId + ", authorId=" + authorId + ", diaryDate="
				+ diaryDate + ", diaryWeather=" + diaryWeather + ", diaryTitle=" + diaryTitle + ", diaryContent="
				+ diaryContent + "]";
	}
	
}
