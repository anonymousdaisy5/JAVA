package com.first.Hello;

public class object {

	public static void main(String[] args) {
		int n =128;
		int sum=0,r;
		if(n>0) {
			r=n%10;
			sum = (sum*10)+r;
			n=n/10;
				}
		
if(sum==n) {
	System.out.print("PALINDROME");
}else 
{System.out.print("NOT PALINDROME");} 
	}

}
