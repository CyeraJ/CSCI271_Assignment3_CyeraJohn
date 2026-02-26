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
// Method takes S and C, returns count recursively
    public static int countSC(String s, char c) {
        return countChar(s, c, 0);
    }
    public static int countChar(String s, char c, int index) {
        // Base case: processed all characters
        if (index >= s.length()) {
            return 0;
        }

        // Count 1 if current char matches, otherwise 0
        int match = (s.charAt(index) == c) ? 1 : 0;

        // Recurse to the next character
        return match + countChar(s, c, index + 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string S: ");
        String s = in.nextLine();

        System.out.print("Enter a single character: ");
        String cLine = in.nextLine();

        // makes sure we get one
        while (cLine.length() != 1) {
            System.out.print("Please enter exactly ONE character: ");
            cLine = in.nextLine();
        }

        char c = cLine.charAt(0);

        int result = countSC(s, c);

        System.out.println("The character '" + c + "' happens " + result + " time(s) in \"" + s + "\".");

        in.close();
    }


}