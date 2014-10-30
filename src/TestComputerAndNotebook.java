/**
 * TestComputerAndNotebook.java
 *
 * Calvin Wong
 *
 * A Tester for AbstractComputer and Notebook class
 */

public class TestComputerAndNotebook {

    public static void main(String[] args) {

        Computer myComputer =
                new Computer("Acer", "64", 4, 5, 30);

        Notebook yourComputer =
                new Notebook("DellGate", "AMD", 4, 240,
                1.8, 15.0, 7.5);

        System.out.println("My computer is:\n" + myComputer.toString());
        System.out.println("\nYour computer is:\n"
                + yourComputer.toString());
    }
} // end of class

