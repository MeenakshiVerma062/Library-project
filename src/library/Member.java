package library;
// Module
public class Member {
    private int id;
    private String name;
    private String membershipType;
    // Constructor
    public Member(int id, String name, String membershipType){
        this.id = id;
        this.name = name;
        this.membershipType = membershipType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
    // Method
    public void displayDetails(){
        System.out.println("Member ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("MembershipType: "+membershipType);
    }
}
