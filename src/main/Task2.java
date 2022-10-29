import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public List method2(List list){
       List list1 = (List) list.stream()
               .sorted()
               .map(object -> object.toString().toUpperCase())
               .collect(Collectors.toList());
        return list1 ;
    }
}
