package kr.ac.ync.computer.ex0430;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class OperatorDemo {
    public static void main(String[] args) {
        IntUnaryOperator add2 = x -> x+2;
        System.out.println(add2.applyAsInt(3));
        UnaryOperator<Integer> add2again = x -> x +2;
        System.out.println(add2again.apply(3));

        IntUnaryOperator mul2 = x -> x *2 ;
        IntUnaryOperator add2mul2 = add2.andThen(mul2);
//        System.out.printf();
    }
}
