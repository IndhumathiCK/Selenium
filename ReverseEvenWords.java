package week3day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "I am a software tester"; 
		int length = input.length();
		//System.out.println("The lenght is" +length);
		
		char[] charArray = input.toCharArray();
        for(int i = charArray.length - 1; i>=0 ;i--) {
			
			if(charArray[i]%2 ==0){
                System.out.print(charArray[i] + " ");
		}
		
		
	}

}
	
}
