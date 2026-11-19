/**
 * PalindromeDemo.java
 *
 * Your Name:        __________________
 * Your Student ID:  __________________
 * Your Date:        __________________
 */

import java.util.Scanner;

public class PalindromeDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Step 1: Ask the user to enter a string.
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Step 2: Create a Stack and a Queue.
        // Use the length of the input string as capacity.
        int x = text.length();

        Stack stack = new Stack(x);
        Queue queue = new Queue(x);


        // Step 3: Traverse the string from left to right.
        // Get the character at the current index.


        // Insert the character into the stack.


        // Insert the same character into the queue.
        for (int i = 0 ; i < text.length() ; i++){
            char ch = text.charAt(i);

            stack.push(ch);
            queue.enqueue(ch);
        }

        // Step 4: Assume the string is a palindrome.
        boolean isPalindrome = true;

        // Step 5: Compare characters while the queue is not empty.
        for (int i = 0 ; i < text.length() ; i++){
            char a = queue.dequeue();
            char b  = stack.pop();
            if (a != b){
                isPalindrome = false;
            }
        }


        // Remove one character from the stack.


        // Remove one character from the queue.


        // Compare the two characters.
        // If they are different, update isPalindrome.
        // Stop comparing if a mismatch is found.


        // Step 6: Display whether the string is a palindrome.
        System.out.println(text + " is it palindrome? : " + isPalindrome);

        input.close();
    }
}

