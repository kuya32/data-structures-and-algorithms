package challenges.utilities;

public class AnimalShelter {
    public Stack stack1;
    public Stack stack2;

    public AnimalShelter() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public static void main (String[] args) {
        AnimalShelter furry = new AnimalShelter();
        furry.enqueue(new Cat("Tofu", "cat"));
        furry.enqueue(new Dog("Oro","dog"));
        furry.enqueue(new Animal("Theo", "cat"));
        furry.enqueue(new Animal("Molly","dog"));
        System.out.println(furry);
        System.out.println(furry.dequeue("dog"));
        System.out.println(furry);
        System.out.println(furry.dequeue("cat"));
        System.out.println(furry);
    }

    public String enqueue(Animal animal) {
        System.out.println(animal.type + " was sent to the animal shelter!");
        return stack1.push(animal).chicken.getName();
    }

    public Animal dequeue(String type) {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        Animal temp2 = null;
        if(type.equals("cat")) {
            while(!stack2.isEmpty()) {
                if(stack2.top.chicken.type.equals("cat")) {
                    temp2 = stack2.pop();
                    while(!stack2.isEmpty()) {
                        stack1.push(stack2.pop());
                    }
                } else {
                    stack1.push(stack2.pop());
                }
            }
        } else if(type.equals("dog")) {
            while(!stack2.isEmpty()) {
                if(stack2.top.chicken.type.equals("dog")) {
                    temp2 = stack2.pop();
                    while(!stack2.isEmpty()) {
                        stack1.push(stack2.pop());
                    }
                } else {
                    stack1.push(stack2.pop());
                }
            }
        } else {
            temp2 = stack2.pop();
        }
        return temp2;
    }

    public String toString() {
        String combo = toString(stack1.top) + " | " + toString(stack2.top);
        return combo;
    }

    public String toString(Node current) {
        if(current == null) {
            return "null";
        }
        return String.format("{%s} -> %s", current.chicken.name, toString(current.next));
    }
}
