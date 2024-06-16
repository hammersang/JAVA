package kr.ac.ync.computer.ex0604;

import kr.ac.ync.computer.ex0528.Nation;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Map2Demo {
    public static void main(String[] args) {
        Nation.nations.stream()
                .map(Nation::getName)
                .limit(4)
                .forEach(Util::printWithParenthesis);
        System.out.println();

        Stream<Nation> n2 = Nation.nations.stream();
        IntStream is = n2.mapToInt(Nation::getGdpRank);
        is.forEach(Util::print);
        System.out.println();
        Nation.nations.stream()
                .mapToInt(Nation::getGdpRank)
                .average();
    }
}
