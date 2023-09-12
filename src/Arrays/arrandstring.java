package Arrays;

public class arrandstring {
    public static void main(String[] args) {
        String[] names = {"Praise", "Tochi", "Cam", "Maddy"};
        System.out.println(names.length);
        for (int i = 0; i < names.length; i++ ) {
            System.out.println("I: "+  i + " Name is: " + names[i]);
        }
        for (String i : names) {
            System.out.println( "Name is: " + i);
        }

    }
}
