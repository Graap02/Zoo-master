package animals;

import types.Primate;
    /**
     * Write a description of class animals.Chimpanzee here.
     *
     * @author (your name)
     * @version (a version number or a date)
     */
    public class Ring_Tailed_Lemur extends Primate {
        // instance variables - replace the example below with your own
        private String age;

        /**
         * Constructor for objects of class animals.Orangutan
         */
        public Ring_Tailed_Lemur() {
            super("Ring Tailed Lemur", "pretty ringed tails that fly through the trees");
            this.age = "very young";
        }

        /**
         * An example of a method - replace this comment with your own
         */
        @Override
        public String makeNoise() {
            // put your code here
            return "hooting and howling";
        }
    }

