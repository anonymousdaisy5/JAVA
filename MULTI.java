// Multiplication Table
// Send Feedback
// Write a program to print multiplication table of n
// Input Format :
// A single integer, n
// Output Format :
// First 10 multiples of n each printed in new line
// Constraints :
// 0 <= n <= 10,000
// Sample Input 1 :
// 2
// Sample Output 1 :
// 2
// 4
// 6
// 8
// 10
// 12
// 14
// 16
// 18
// 20

 import java.io.*;
 import java.util.Scanner; 
class Main
{  
    // Driver code
    public static void main(String arg[])
    {  
        // Change here to change output
        int n ;
        Scanner sc= new Scanner (System.in);
         
    n = sc.nextInt();
        for (int i = 1; i <= 10;i++)
        { System.out.println( n * i);
        } }
}

