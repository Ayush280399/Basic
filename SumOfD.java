package level1;

import java.util.Scanner;

public class SumOfD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		
		while(num!=0) {
			count+=(num%10);
			num=num/10;
		}
		System.out.println(count);

	}

}
