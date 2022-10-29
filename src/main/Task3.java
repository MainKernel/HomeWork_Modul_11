import java.util.ArrayList;
import java.util.Collections;

public class Task3 {
    public String method3(String[] array){
        ArrayList<Integer> temp = new ArrayList<>();
        String[] splited;
        for (int i = 0; i < array.length; i++) {
            splited = array[i].split(", ",0);
            for (int j = 0; j < splited.length; j++) {
                temp.add(Integer.parseInt(splited[j]));
            }
        }
        StringBuilder sb = new StringBuilder("\"");
        Collections.sort(temp);
        for(Object o:temp){
            sb.append(o);
            if(temp.indexOf(o) != temp.size()-1)
            {
                sb.append(", ");
            }
        }
        sb.append("\"");
        return sb.toString();
    }
}
