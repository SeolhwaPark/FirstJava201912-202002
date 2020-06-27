package member;

public class Member {
	String userid;
	String name;
	int nai;

	Member() {
	}

	Member(String userid, String name, int nai) {
		this.userid = userid;
		this.name = name;
		this.nai = nai;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) { // 동일한 객체라면.. 아이디검사
			Member m = (Member) obj;
			return m.userid.equalsIgnoreCase(userid);
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		return userid + "\t" + name + "\t" + nai;
	}

}
