package a11_3;

public class Member {
	purblic String id;
	
	public member(String id) {
		this.id = id; 
	}

	@Override
	public boolean equals (Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
