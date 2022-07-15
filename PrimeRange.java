package level1;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int low=sc.nextInt();
		int high=sc.nextInt();
		boolean flag=false;
		
		
		
		for(int i=low;i<=high;i++) {
			int count=0;
			flag=false;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					//count++;
					//System.out.println(i);
					flag=true;
					break;
					
					}
				
				}
			if(flag!=true) {
				System.out.println(i);
			}
//			if(count<3) {
//				System.out.println(i);				
//			}
			
			}
			
		}

	}


