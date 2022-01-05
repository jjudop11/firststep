package test.chap05.mvc.model.vo;

public class Member {
	
	private String memberld;
	private	String memberPwd;
	private String memberName;
	private String citizenNo;
	private double height;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String memberld, String memberPwd, String memberName, String citizenNo, double height) {
		super();
		this.memberld = memberld;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.citizenNo = citizenNo;
		this.height = height;
	}

	public String getMemberld() {
		return memberld;
	}

	public void setMemberld(String memberld) {
		this.memberld = memberld;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getCitizenNo() {
		return citizenNo;
	}

	public void setCitizenNo(String citizenNo) {
		this.citizenNo = citizenNo;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String information() {
		return "Member [memberld=" + memberld + ", memberPwd=" + memberPwd + ", memberName=" + memberName
				+ ", citizenNo=" + citizenNo + ", height=" + height + "]";
	}
	
	
	
	
	
}
