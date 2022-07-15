package level1;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n=num;
		int result = 1;
		
		while(n>1) {
			result=result*n;
			n--;
		}
		System.out.println(result);

	}

}
