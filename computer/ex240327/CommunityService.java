package kr.ac.ync.computer.ex240327;

import kr.ac.ync.computer.ync.Student;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class CommunityService {

    private Scanner scan;

    private int choice;

    private String id;

    private String pass;

    private User user;

    private String name;

    private String hobby;

    private String phoneNumber;

    private ArrayList<Detail>details;

    private ArrayList<User> users;


    public CommunityService(){
        scan = new Scanner(System.in);
        users = new ArrayList<>();
    }

    public int login(){
        System.out.println("=====================");
        System.out.println("LOGIN");
        while (true) {
            System.out.println("=====================");
            System.out.print("아이디 : ");
            id = scan.next();
            System.out.printf("비밀번호 : ");
            pass = scan.next();
            for (User u : users) {
                if (Objects.equals(id, u.getId()) && Objects.equals(pass, u.getPassword())) {
                    System.out.println("로그인 성공!");
                    System.out.println(u.getName() + "님 환영합니다!");
                    return 0;
                }
            }
            System.out.println("로그인 정보가 틀립니다.");
            System.out.println("[다시 입력 : 1][나가기 : 2]");
            choice = scan.nextInt();
            if(choice == 1){
                System.out.println("다시 입력해주기 바랍니다.");
            } else if (choice == 2) {
                return 0;
            }
        }
    }
    public void register(){
        System.out.println("회원가입을 진행합니다..");
        details = new ArrayList<>();
        System.out.println("=====================");
        System.out.print("아이디 : ");
        id = scan.next();
        System.out.print("비밀번호 : ");
        pass = scan.next();
        System.out.println("상세정보 입력");
        System.out.print("이름 : ");
        name = scan.next();
        System.out.print("전화번호 : ");
        phoneNumber = scan.next();
        user = new User(id,pass,name,phoneNumber);
        System.out.println("관심 가지는 취미");
        System.out.println("취미로 알고리즘이 형성됩니다.");
        while(true) {
            System.out.print("취미 : ");
            hobby = scan.next();
            details.add(new Detail(hobby));
            System.out.println("더 등록하겠습니까?[예 : 1][아니요 : 2]");
            choice = scan.nextInt();
            if(choice == 1){
                continue;
            }else if(choice == 2){
                user.setDetails(details);
                break;
            }
        }
        System.out.println("회원가입 중....");
        users.add(user);
        System.out.println("회원가입이 완료되었습니다.");
    }

    public void getALL(){
        System.out.println("유저 조회");
        for(User m : users){
            System.out.println("아이디 : "+m.getId());
            System.out.println("비밀번호 : "+m.getPassword());
            System.out.println("이름 : "+m.getName());
            System.out.println("전화번호 : "+m.getPhoneNumber());
            System.out.print("취미 : ");
            for(Detail d : m.getDetails()){
                System.out.print("[ "+d.getHobby()+" ]");
            }
            System.out.println();
            System.out.println("=====================");
        }
    }

    public void findId(){
            System.out.println("아이디 찾기");
        while (true) {
            System.out.println("=====================");
            System.out.print("이름 : ");
            name = scan.next();
            System.out.print("전화번호 : ");
            phoneNumber = scan.next();
            System.out.println("찾으시는 아이디의");
            System.out.println("이름 : " + name);
            System.out.println("전화 번호 : " + phoneNumber);
            System.out.println("맞으시면 [1] 아니라면 [2]");
            choice = scan.nextInt();
            if (choice == 1) {
                for (User u : users) {
                    if (Objects.equals(name, u.getName()) && Objects.equals(phoneNumber, u.getPhoneNumber())) {
                        System.out.println(name + "님의 아이디");
                        System.out.println(u.getId());
                        break;
                    }
                }
                break;
            } else if (choice == 2) {
            }
        }
    }
    public void findpass(){
        System.out.println("비밀번호 찾기");
        while (true) {
            System.out.println("=====================");
            System.out.print("이름 : ");
            name = scan.next();
            System.out.print("전화번호 : ");
            phoneNumber = scan.next();
            System.out.printf("아이디 : ");
            id = scan.next();
            System.out.println("찾으시는 비밀번호의");
            System.out.println("이름 : " + name);
            System.out.println("전화 번호 : " + phoneNumber);
            System.out.println("아이디 : " + id);
            System.out.println("맞으시면 [1] 아니라면 [2]");
            choice = scan.nextInt();
            if (choice == 1) {
                for (User u : users) {
                    if (Objects.equals(name, u.getName()) && Objects.equals(phoneNumber, u.getPhoneNumber()) && Objects.equals(id , u.getId())) {
                        System.out.println(name + "님의 아이디 "+id+"의 비밀번호");
                        System.out.println(u.getPassword());
                        break;
                    }
                }
                break;
            } else if (choice == 2) {
            }
        }
    }

}
