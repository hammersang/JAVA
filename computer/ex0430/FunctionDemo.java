package kr.ac.ync.computer.ex0430;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleBiFunction;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> add2 = x -> x + 2;
        Function<Integer, Integer> mul2 = x -> x * 2;
        System.out.println(add2.apply(3));
        System.out.println(mul2.apply(3));
        System.out.println(add2.andThen(mul2).apply(3));
        //compose는 뒤에꺼 먼저 하고 그다음 앞에꺼 계산
        System.out.println(add2.compose(mul2).apply(3));

        IntToDoubleFunction half = x -> x /2.0;
        System.out.println(half.applyAsDouble(5));

        ToDoubleBiFunction<String, Integer> circleArea = (s,i) -> Double.parseDouble(s) * i * i;
        double area = circleArea.applyAsDouble("3.14", 5);
        System.out.println(area);
    }
}
