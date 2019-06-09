package basicPuzzles;

public class Prime1to100 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	int i, number, count; 
//		
//		System.out.println(" Prime Numbers from 1 to 100 are : ");	
//		for(number = 1; number <= 10; number++)
//		{
//			count = 0;
//		    for (i = 2; i <= number/2; i++)
//		    {
//		    	if(number % i == 0)
//		    	{
//		    		count++;
//		    		break;
//		    	}
//		    }
//		    if(count == 0 && number != 1 )
//		    {
//		    	System.out.print(number + " ");
//		    }  
//		}
		
		for(int num = 14; num<=20;num++) {
			int temp=0;
			for(int i=2;i<=num-1;i++) {
				if(num%i==0) {
					temp = temp+1;
					break;
				}
			}
			if(temp==0) {
				System.out.println(num);
			}
			}



	}

}
