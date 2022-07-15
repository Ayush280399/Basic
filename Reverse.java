package level1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int org=sc.nextInt();
		
		int num=org;
		
		int result=0;
		
		//Integer result=new Integer(0);
		
		while(org!=0) {
			int rem=org%10;
			result=(result*10)+rem;
			org=org/10;
		}
		
//		if(org==result) {
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
		System.out.println(num==result);
		
		
		

	}

}
