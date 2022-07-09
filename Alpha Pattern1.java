import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
	int n ;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
	for(int row=1;row<=n;row++)
    {
        for(int col=1;col<=n;col++)
        {
            char ch= (char)('A'+col-1);
            System.out.print(ch);
             
        }
        System.out.println();
    }
		
		
	}

}

// Output
// ABCD
// ABCD
// ABCD
// ABCD
