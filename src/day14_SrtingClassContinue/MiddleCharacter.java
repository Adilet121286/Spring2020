package day14_SrtingClassContinue;
/*
    3. Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph
 */

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = input.next();     // bananas (7 numbers) odd

        String middleCharacter = "";    // to store the middle character at the end

            int totalChars = word.length(); // 5
            int middleNumber = totalChars/2;

            if (totalChars % 2 != 0){       // odd number condition
                middleCharacter += word.charAt(middleNumber );
            }else {
                middleCharacter = middleCharacter+word.charAt(middleNumber-1)+word.charAt(middleNumber);

            }

        System.out.println(middleCharacter);



    }
}
