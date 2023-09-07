package lab3;

import java.util.Random;

class Die {
    private int sideUp;

    public Die() {
        sideUp = -1;
    }

    void roll() {
        Random random = new Random();
        sideUp = random.nextInt(0, 7);
    }

    public int sideUp() {
        if (sideUp == -1) { throw new IllegalStateException("Cannot get the side of a yet unrolled die."); }
        return sideUp;
    }
}

class DieDemo {
    public DieDemo() {
        Die die1 = new Die();
        Die die2 = new Die();

        die1.roll();
        die2.roll();

        System.out.println("The sum of the dice rolls is: " + die1.sideUp() + die2.sideUp() + ".");
    }
}

/**
 * Create  Die class with one integer instance variable called sideUp. Give it a getSideUp() method that returns the
 * values of sideUp and a void roll() method that changes sideUpto a random value for 1 to 6. Then create a DieDemo
 * class with a method that creates two Die objects, rolls them, and prints the sum of the two dies up.
 */
public class Q6 {
    public static void main(String[] args) {
        new DieDemo();
    }
}
