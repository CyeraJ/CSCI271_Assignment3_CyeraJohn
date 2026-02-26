/*************************************************************************
* Assignment 3 for CSCI 271-001 Spring 2026
*
* Author: Cyera John
* OS: Ubuntu Debian 24.04.3
* Compiler: javac 21.0.9
* Date: February 22, 2026
*
* Purpose
* Reads a string S and a single character C from the user and displays
the number of times C occurs in S. This program will use a function that takes S and C as
arguments and returns the number of times C appears in S recursively! 
*
*************************************************************************/
/*******************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* Cyera John
* 
********************************************************************/
import java.util.Scanner;

public class SingleCharacter {

    // Recursive function to count how many times c appears in s
    public static int countChar(String s, char c) {

        // Base Case:
        // If the string is empty, return 0
        if (s.length() == 0) {
            return 0;
        }

        // Check the first character
        char firstChar = s.charAt(0);

      //Ensure first character matches C
        if (firstChar == c) {
            // check the rest of the string and add this one
            return 1 + countChar(s.substring(1), c);
        } else {
            // Just check the rest of the string
            return countChar(s.substring(1), c);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string S: ");
        String S = input.nextLine();

        System.out.print("Enter a single character: ");
        char C = input.nextLine().charAt(0);

        int result = countChar(S, C);
        System.out.println("The character '" + C + "'happens " 
                           + result + " time(s) in \"" + C + "\".");

        input.close();
    }


}