package challenges.utilities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalShelterTest {
    @Test
    public void testAnimalShelterEnqueue() {
        AnimalShelter furry = new AnimalShelter();
        furry.enqueue(new Cat("Tofu", "cat"));
        furry.enqueue(new Dog("Oro", "dog"));
        furry.enqueue(new Cat("Theo", "cat"));
        assertEquals("Molly", furry.enqueue(new Animal("Molly", "dog")));
        assertEquals("Ted", furry.enqueue(new Animal("Ted", "cat")));
    }

    @Test
    public void testAnimalShelterDequeue() {
        AnimalShelter furry = new AnimalShelter();
        furry.enqueue(new Cat("Tofu", "cat"));
        furry.enqueue(new Dog("Oro", "dog"));
        furry.enqueue(new Cat("Theo", "cat"));
        assertEquals("Oro", furry.dequeue("dog").name);
        assertEquals("Tofu", furry.dequeue("cat").name);
        assertEquals("Theo", furry.dequeue("lizard").name);
    }
}
