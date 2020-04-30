package Repl_it_Practice;
/*
    in this assignment you are given two string variables word1 and word2.
you need to check if they are equal using an if.

Comparison should be case sensitive. "java" and "JaVa" are not equal.

if they are equal output  "word1 equals word2"
else output "word1 does not equal word2"

for example:
word1="java"
word2="java"

output:
"word1 equals word2"

word1="foo"
word2="bar"

output:
"word1 does not equal word2"
 */

import java.util.Scanner;

public class Replit_035_Words {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();

        boolean word1EqualWord2 = word1.equals(word2);

        String result = (word1EqualWord2) ? "word1 equals word2" : "word1 does not equal word2";

        System.out.println(result);

    }
}
