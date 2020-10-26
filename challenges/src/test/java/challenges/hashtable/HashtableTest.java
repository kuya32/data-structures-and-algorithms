package challenges.hashtable;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;

public class HashtableTest {

    @Test
    public void hashtableTests() throws Exception {
        ArrayList[] list = new ArrayList[15];
        Hashtable hashtable = new Hashtable(list);

        hashtable.add("Tommy", "Pickles");
        hashtable.add("Chuckie", "Finster");
        hashtable.add("Lillian", "DeVille");
        hashtable.add("Phillip", "DeVille");
        hashtable.add("Dinosaur", "Reptar");
        hashtable.add("Taffy", "Rando");
        hashtable.add("Kimi", "Finster");
        hashtable.add("Susie", "Carmichael");
        hashtable.add("Timmy", "McNulty");
        hashtable.add("Boris", "Kropotkin");

        assertEquals("Reptar", hashtable.get("Dinosaur"));
        assertNull(hashtable.get("Dil"));

        assertFalse(hashtable.contains("Angelica"));
        hashtable.add("Angelica", "Pickles");
        assertTrue(hashtable.contains("Angelica"));
    }
}
