/**
 *
 * @author Terrance Warner
 * @version 1.0
 * @since -DATE FINISHED-
 * Hangman.java
 *
 * This program allows a user to play Hangman with the computer.
 * One of Fifteen Random Movie titles will be selected, and all letters and numbers in
 * the titles will be displayed as *** any non alpha-numeric characters will be displayed
 * example The movie title "Solo: A Star Wars Story" will be displayed 
 *							****: * **** **** *****
 * use only lower
 * letter a in the title
 *
 * If you guess wrong 7 times the game will terminate and display the movie title
 *
 *
 */
import java.util.*;
import java.lang.*;
import java.util.Random;
import java.util.Scanner;

public class Hangman 
{

	//This is an array of Strings
	static String movieList[] = {"Star Wars: The Last Jedi","The Matrix","Avatar",
	"Friday", "The Matrix", "Eternal Sunshine of the spotless mind", 
	"Entourage", "Paid in Full", "Belly", 
	"Any Given Sunday", "Fight Club", "Scarface", 
	"Friday Night Lights", "Remember The Titans", "Man on Fire"}; 
	// add more to this list by adding more String Literals separated by commas
	
	/**
	 * Entry point of the program
	 * 
	 * @param args input arguments
 	 * 
  	 */
	public static void main(String[] args)
	{
			// alg to select random movie title from array & turn strings to "*"// 
			System.out.println();
			System.out.println("Welcome to Hangman by Terrance:");
			System.out.println();
			System.out.println("I've randomly selected a movie title for you to guess");
			System.out.println("Use both uppercase and lowercase letters for your guesses\nspecial charcters have been provided");
			System.out.println("The asterisks below represent the length of the movie title");
			System.out.println();
			Random generator = new Random(); //random number generator for movie selection
			int movieSelection = generator.nextInt(movieList.length); // selects random movie from 0 - 14 for movies in array
			StringBuilder currentGuess = new StringBuilder(movieList[movieSelection].length()); // length of movie title
			String movie = movieList[movieSelection]; //selected movie title string
			String movieSameCase = movie.toLowerCase();
			//System.out.println(movieList[movieSelection]); //prints movie title as string for verification 
			String movieStar = movieSameCase.replaceAll("[AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789]", "*"); //Turn letters and numbers into **
			char replace = '*';
			System.out.println(movieStar); // prints all asterisks
			// -------------------------------------------//

			// turn movie string into array eaiser to perform verification//
			char[] selectedMovieArray = movieSameCase.toCharArray();
			char[] movieArray = movie.toCharArray();
			char[] mStar = movieStar.toCharArray();
			//System.out.println(chars);

			// ----------------------------------------------------- //


			// ------ User Input & Verification ------- // 
			// Prompt / Scanner / check if letter in array
			int guessCtr = 0; // initialize guess ctr
		
			while (guessCtr != 7)
			{
			System.out.println("Insert A Letter To Guess: "); // input prompt
			Scanner letterInput = new Scanner(System.in); // New Scanner Instance
			char letterChoice = letterInput.next(".").charAt(0); // Should user enter more than 1 letter it will only select 1st letter
			for (int i = 0; i <movieArray.length; i++)
			{
			if (movieArray[i] == letterChoice)
				{
				mStar[i] = letterChoice;
				}
			System.out.print(mStar[i]);
			}
			System.out.println();
			}
			// ------------------------------------------//
		
		
	}
}
