package kr.ac.ync.computer.ex0604;

import kr.ac.ync.computer.ex0528.Nation;

public class Util {
    public static void print(String str) {
        System.out.print(str+" ");
    }
    public static void printWithParenthesis(String str) {
        System.out.print("(" + str + ")"+" ");
    }

    public static void printWithParenthesis(Nation nation) {
        System.out.print("(" + nation + ")"+" ");
    }

    public static void print(int i) {
    }

    public static void print(Nation nation) {
        System.out.println(nation+" ");
    }


}
