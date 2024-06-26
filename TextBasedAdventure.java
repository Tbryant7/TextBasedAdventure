import java.util.Scanner;

public class TextBasedAdventure {
    boolean hasSword = false;
    boolean hasShovel = false;
    boolean hasPotion = false;
    Scanner keyboardInput = new Scanner(System.in);

    public void execute() {
        System.out.println("Welcome to Escape from the Cave! Press enter when you are ready to start...");
        keyboardInput.nextLine();
        System.out.println("You are trapped in a cave!");
        start();
    }

    public void start() {
        System.out.println("You find yourself in a large room. What would you like to do?\n1. Go left \n2. Go right\n3. Go down\n4. Go up");
        int input = keyboardInput.nextInt();
        if (input == 1) {
            goLeft();
        }
        else if (input == 2) {
            goRight();
        }
        else if (input == 3) {
            goDown();
        }
        else if (input == 4) {
            goUp();
        }
    }

    public void goLeft() {

        System.out.println("Oh no! You run into a giant! Fight or flight?\n(This giant holds the key to escaping the cave!)\n1. Fight \n2. Flight \n3. Dig Out \n4. Throw potion");
        int input = keyboardInput.nextInt();
        if (input == 1) {
            fight();
        }
        else if (input == 2) {
            start();
        }  

        else if(input == 3) {
            dig();
        }
        else if (input == 4) {
            throwPotion();
        }
    }

    public void goRight() {
        if (!hasSword) {
            System.out.println("You find a sword on the ground!");
            hasSword = true;
        }
        else if (!hasPotion) {
            System.out.println("You have found a wizard, he has given you a magic potion!");
            hasPotion = true;
        }
        else {
            System.out.println("There's nothing here...");
        }
        start();
    }

    public void goDown() {
        if (hasSword) {
            System.out.println("The door is locked, you can cut the lock with the sword!");
        }
        else {
            System.out.println("The door is locked, find a sword to cut the lock...");
        }
        start();
    }

    public void goUp() {
        System.out.println("You see some light coming from a crack in the ceiling, if you have a shovel you can escape!");
        dig();
        }

    public void fight() {
        if (hasSword) {
            System.out.println("You defeat the giant with your sword and run out of the cave!\nYou also collect a shovel as a spoil of battle!");
            hasShovel = true;
            start();
        } else {
            System.out.println("You get stomped by the giant and red stuff goes everywhere.");
        }
    }

    public void throwPotion() {
        if(!hasPotion) {
            System.out.println("you get crushed by the giant you did not have the potion.");
        }
        else if(hasPotion) {
            System.out.println("you throw the potion at the giant and it turns into a mouse. you escape \nYou also collect a shovel as a spoil of battle!");
            hasShovel = true;
            start();
        }
    }
    public void dig() {
        if (!hasShovel) {
            System.out.println("You need a shovel to dig! DUH!");
            start();
        } else {
            System.out.println("You manage to escape from the cave!");
        }
    }

    public static void main(String[] args) {
        new TextBasedAdventure().execute();
    }
}