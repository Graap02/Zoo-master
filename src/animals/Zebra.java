package animals;


import types.Equine;

/**
 * Write a description of class Ring_Tailed_Lemurs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zebra extends Equine {
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class animals.Orangutan
     */
    public Zebra() {
        super("zebra", "stripes that run the African streets ");
        this.age = "middle aged";
    }

    /**
     * An example of a method - replace this comment with your own
     */
    @Override
    public String makeNoise() {
        // put your code here
        return "neighs and bucks up";
    }
}
