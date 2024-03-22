import java.util.Scanner;

public class TextBasedAdventure {
    boolean hasSword = false;
    boolean hasShovel = false;

    Scanner keyboardInput = new Scanner(System.in);

    public void execute() {
        System.out.println("Welcome to Escape from the Cave! Press enter when you are ready to start...");
        keyboardInput.nextLine();
        System.out.println("You are trapped in a cave!");
        start();
    }

    public void start() {
        System.out.println("You find yourself in a large room. What would you like to do?\n1. Go left \n2. Go right \n3. Go up");
        int input = keyboardInput.nextInt();
        if (input == 1) {
            goLeft();
        }
        else if (input == 2) {
            goRight();
        }
        else { 
            goUp();
        }

        }
    

    public void goLeft() {
        System.out.println("Oh no! You run into a giant! Fight or flight?\n1. Fight \n2. Flight \n3. Dig Out");
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
    }

    public void goRight() {
        if (!hasSword) {
            System.out.println("You find a sword on the ground!");
            hasSword = true;
            System.out.println("You also find a Shovel on the ground!");
            hasShovel = true;
        }
        else {
            System.out.println("There's nothing here...");
        }
        start();
    }
    public void goUp(){
        System.out.println("You have ran into a dark abyss, turn back or continue foward?\n1. Turn back \n2. Continue Foward ");
        int input = keyboardInput.nextInt();
        if (input == 1){
            start();
        }
        else if (input ==2){
            cont();
        }
    }

    public void fight() {
        if (hasSword) {
            System.out.println("You defeat the giant with your sword and run out of the cave!");
        } else {
            System.out.println("You get stomped by the giant and red stuff goes everywhere.");
        }
    }
    public void cont(){
        System.out.println("You have venutured to far and became lost, Good luck now you are dead");
    }

    public void dig() {
        if(!hasShovel) {
            System.out.println("you get crushed by the giant you did not have the shovel");
        }
        else if(hasShovel) {
            System.out.println("you dig out of the cave");
        }
    }

    public static void main(String[] args) {
        new TextBasedAdventure().execute();
    }
}
