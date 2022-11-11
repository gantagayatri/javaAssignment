#Write a program to check if a even number is palindrome or not - Day 3 Assignment

import java.util.*;
public class Palindrome{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int a,r,sum=0,temp;
		System.out.println("enter the a");
		a=in.nextInt();
		temp=a;
	    int l=a%2;
		while(a!=0){
		r=a%10;
		sum=(sum*10)+r;
		a=a/10;
		}
		if(l==0 && temp==sum){
			System.out.println("plaindrome");
		}
		else{
			System.out.println("not plaindrome");
		}
	}
}
	
