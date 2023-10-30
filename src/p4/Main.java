package p4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5));
        Optional<Integer> res = nums.stream().parallel().reduce((x,y)->x+y);
        System.out.println(res.get());
        Optional<Integer> res2 = nums.parallelStream().unordered().reduce((x,y)->x+y);
        System.out.println(res2.get());

    }

}
