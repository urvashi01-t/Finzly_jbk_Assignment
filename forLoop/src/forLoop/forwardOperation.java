package forLoop;

import java.util.Scanner;

public class forwardOperation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the start number");
		int num=sc.nextInt();
		
		Scanner dc= new Scanner(System.in);
		System.out.println("enter the last number");
		int num2=dc.nextInt();
		
		for(int i=num;i<=num2;i++) {
			System.out.println(i);
		}
		sc.close();
		dc.close();
	}

}
