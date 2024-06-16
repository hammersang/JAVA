package kr.ac.ync.computer.ex240305;


import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        System.out.println("test");
        A a = new A();
        a.print();
        a.i = 20;
        a.j= 20;
        a.print();
        Scanner sc = new Scanner(System.in);
        //초기화를 목적으로 하는게 생성자
        String str = sc.nextLine();
        //클래스 멤버 : 변수(속성), 메서드(기능)
        //get..., set... , boolean <- is
        if(str.equals("ync")){
            System.out.println("ync!");
        }
        //Integer i = Integer.valueOf(sc.nextLine());
     //   int i = sc.nextInt();
        //System.out.println(str);
        sc.close();
    }

    //반환타입 methodName(매개변수1, 매개변수2)
    public static int sum(int num1, int num2){
        return num1 + num2;
    }
}

class A{
    int i = 10;
    int j = 10;

    public void print() {
        System.out.println(i+j);
    }
}
