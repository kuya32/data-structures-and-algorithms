package challenges.leftJoinTest;

import challenges.leftJoin.LeftJoin;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

public class LeftJoinTest {

    @Test
    public void testLeftJoinMethodOnExample() {
        LeftJoin left = new LeftJoin();
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();
        map1.put("fond", "enamored");
        map1.put("wrath", "anger");
        map1.put("diligent", "employed");
        map1.put("outfit", "garb");
        map1.put("guide", "usher");
        map2.put("fond", "averse");
        map2.put("wrath", "delight");
        map2.put("diligent", "idle");
        map2.put("guide", "follow");
        map2.put("flow", "jam");

        System.out.println(Arrays.deepToString(left.leftJoin(map1, map2)));
        String output = "[[diligent, employed, idle], [outfit, garb, null], [wrath, anger, delight], [guide, usher, follow], [fond, enamored, averse]]";
        assertEquals(output, Arrays.deepToString(left.leftJoin(map1, map2)));
    }

    @Test
    public void testLeftJoinMethodFirstHashMapEmpty() {
        LeftJoin left = new LeftJoin();
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();

        map2.put("fond", "averse");
        map2.put("wrath", "delight");
        map2.put("diligent", "idle");
        map2.put("guide", "follow");
        map2.put("flow", "jam");

        System.out.println(Arrays.deepToString(left.leftJoin(map1, map2)));
        String output = "[]";
        assertEquals(output, Arrays.deepToString(left.leftJoin(map1, map2)));
    }
}
