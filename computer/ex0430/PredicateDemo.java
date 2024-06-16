package kr.ac.ync.computer.ex0430;

import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

public class PredicateDemo {
    public static void main(String[] args) {
        IntPredicate even = x -> x% 2 == 0;
        System.out.println(even.test(3) ? "짝수" : "홀수");

        IntPredicate one = x -> x == 1;
        // one || even => oneOrEven
        IntPredicate oneOrEven = one.or(even);
        System.out.println(oneOrEven.test(1) ?
                    "1 혹은 짝수" : "1이 아닌 홀수");

        Predicate<String> p = Predicate.isEqual("Java Lambda");
        System.out.println(p.test("Java Lambda"));
        System.out.println(p.test("JavaFX"));

        BiPredicate<Integer, Integer> bp = (x, y) -> x > y;
        System.out.println(bp.test(2,3));
        //함수형 인터페이스는 추상메소드 하나만 있는것
        //람다식은 추상메소드를 위해서 만들어 낸것
        //구현이 되어 있지 않고 선언만 되어있는 메소드

        IntPredicate intPredicate;
        intPredicate = x -> x % 2 == 1;
        System.out.println(intPredicate.test(3)? "홀수" : "짝수");
    }
}
