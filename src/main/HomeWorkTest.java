import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeWorkTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Steve");
        names.add("Igor");
        names.add("Alex");
        names.add("Gorge");
        names.add("Chuck");
        names.add("Norris");
        names.add("Nikolay");
        names.add("Roman");
        names.add("Jacob");
        names.add("Sam");
        names.add("Dean");

        //Should be 1. Steve, 3. Alex, 5. Chuck, 7. Nikolay, 9. Jacob, 11. Dean
        System.out.println(new Task1().method1(names));
        //Should be ALEX, CHUCK, DEAN, GORGE, IGOR, IVAN, JACOB, NIKOLAY, NORRIS, ROMAN, SAM, STEVE
        System.out.println(Arrays.toString(new List[]{new Task2().method2(names)}));

        String[] array = new String[]{"1, 2, 0", "4, 5"};

        //Should be "0, 1, 2, 4, 5"
        System.out.println("new Task3().method3(array) = " + new Task3().method3(array));

        Stream<Integer> stream1 =  Stream.of(1,2,3,4,5,6,7,8);
        Stream<Integer> stream2 =  Stream.of(9,10,11,12,13);

        //Result 1, 9, 2, 10, 3, 11, 4, 12, 5, 13
        System.out.println(new Task5().zip(stream1,stream2).collect(Collectors.toList()));
    }
}
