
// Print the following pattern for the given N number of rows.
// Pattern for N = 3
//  A
//  BB
//  CCC
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 26
// Sample Input 1:
// 7
// Sample Output 1:
// A
// BB
// CCC
// DDDD
// EEEEE
// FFFFFF
// GGGGGGG

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
            char ch= (char)('A'+row-1);
            System.out.print(ch);
             
        }
        System.out.println();
    }
		
		
	}

}
