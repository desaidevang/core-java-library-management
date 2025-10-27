package Repo;
import Entity.Book;
import Entity.Member;

import java.util.ArrayList;

public class MemberRepository {
    private ArrayList<Member> members = new ArrayList<>();


    public void FindAll(){
        System.out.println("=".repeat(30)+ "MEMBER LIST "+ "=".repeat(30));
        for (Member b : members){
            System.out.println("ID: " + b.getId() + " NAME: "+b.getName());
        }
    }
    public int memberCount(){
        return members.size();
    }
    public void addMember(Member member) {
        members.add(member);
    }
    public String getMemberNameById(int id) {
        for (Member b : members) {
            if (b.getId() == id) {
                return b.getName();
            }
        }
        return null; // not found
    }

    public boolean findMember(int id){
        for (Member b: members){
            if (b.getId() == id){
                return true;
            }

        }
        return  false;
    }
    public Member getMemberById(int id){
        for (Member m: members){
            if (id == m.getId()){
                return m;
            }
        }
        return  null;
    }
}
