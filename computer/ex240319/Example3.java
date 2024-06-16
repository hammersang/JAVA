package kr.ac.ync.computer.ex240319;

import java.util.Random;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int win = 0;
        int draw = 0;
        int lose = 0;
        for(int i =1; i < 6; i++){
            System.out.println("Round "+i+": 가위(1),바위(2), 보(3) 중 하나를 선택하세요");
            System.out.print("유저 : ");
            int p =sc.nextInt();
            int c = random.nextInt(3)+1;
            if(p - c == 1 || p - c == -2){
                win++;
            }
            else if(p == c){
                draw++;
            }
            else{
                lose++;
            }
            System.out.println("컴퓨터 : "+c);
            System.out.println();
            System.out.println();
        }
        System.out.println("승 : "+win+", 무 : "+draw+", 패 : "+lose);
    }
}
