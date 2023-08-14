package forLoop;

import java.util.Scanner;

public class OddOperation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter start number");
		int num = sc.nextInt();
		System.out.println("enter end num");
		int num1=sc.nextInt();
		sc.close();
	findOdd(num,num1);
	System.out.println("summation");
	
	int sum= summation(num, num1);
	System.out.println(sum);
	System.out.println("count");
	int count=countOdd(num,num1);
	System.out.println(count);
	}
	public static void findOdd(int num,int num1) {
		for(int i=num;i<=num1;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}
	public static int summation(int num,int num1)
	{ 
		int sum=0;
		for(int i=num ;i<=num1;i++) {
		if(i%2==1){
			sum+=i;
		}
		}
		return sum;
	
	}
	public static int countOdd(int num,int num1) {
		int count=0;
		
		for(int i=num ;i<=num1;i++) {
			if(i%2==1) {
				
				count++;
			}
		}
		
		
		return count;
	}
}
