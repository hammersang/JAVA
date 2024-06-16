package kr.ac.ync.computer.ex0604;

import kr.ac.ync.computer.ex0528.Nation;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedDemo {
    public static void main(String[] args) {
        Stream.of("d2","a2","b1","b4","c")
                .sorted()
                .forEach(Util::print);
        System.out.println();
        Nation.nations.stream()
                .sorted(Comparator.comparing(Nation::getName)).map(x -> x.getName())
                .forEach(Util::printWithParenthesis);
        System.out.println();
        Nation.nations.stream()
                .sorted(Comparator.comparing(Nation::getGdpRank))
                .map(Nation::getName)
                .forEach(Util::printWithParenthesis);
    }
}
