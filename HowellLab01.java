/*
 */
package lab.pkg01;

import java.util.*; //Needed to get input

public class HowellLab01 {

    static Scanner console = new Scanner(System.in); //Reads in input

    public static void main(String[] args) {

        int guessNum = 0; //Initial # of guesses
        int ranNum = (int)(100 * Math.random() + 1); //Declare random goal number
        int inNum = -1; //Declare the input var with a dummy value
        
        while (ranNum != inNum){
            System.out.print("Please guess a number: ");
            inNum = console.nextInt(); //Takes in an integer input
            
            //Adding a guess
            guessNum++;
            
            //Comparing the input number to the goal number
            if (inNum > ranNum){
                System.out.println(inNum + " is too high.");
            }
            if (inNum < ranNum){
                System.out.println(inNum + " is too low.");
            }
            //Correct guess
            if (inNum == ranNum){
                System.out.println("Congratulations! You guessed the number in " + guessNum + " guess(es)!");
            }

        }

    }
    
}
