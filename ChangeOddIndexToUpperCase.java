package week3day1;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String input1 = "changeme";
		String input2 = new String("changeme");
		String input = input2.toUpperCase();
		int length = input.length();
		//System.out.println("The lenght is" +length);
		char[] charArray=input.toCharArray();
		
		for(int i=0; i<charArray.length; i++) {
			
			if(charArray[i]%2 !=0){
                System.out.print(charArray[i] + " ");
		}
		
	}
	
}
	
}
