package kr.ac.ync.computer.exam240326;

import java.util.ArrayList;

class Member {
    int age;
    String name;

    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class Example {
    // 동적배열
    public static void main(String[] args) {
//        Member[] members = new Member[100];
        ArrayList<Member> members = new ArrayList<>(); // 객체 생성
        members.add(new Member(10, "kim")); // 추가
        members.add(new Member(11, "lee")); // 추가
        members.add(new Member(12, "hong")); // 추가
        for (Member m : members) { // 조회
            if(m.name.equals("lee")){ // 변경
                m.name = "lee2";
                m.age = 20;
            }
        }
        // size() : ArrayList의 Member 객체(요소) 사이즈
        for (int i = 0; i < members.size(); i++) { // 조회
            Member member = members.get(i); // get
            System.out.println("나이 : " + member.age + " 이름 : " + member.name);
        }
        // members.remove(0); // 삭제
//        for (int i = 0; i < members.size(); i++) {
//            Member member = members.get(i); // get
//            System.out.println("나이 : " + member.age + " 이름 : " + member.name);
//        }

    }

}
