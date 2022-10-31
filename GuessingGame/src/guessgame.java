import java.util.Random;
import java.util.Scanner;

public class guessgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer, attemptsNum = 0;
		final int maxAttempts = 5;
		String str, another = "y";
		int [] guess = new int [5];
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		answer = generator.nextInt(101)+1;
		
		System.out.println("Guess a number between 1 and 100");
		System.out.println("Enter your guess (0 to quit): "); 
		
		    guess[attemptsNum]= scan.nextInt();
		    while(guess[attemptsNum]!= 0)
		    {
		    	if(guess[attemptsNum]== answer)
		    		System.out.println("That is CORRECT!");
		    	else if(guess[attemptsNum]< answer)
		    		System.out.println("That is TOO LOW!");
		    	else if(guess[attemptsNum]>answer)
		    		System.out.println("That is TOO HIGH!");
		    	break;
		    }
		    
		    System.out.println("Go ahead! Try again");
		    another= scan.next();
		    
		    while(guess[attemptsNum]!= answer && ++attemptsNum < maxAttempts) {
		    	if(attemptsNum == maxAttempts)
		    		System.out.println("The correct number was "+answer);
		    	    guess[attemptsNum]= scan.nextInt();
		    }
		    
		    System.out.println("The numbers guessed are ");
		    attemptsNum = 0;
		    while(guess[attemptsNum]!= answer && ++attemptsNum< maxAttempts) {
		    	  System.out.println(guess[attemptsNum]);
		    }
		    
		

	}

}
