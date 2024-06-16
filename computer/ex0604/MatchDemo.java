package kr.ac.ync.computer.ex0604;

import kr.ac.ync.computer.ex0528.Nation;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatchDemo {
    public static void main(String[] args) {
        boolean b1 = Stream.of("a1","b2","c3")
                .anyMatch( s -> s.startsWith("c"));
        System.out.println(b1);

        boolean b2 = IntStream.of(10,20,30)
                .allMatch(p -> p % 3 == 0);
        System.out.println(b2);

        Optional<Nation> nation = Nation.nations.stream().findFirst();
        nation.ifPresentOrElse(Util::print, ()-> System.out.println("없음."));
        System.out.println();

        Nation.nations.stream()
                .filter(Nation::isIsland)
                .findAny()
                .ifPresent(Util::print);
    }



}
