package kr.ac.ync.computer.ex0528;

import java.util.Random;
import java.util.stream.IntStream;

public class test {
    public static void main(String[] args) {
        new Random().ints(1,100)
                .filter(x-> x % 2 != 0)
                .limit(300)
                .sorted()
                .forEach(x-> System.out.print(x + " "));


    }
}
