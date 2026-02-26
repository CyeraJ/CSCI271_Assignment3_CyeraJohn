/*************************************************************************
* Assignment 3 for CSCI 271-001 Spring 2026
*
* Author: Cyera John
* OS: Ubuntu Debian 24.04.3
* Compiler: javac 21.0.9
* Date: February 22, 2026
*
* Purpose
* Reads in a string S from the user and displays the length of S. In doing
so, the program will use a recursive function that takes S as an argument and returns the number
of characters in S recursively! 
*
*************************************************************************/
/*******************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* Cyera John
* 
********************************************************************/

/* Final Time Complexity:
 *   O(n^2)
 *
 * Space Complexity:
 *   O(n) due to recursive call stack. */
import java.util.Scanner;

public class RecursionNoloop {

    // Recursive function to calculate length of string
    public static int length(String s) {
        // Base case: will be an empty string
        if (s.equals("")) { //empty string if there was a number here it wouldn't be a base case
            return 0;
        }
        // Recursive case
        return 1 + length(s.substring(1)); //returns the number of characters in S recursively.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String S = scanner.nextLine(); //reads the full line including any spaces

        int recursivelength = length(S); //calls the function

        System.out.println("Length of the string: " + recursivelength); //prints functions

        scanner.close();
    }
}