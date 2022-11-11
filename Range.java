#Write a program to find if numbers which are divisible by 23 between 10 to 150
	
public class Range{
	public static void main(String args[]){
		int a=10,b=150;
		for(a=10;b>=a;a++){
			if(a%23==0){
				System.out.println("\n number:" +a);
			}
		}
	}
}
