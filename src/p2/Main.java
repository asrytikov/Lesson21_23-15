package p2;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<People> peopleStream = Stream.of(new People("Masha", 30, 50000),
                new People("Alex", 22, 45000), new People("Vasiliy", 35, 100_000));

        /*List<People> peopleList = peopleStream.collect(Collectors.toList());
        System.out.println(peopleList);*/

        /*Set<People> peopleSet = peopleStream.collect(Collectors.toSet());
        System.out.println(peopleSet);*/

        /*Map<String, Integer> stringIntegerMap = peopleStream.collect(Collectors.toMap(
                people -> people.getName(), people -> people.getSalary()));
        stringIntegerMap.forEach((k,v)-> System.out.println(k + " " +v));*/

        HashSet<People> peopleHashSet = peopleStream.collect(Collectors.toCollection(HashSet::new));
        System.out.println(peopleHashSet);




    }
}
