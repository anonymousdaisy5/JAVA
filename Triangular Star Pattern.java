// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// *
// **
// ***
// ****
// Note : There are no spaces between the stars (*).
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 50
// Sample Input 1:
// 5
// Sample Output 1:
// *
// **
// ***
// ****
// *****
// Sample Input 2:
// 6
// Sample Output 2:
// *
// **
// ***
// ****
// *****
// ******

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
int n ;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
	for(int row=1;row<=n;row++)
    {
        for(int col=1;col<=row;col++)
        {
            System.out.print("*");
            
        }
        System.out.println();
    }
		
	



// for left right triangle

 class Trialeft {

	public static void main(String[] args) {
		
		int n =6;
      for(int i =0;i<=6;i++) {
	 
   	  for(int j=2*(n-i);j>=0 ;j--) {
    		  System.out.print(" ");
    	  }
    	  
   	  for(int j=0;j<=i;j++) {
    		  System.out.print( " *");
    	  }
   	  System.out.println();
	
     }
	
	}
 }
