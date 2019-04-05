package patterns.adapter.birds;

import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird toyDuck = new ToyDuckAdapter(new ToyDuck());

        List<Bird> birds = new LinkedList<>();
        birds.add(sparrow);
        birds.add(toyDuck);

        birds.forEach(bird -> System.out.println(bird.toString()));

    }
}
