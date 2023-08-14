 package forLoop;

import java.util.Scanner;

public class evenOperation {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of number: ");
		int num= sc.nextInt();
		
		System.out.println("enter the start number");
		int num2=sc.nextInt();
		
		sc.close();
System.out.println("odd numbers");
Oddnumber(num,num2);
System.out.println("sum");
int sum=summation(num,num2);
System.out.println(sum);
System.out.println("count");
int count=countEven(num,num2);
System.out.println(count);
	}
	public static  void Oddnumber(int num,int num2)
	{
		for(int i=num ;i<=num2;i++) {
			if(i%2==0) {
				
				System.out.println(i);
			}
			
		}
	}
 
	public static  int summation(int num, int num2) {
		int sum=0;
		for(int i=num ;i<=num2;i++) {
			if(i%2==0) {
				sum+=i;
				
			}
		}
		
		
		return sum;
	}
	public static int countEven(int num,int num2) {
		int count=0;
		for(int i=num ;i<=num2;i++) {
			if(i%2==0) {
				count++;
				
			}
		}
		
		
		return count;
	}
	
}
