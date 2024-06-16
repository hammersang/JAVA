package kr.ac.ync.computer.ex240327;

import kr.ac.ync.computer.ync.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManagementSystem {

    private Scanner scan;

    private int choice;

    private CommunityService communityService;

    private String id;

    private String Name;

    public UserManagementSystem(){
        System.out.println("[프로그램 준비중...]");
        scan = new Scanner(System.in);
        communityService = new CommunityService();
        System.out.println("[프로그램 준비완료]");
    }
    public void loginCheck(){

    }
    public  void excute(){
        while (true) {
            System.out.println("=====================");
            System.out.println("커뮤니티 사이트");
            System.out.println("=====================");
            System.out.println("[로그인 : 1][회원가입 : 2][아이디 찾기 : 3][비밀번호 찾기 : 4][종료 : 5][사용자 조회(임시) : 6]");
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    communityService.login();
                    break;
                case 2:
                    communityService.register();
                    break;
                case 3:
                    communityService.findId();
                    break;
                case 4:
                    communityService.findpass();
                    break;
                case 5:
                    System.out.println("이용해주셔서 감사합니다. 안녕히 가십시오");
                    System.exit(0);
                    break;
                case 6:
                    communityService.getALL();
                    break;
                default:
                    break;
            }
        }
    }

}
