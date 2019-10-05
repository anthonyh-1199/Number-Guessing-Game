/*
 */
package numbergame;

import java.util.*; //Needed to get input

public class Numbergame {

    static Scanner console = new Scanner(System.in); //Reads in input

    public static void main(String[] args) {

        int guessNum = 0; //Initial # of guesses
        int ranNum = (int)(100 * Math.random() + 1); //Declare random goal number
        int inNum = -1; //Declare the input var with a dummy value
        
        System.out.print("Please guess a number between 1 and 100: ");
        while (ranNum != inNum){
            try{ 
                inNum = console.nextInt(); //Takes in an integer input
            } catch(Exception e){ //Non-int error
                System.out.println("Error: non-integer value submitted.");
                return;
            }
                
            //Adding a guess
            guessNum++;

            //Comparing the input number to the goal number
            if (inNum > ranNum && inNum <= 100){
                System.out.println(inNum + " is too high.");
            }
            if (inNum < ranNum && inNum >= 1){
                System.out.println(inNum + " is too low.");
            }

            //Out of bounds values
            if (inNum > 100 || inNum < 1){
                System.out.println("Please choose a number between 1 and 100.");
            }

            //Correct guess
            if (inNum == ranNum){
                System.out.println("Congratulations! You guessed the number in " + guessNum + " guess(es)!");
            } else {
                System.out.print("\nPlease guess a number: ");
            }
        }

    }
    
}
