package challenges.leftJoin;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeftJoin {
    public String[][] leftJoin(HashMap<String, String> map1, HashMap<String, String> map2) {
        String[][] arr = new String[map1.size()][];
        List<String> keys = new ArrayList<>(map1.keySet());
        if (!map1.isEmpty()) {
            for (int i = 0; i < map1.size(); i++) {
                arr[i] = new String[3];
                arr[i][0] = keys.get(i);
                arr[i][1] = map1.get(keys.get(i));

                if (map2.containsKey(keys.get(i))) {
                    arr[i][2] = map2.get(keys.get(i));
                }
            }
        }
        return arr;
    }
}
