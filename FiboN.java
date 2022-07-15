package level1;

import java.util.Scanner;

public class FiboN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		//int i=1;
		int result=0;
		int first=0,sec=1;
		while(num>0) {
			result = first + sec;
			first=sec;
			sec=result;
			System.out.print(result+" ");
			num--;
			
		}
		//for(int i=1;i<=num;i++) {
			
			
			
		
		
		
		

	}

}
