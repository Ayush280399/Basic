package level1;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int power=sc.nextInt();
		
		int result=1;
		while(power!=0) {
			result*=base;
			power--;
		}
		System.out.print(result);
		

	}

}
