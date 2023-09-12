package OOP;

import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        Animal giraffe = new Animal(); // creates an object of type Giraffe
        // dot syntax -> access the members of an object

        giraffe.setBreed("giraffe");
        giraffe.setAge(4);
        giraffe.setCoatColour("Stripe");
        System.out.println(giraffe);


        Animal giraffe2 =  new Animal("Giraffe", 4 , "stripe");
        Animal.setBreathing("Air");
        System.out.println(Animal.getBreathing());





    }
}
