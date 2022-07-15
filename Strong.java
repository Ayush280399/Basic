package level1;

public class Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num=145;
	    int temp=num;
	    int result=0;
	    while(num!=0){
	    	int rem=num%10;
	    	int fact=1;
	    	for(int i=rem;i>=1;i--) {
	    		fact=fact*i;
	    	}
	    	result+=fact;
	    	num=num/10;
	    	
	    }
	    System.out.println(result);
	    if(result==temp) {
	    	System.out.println("Strong");
	    }
	    else {
	    	System.out.println("Not");
	    }

	}

}
