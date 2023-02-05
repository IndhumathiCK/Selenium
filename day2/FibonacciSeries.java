package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int firstNum=0,secNum=1,sum;   
		 System.out.print(firstNum+" "+secNum);//printing 0 and 1    
		    
		 for(int i=2;i<11;i++)//loop starts from 2 because 0 and 1 are already printed    
		 {    
			 sum=firstNum +secNum;    
		  System.out.print(" "+sum);    
		  firstNum=secNum;    
		  secNum=sum;    
		 }    
		  
		
	}

}
