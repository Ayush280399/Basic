package level1;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}

	}

}
