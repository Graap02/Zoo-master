package animals;
import types.Reptile;

/**
 * Write a description of class animals.Chimpanzee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Alligator extends Reptile
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class animals.Orangutan
     */
    public Alligator()
    {
        super("Alligator", "No, she is NOT a crocodile");
        this.age = "young";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     *
     */
    @Override
    public String makeNoise()
    {
        return "hisses";
    }
}
