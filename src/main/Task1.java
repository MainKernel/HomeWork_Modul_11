import java.util.List;

public class Task1 {

    public String method1(List list){
        StringBuilder sb = new StringBuilder();
        for(Object o:list){
            if(list.indexOf(o)%2 != 0){
                sb.append(list.indexOf(o));
                sb.append(". ");
                sb.append(o);
                if(list.size()-1 > list.indexOf(o) && list.size()-2 > list.indexOf(o)){
                    sb.append(", ");
                }
            }
        }
        return sb.toString().trim();
    }
}
