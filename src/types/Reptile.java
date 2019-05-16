package types;

import animal_qualities.Swimming;
import main.Animal;
    public class Reptile extends Animal implements Swimming
    {
        public Reptile()
        {
            super("Reptile", "scaly, but cuddly");

        }
        public Reptile(String name, String desc)
        {
            super(name, desc);
        }
        public String makeNoise()
        {
            return "hisses";
        }
        public String eat()
        {
            return "dead chickens";
        }
        public String swim() {return "Swims";}
    }
