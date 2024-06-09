package library;

import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
    private List<Member> members = new ArrayList<>();
    public void addMember(Member member){
        members.add(member);
    }
    public Member getMemberById(int id){
        for(Member member : members){
            if(member.getId() == id){
                return member;
            }
        }
    return null;
    }
    public List<Member> getAllMembers(){
        return members;
    }
    public void removeMember(int id){
        members.removeIf(member -> member.getId()==id);
    }
}
