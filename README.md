# Number Guessing Game

## Description

This is a lightweight game in which the user will attempt to guess a randomly-chosen integer between 1 and 100. Incorrect guesses will cause the program to print out a hint to the user to help him or her guess the number.

This project was originally created for an assignment in my CS232 class, focusing on getting user input via a Scanner object, and on the use of the Math.random() function.

Note: The program currently does not support any non-integer input, and will throw an error if a float or string is inputed by the user.

## Installation

Please download the Numbergame.jar file and run it using an appropriate Java Runtime Environment. Source code for the program can be viewed via the Numbergame.java file. 

## How to Use

1. Open executing, the user will be prompted to input an integer number between 1 and 100.
```
Please guess a number between 1 and 100: 
```
2. Once an integer value is entered, the user will be told if the number was less than, higher than, or equal to the goal number.
```
Please guess a number between 1 and 100: 50
50 is too high.
```
3. If the entered value is not equal to the goal number, then the user will be prompted to enter another integer number.
```
Please guess a number between 1 and 100: 50
50 is too high.

Please guess a number:
```
4. This process will repeat until the correct number is entered, after which the user will be congratulated and shown the number of guesses used to reach the goal number.
```
Please guess a number: 28
Congratulations! You guessed the number in 2 guess(es)!
```
