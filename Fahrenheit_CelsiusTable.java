// Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
// Input Format :
// 3 integers - S, E and W respectively 
// Output Format :
// Fahrenheit to Celsius conversion table. One line for every Fahrenheit and corresponding Celsius value. The Fahrenheit value and its corresponding Celsius value should be separate by single space.
// Constraints :
// 0 <= S <= 90
// S <= E <=  900
// 0 <= W <= 80 
// Sample Input 1:
// 20
// 119
// 13
// Sample Output 1:
// 20  -6
// 33  0 
// 46  7
// 59  15
// 72  22
// 85  29
// 98  36
// 111 43
// Explanation For Input 2:
// Start calculating the Celsius values for each Fahrenheit Value which starts from 20. So starting from 20, we need to compute its corresponding Celsius value which computes to -6. We print this information as <Fahrenheit Value> <a single space> <Celsius Value> on each line. Now add 13 to Fahrenheit Value at each step until you reach 119 in this case. You may or may not exactly land on the end value depending on the steps you are taking.


import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        
        
        int S= sc.nextInt();
        int E= sc.nextInt();
        int W= sc.nextInt();
		
        int f=0;
        
    while(S<=E)
    {
        f=((5*(S-32))/9);
        System.out.println( S + " "+ f);
        S+=W;
      
    }
		
	}

}
