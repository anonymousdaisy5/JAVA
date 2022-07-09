// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 1
// 21
// 321
// 4321
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 50
// Sample Input 1:
// 5
// Sample Output 1:
// 1
// 21
// 321
// 4321
// 54321
  
  
  
  
  
  
  
  import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
int n ;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
	for(int row=1;row<=n;row++)
    {
        for(int col=row;col>=1;col--)
        {
            System.out.print(col);
        }
        System.out.println();
    }
		
	}

}
		
