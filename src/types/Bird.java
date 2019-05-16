package types;

import animal_qualities.Flying;
import main.Animal;

public class Bird extends Animal implements Flying {
    public Bird()
    {
        super("bird", "anything with wings");
    }
    public Bird(String name, String desc)
    {
        super(name, desc);
    }
    public String makeNoise()
    {
        return "hoots";
    }

    @Override
    public String fly() {return "flies"; }
    public String eat()
    {
        return "bird seed";
    }
}
