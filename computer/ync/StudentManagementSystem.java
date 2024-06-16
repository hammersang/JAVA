package kr.ac.ync.computer.ync;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    //필드
    private StudentService studentService;
    private Scanner scanner;

    public StudentManagementSystem(){
        //초기화
        System.out.println("[StudentMangementSystem 준비]");
        scanner = new Scanner(System.in);
        studentService = new StudentService();
    }

    public void execute(){
        //무한반복
        //while(true)
        System.out.println("[StudentMangementSystem 실행]");
        while(true){
            System.out.println("====================================");
            System.out.println("1.학생등록");
            System.out.println("2.학생조회");
            System.out.println("3.학생수정");
            System.out.println("4.학생삭제");
            System.out.println("5.시스템 종료");
            System.out.println("====================================");
            System.out.println("메뉴를 선택 하세요.");
            System.out.println("====================================");
            int user = scanner.nextInt();
            double scoreuser;
            String user2;
            int user3;
            String user4;
            Student student;
            ArrayList<Grade> grades = new ArrayList<>();
            if(user == 1){
                System.out.println("학생 등록을 선택하셨습니다...");
                System.out.print("이름 : ");
                user2 = scanner.next();
                //student.setName(user2);
                System.out.print("학번 : ");
                user4 = scanner.next();
                //student.setId(user2);
                student = new Student(user4,user2);
                while(true) {
                    System.out.print("과목 : ");
                    user2 = scanner.next();
                    System.out.print("점수 : ");
                    scoreuser = scanner.nextDouble();
                    grades.add(new Grade(user2,scoreuser));
                    System.out.print("영남이공대학교학생의 성적 등록 [추가:1], [종료:0] : ");
                    user3 = scanner.nextInt();
                    if (user3 == 0) {
                        student.setGrades(grades);
                        break;
                    }
                }
                studentService.register(student);
            } else if (user == 2) {
                System.out.println("학생 조회를 선택하셨습니다...");
                System.out.println("====================================");
                studentService.getAll();
                System.out.println("====================================");
            } else if (user == 3) {
                System.out.println("학생 수정을 선택하셨습니다...");
                System.out.print("학번 : ");
                user2 = scanner.next();
                student = new Student(user2);
                System.out.print("[이름 수정:1] [건너뛰기:0] : ");
                user = scanner.nextInt();
                if(user == 1){
                    System.out.print("이름 : ");
                    user2 = scanner.next();
                    student.setName(user2);
                }
                while(true) {
                    System.out.print("[성적 재등록:1] [건너뛰기:0] : ");

                    user = scanner.nextInt();
                    if (user == 1) {
                        System.out.println("과목 : ");
                        user2 = scanner.next();
                        System.out.println("점수 : ");
                        scoreuser = scanner.nextDouble();
                        grades.add(new Grade(user2, scoreuser));

                    } else {
                        student.setGrades(grades);
                        break;
                    }
                }
                System.out.println("성공적으로 학생 수정이 완료되었습니다...");
                studentService.modify(student);
            } else if (user ==4) {
                System.out.println("학생 삭제를 선택하셨습니다...");
                System.out.print("학번 : ");
                user2 = scanner.next();
                studentService.remove(user2);
                System.out.println("성공적으로 학생 정보 삭제가 완료되었습니다.");
            }else{
                System.out.println("시스템을 종료합니다...");
                scanner.close();
                System.exit(0);
                break;
            }

        }
    }
}
