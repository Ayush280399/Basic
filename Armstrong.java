package level1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int result=0;
		int org=num;
		int pow=String.valueOf(num).length();
		//1
		while(num!=0) {
			int rem=num%10;//1
			int temp=pow;//3
			int tempresult=1;//1
			while(temp!=0) {
				//int result+=(rem*pow)
				tempresult*=rem;
				temp--;
			
			}
			result+=tempresult;//27+125+1
			num=num/10;//0
		}
		if(result==org) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not");
		}
		

	}

}
