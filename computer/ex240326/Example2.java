package kr.ac.ync.computer.ex240326;

import java.lang.reflect.Array;
import java.util.ArrayList;
class Member{
    int age;
    String name;
}
public class Example2 {

    //동적배열

    public static void main(String[] args) {
        int [][] array = new int[10][10];
        //Member[] members = new Member[10];
        ArrayList<Member> members = new ArrayList<>(); //생성
        //CRUD
        Member member = new Member();
        members.add(member); //추가
        members.add(new Member());
//        members1.remove(member2); //삭제
//        members1.remove(0);
        // size() : ArrayList의 요소의 사이즈
        for(int i = 0; i <members.size(); i++){ //조회
            Member member1 =members.get(i); //get
        }
        for (Member m : members){ //수정
            if(m.name.equals("lee")){
                m.name = "lee2";
                m.age = 20;
            }
        }
    }
}
