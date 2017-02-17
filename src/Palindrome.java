import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by patel on 2/16/2017.
 */
public class Palindrome {

    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        String line;

        do
        {
            System.out.print("Enter Number, Phrase or a String:");
            line = stdin.nextLine();
            if (isPalindrome(line))
                System.out.println("That is a palindrome.");
            else
                System.out.println("That is not a palindrome.");
        }
        while (line.length( ) != 0);
    }

    public static boolean isPalindrome(String input)
    {
        input = input.toLowerCase().replace(" ","");

        double stringLength = input.length() / 2;

        int length = (int) Math.ceil(stringLength);

        ArrayList<Character> unsortedArray = new ArrayList<>(input.length());
        ArrayList<Character> reverseArray = new ArrayList<>(input.length());

        for(int index = 0, reverseIndex = input.length() - 1; index < length; index++, reverseIndex--)
        {
            Character firstCharacter = input.charAt(index);
            Character secondCharacter = input.charAt(reverseIndex);

            if(!Character.isLetter(firstCharacter) && !Character.isDigit(firstCharacter))
                return false;

            if(!Character.isLetter(secondCharacter) && !Character.isDigit(secondCharacter))
                return false;

            if(firstCharacter != secondCharacter)
                return false;
        }

        return true;
    }
}
