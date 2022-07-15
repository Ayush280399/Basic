package level1;

import java.util.Scanner;

public class ArmRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Give a Range:");
		Scanner sc=new Scanner(System.in);
		int low=sc.nextInt();
		int high=sc.nextInt();
		sc.close();
		for(int input=low;input<=high;input++){
			//int num=input;
			
		
		//int input=sc.nextInt();
		int org=input;
		int result=0;
		int rem=0;
		
		int pow= getlen(input);
		
		while(org!=0) {
			rem=org%10;
			result = result + (int)Math.pow(rem,pow);
			org =org/10;
		}
		//System.out.println(result);
		//System.out.print(input==result);
		if(result==input) {
			
			System.out.print(result+" ");
			//break;
		}
		
		
		}
		
	}
	public static int getlen(int input) {
		int pow=0;
		while(input!=0) {
			pow++;
			input/=10;
		
		}
		return pow;
		
	}

}
