package forLoop;

import java.util.Scanner;

public class backwardOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		for(int i=num;i>=1;i--) {
			System.out.println(i);
		}
		sc.close();
	}

}
