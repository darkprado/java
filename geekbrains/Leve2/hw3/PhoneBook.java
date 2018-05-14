import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook implements Skills {

    HashMap<String, HashSet<Integer>> book = new HashMap<String, HashSet<Integer>>();;

    @Override
    public void add(String name, int ... number) {
        HashSet<Integer> num = new HashSet<Integer>();
        for (int n : number) {
            num.add(n);
        }
        book.put(name, num);
    }

    @Override
    public String get(String name) {
        Set<Map.Entry<String, HashSet<Integer>>> set = book.entrySet();
        for (Map.Entry<String, HashSet<Integer>> o : set) {
            if (o.getKey().equalsIgnoreCase(name)) {
                return o.getKey() + " has number's " + o.getValue();
            }
        }
        return "no abonent";
    }

}
