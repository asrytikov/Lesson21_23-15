package p3;

import p2.People;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<People> peopleStream = Stream.of(
                new People("Masha", 30, 50000),
                new People("Alex", 22, 45000),
                new People("Vasiliy", 35, 100_000),
                new People("Ivan", 35, 500000),
                new People("Alex", 30, 165000)
        );

       /* Map<Integer, List<People>> peopleAge = peopleStream.collect(Collectors.groupingBy(People::getAge));

        for(Map.Entry<Integer, List<People>> p : peopleAge.entrySet()){
            System.out.println(p.getKey());
            for(People people : p.getValue()){
                System.out.println(people.getName());
            }
            System.out.println("-------------");
        }
        Map<Boolean, List<People>> peopleAge = peopleStream.collect(Collectors.partitioningBy(
                people -> people.getSalary()>=100_000));
        for(Map.Entry<Boolean, List<People>> p : peopleAge.entrySet()){
            System.out.println(p.getKey());
            for(People people : p.getValue()){
                System.out.println(people.getName());
            }
            System.out.println("-------------");
        }
        Map<Integer, Long> peopleAge = peopleStream.collect(Collectors.groupingBy(People::getAge,
                Collectors.counting()));

        for(Map.Entry<Integer, Long> p : peopleAge.entrySet()){
            System.out.println(p.getKey() + " - " + p.getValue());
            System.out.println("-------------");
        }
        Map<Integer, Integer> peopleAge = peopleStream.collect(Collectors.groupingBy(People::getAge,
                Collectors.summingInt(People::getSalary)));

        for(Map.Entry<Integer, Integer> p : peopleAge.entrySet()){
            System.out.println(p.getKey() + " - " + p.getValue());
            System.out.println("-------------");
        }

        Map<Integer, Optional<People>> peopleAge = peopleStream.collect(Collectors.groupingBy(People::getAge,
                Collectors.maxBy(Comparator.comparing(People::getSalary))));

        for(Map.Entry<Integer, Optional<People>> p : peopleAge.entrySet()) {
            System.out.println(p.getKey() + " - " + p.getValue().get().getName());
            System.out.println("-------------");
        }
        Map<String, IntSummaryStatistics> peopleSalary = peopleStream.collect(Collectors.groupingBy(People::getName,
                Collectors.summarizingInt(People::getSalary)));
        for(Map.Entry<String, IntSummaryStatistics> p : peopleSalary.entrySet()) {
            System.out.println(p.getKey() + " - " + p.getValue().getSum());
            System.out.println("-------------");
        }*/
        Map<Integer, List<String>> peopleAge = peopleStream.collect(Collectors.groupingBy(People::getAge,
                Collectors.mapping(People::getName, Collectors.toList())));
        for(Map.Entry<Integer, List<String>> p : peopleAge.entrySet()){
            System.out.println(p.getKey());
            for(String name : p.getValue()){
                System.out.println(name);
            }
            System.out.println("-------------");
        }


    }
}
