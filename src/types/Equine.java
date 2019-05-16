package types;

import animal_qualities.Walking;
import main.Animal;

public class Equine extends Animal implements Walking {
    public Equine() {
        super("equine", "4 legged creatures of beauty");

    }

    public Equine(String name, String desc) {
        super(name, desc);
    }

    public String makeNoise() {
        return "neighs";
    }

    public String eat() {
        return "grass and veggies";
    }

    public String walk() {
        return "runs and walks";
    }
}
