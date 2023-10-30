import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        //nums.addAll(Arrays.asList(1,2,3,4,5));
        Optional<Integer> min = nums.stream().min(Integer::compare);
        if (min.isPresent()){
            System.out.println(min.get());
        }
        System.out.println(min.orElse(-1));
        System.out.println(min.orElseGet(()->(int)(Math.random()*100)));
        //System.out.println(min.orElseThrow(IllegalStateException::new));
        System.out.println("------------");
        min.ifPresent(System.out::println);
        min.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("No data")
        );

    }
}