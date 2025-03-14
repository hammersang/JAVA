package kr.ac.ync.computer.ex0604;

import kr.ac.ync.computer.ex0528.Nation;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LoopAggregateDemo {
    public static void main(String[] args) {
        Stream<Nation> sn = Nation.nations.stream().peek(Util::printWithParenthesis);
        System.out.println("어디 나타날까?");
        Optional<Nation> on = sn.max(Comparator.comparing(Nation::getPopulation));
        //max min 은 옵션 타입
        System.out.println();
        System.out.println(on.get());

        System.out.println(IntStream.of(5,1,2,3).min().getAsInt());

        Stream<Nation> stream = Nation.nations.stream();
        System.out.println(stream.count());
    }
}
