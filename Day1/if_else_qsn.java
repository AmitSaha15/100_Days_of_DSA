/*
Problem statement:

Programming languages have some conditional / decision-making statements that execute when some specific condition is fulfilled.
If-else is one of the ways to implement them.
You are given two numbers 'a' and 'b'.
Compare the numbers and print the relation.
Print "smaller", "greater" or "equal" when 'a' is smaller than 'b', greater than 'b', or equal to 'b' respectively.

Example:
Input: 'a' = 5 and 'b' = 3
Output: greater
Explanation: Since 'a' (= 5) is greater than 'b' (= 3), we are printing "greater".
*/

package Day1;

public class if_else_qsn {
    public static String compareIfElse(int a, int b) {
        // Write your code here
        if (a<b){
            return "smaller";
        }
        if (a>b){
            return "greater";
        }
        else{
            return "equal";
        }
    }
}
