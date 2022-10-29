import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondList = second.collect(Collectors.toList());
        List<T> result = new ArrayList<>();
        int minListLength = 0;
        int list1Index = 0;
        int list2Index = 0;
        if (firstList.size() > secondList.size()) {
            minListLength = secondList.size();
        } else {
            minListLength = firstList.size();
        }

        for (int i = 0; i < minListLength*2; i++) {
            if (i % 2 == 0) {
                result.add(firstList.get(list1Index));
                list1Index++;
            } else {
                result.add(secondList.get(list2Index));
                list2Index++;
            }
        }

        return result.stream();
    }
}
