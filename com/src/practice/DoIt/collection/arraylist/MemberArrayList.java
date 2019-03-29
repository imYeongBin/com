package practice.DoIt.collection.arraylist;

import java.util.ArrayList;

import practice.DoIt.collection.Member;



public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for(int i=0; i<arrayList.size();i++) {
			Member member = arrayList.get(i);
			int tmpId = member.getMemberId();
			if(tmpId==memberId) {
				arrayList.remove(i);
				return true;
			}			
		}
		System.out.println(memberId+" 회원이 없습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}
