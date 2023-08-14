package forLoop;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter the number");
//	int num= sc.nextInt();
//	
//		System.out.println("series of: "+num);
//		int table= Table(num);
		Series s= new Series();
    s.mixed();
  System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");  
   // s.multiplyTen();
  s.febonacci();
	}
	public static int Table(int num) {
		for(int i=1;i<=10;i++) {
			 num=2;
			num= num*i;
		System.out.print(" "+num);
		}
		return num;
	}
	
	public  void  mixed() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			i++;
			int j=i*(-1);
			System.out.println(j);
		
		}
		
		}
	public void multiplyTen() {
		for(int i=1;i<=1000;) {
			System.out.println(i);

			i=i*10;
			
			
			
		}
	}
	
	public void febonacci() {
		 int fibPrev = 0;
	        int fibCurr = 1;
	        for (int i = 2; i <= 20; i++) {
	            int fibNext = fibPrev + fibCurr;
	            fibPrev = fibCurr;
	            fibCurr = fibNext;
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	           
	        }
	       
		
	}

	}
	

