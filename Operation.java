#Write a program to divide, multiply, subtract and addition of two numbers - Day 3 assignment

import java.util.*;
public class Operation{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int a,b;
		System.out.println("enter a and b");
		a=in.nextInt();
		b=in.nextInt();
		int c=a/b;
		int d=a*b;
		int e=a-b;
		int m=a+b;
		System.out.println("after dividing:"+c);
		System.out.println("after multiplying:"+d);
		System.out.println("after substrct:" +e);
		System.out.println("after addition:" +m);
	}
}
