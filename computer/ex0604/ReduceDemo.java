package kr.ac.ync.computer.ex0604;

import java.util.List;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3,4,5,1,2);

        int sum1 = numbers.stream().reduce(0,(a,b)-> a+ b);
        int sum2 = numbers.stream().reduce(0, Integer::sum);
        int mul1 = numbers.stream().reduce(1, (a,b)-> a *b);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(mul1);
    }
}
