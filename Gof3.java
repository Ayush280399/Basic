package level1;

public class Gof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=2,c=5;
		
		if(a>b&&a>c) {
			System.out.println(a);
			
		}
		else if(a>b && a<c) {
			System.out.println(c);
		}
		else {
			System.out.print(b);
		}

	}

}
