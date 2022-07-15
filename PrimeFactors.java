package level1;

import java.util.Scanner;
public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				prime(i);
				//System.out.println(i);
			}
		}

	}
	
	public static void prime(int p) {
		boolean flag=false;
		//int i=0;
		

			for(int j=2;j<p;j++) {
				if(p%j==0) {
					flag=true;
					break;
				}
			}
			if(flag!=true) {
				System.out.println(p);
			}
		
	}

}



