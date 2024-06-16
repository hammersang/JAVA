package kr.ac.ync.computer.ex0528;

import java.util.stream.IntStream;

public class LazinessDemo {
    public static void main(String[] args) {
        IntStream is = IntStream.rangeClosed(1,5); //1~5
        IntStream.range(1,5); // 1~4
        is.filter(x -> {
                    System.out.println("filter : " +  x);
                    return x % 2 ==0;
        }).map(x -> {
                    System.out.println("map : "+ x);
                    return x * x;
        }).forEach(x ->
                System.out.println("forEach : " + x));
    }
}
