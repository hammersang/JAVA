package kr.ac.ync.computer.ex240305;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        for(int i = 0; ; i++){
            if(i > 10){
                break;
            }
            if(i%2 != 0){
                continue;
            }
            System.out.print(i + " ");

        }
    }
}
