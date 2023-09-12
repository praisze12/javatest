package OOP;


public class Animal {


    // attributes -> instance variables
    // don't need values
    // will default to either false/ /0/null
    private String breed;

    private int age;

    private String coatColour;

    private static String breathing = "Air";

    public String toString() {
        return "Hello, my animal breed is " + breed + " and I am " + age + " years old with coat color " + coatColour;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        // this -> current object
        // distinguishes instance variables from local variables
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 26) {
            System.out.println("Invalid age: " + age);
        } else {
            this.age = age;
        }
    }

    public String getCoatColour() {
        return coatColour;
    }

    public void setCoatColour(String coatColour) {
        this.coatColour = coatColour;


    }


    public Animal() {
    }

    public Animal(String breed, int age, String coatColour) {
        this.breed = breed;
        this.age = age;
        this.coatColour = coatColour;
    }
    public static void setBreathing(String Breathing) {
        Animal.breathing = breathing;
    }
    public static String getBreathing() {
        return breathing;
    }
}

