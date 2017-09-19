package daldal.domain;

public class Member {
	
	private String memberId;
	private String halfId;
	private int coupleId;
	private String password;
	private String nickName;
	private int phoneNumber;
	private int birthDate;
	
	public Member() {
	}
	
	public Member(String memberId, String password, String nickName, int phoneNumber, int birthDate) {
		this.memberId = memberId;
		this.password = password;
		this.nickName = nickName;
		this.phoneNumber = phoneNumber;
		this.birthDate = birthDate;
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

	public int getCoupleId() {
		return coupleId;
	}

	public void setCoupleId(int coupleId) {
		this.coupleId = coupleId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", halfId=" + halfId + ", coupleId=" + coupleId + ", password="
				+ password + ", nickName=" + nickName + ", phoneNumber=" + phoneNumber + ", birthDate=" + birthDate
				+ "]";
	}
	
}
