package kr.ac.ync.computer.ex0604;

import kr.ac.ync.computer.ex0528.Nation;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect2Demo {
    public static void main(String[] args) {
        Stream<Nation> sn = Nation.nations.stream();
        Stream<String> ss = sn.map(Nation::getName).limit(3);



//        Map<String, Double> map= Nation.nations.stream().filter(Nation::isIsland).collect(Collectors.toMap(Nation::getName, Nation::getPopulation)).forEach(Util::printWithParenthesis);

    }
}
