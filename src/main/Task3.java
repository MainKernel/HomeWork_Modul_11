import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public String method3(String[] array){
       String result = Stream.of(array).map(s -> {
            ArrayList<Integer> tempInt = new ArrayList<>();
           String[] splited;
           for (int i = 0; i < array.length; i++) {
            splited = array[i].split(", ",0);
            for (int j = 0; j < splited.length; j++) {
                tempInt.add(Integer.parseInt(splited[j]));
            }
        }
        return tempInt;
        }).map(s -> {  StringBuilder sb = new StringBuilder("\"");
        Collections.sort(s);
        for(Integer i:s){
            sb.append(i);
            if(s.indexOf(i) != s.size()-1){
                sb.append(", ");
            }
        }
        sb.append("\"");
        return sb.toString();}).collect(Collectors.toSet()).toString();
        return result;
    }
}
