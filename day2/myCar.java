package week1.day2;

public class myCar {
	
	public static void main(String[] args) {
		myCar o = new myCar();
		
		int registrationNo = o.getRegistrationNo();
		System.out.println(registrationNo);
		
		String name=o.getOwnerName();
		System.out.println(name);
		
		o.carModel();
			
		boolean punc=o.isPunctured();
		System.out.println(punc);
		
		int diff=o.subtract(7,3);
		System.out.println(diff);
		int mul=o.multiply(7,3);
		System.out.println(mul);
		int div=o.divide(10, 2);
		System.out.println(div);
	}

			public int getRegistrationNo(){
			
			return 7301;
			}

		private String getOwnerName(){
			
			return "JACK";
			}
		
		void carModel(){
			System.out.println("SWIFT");
			}

		public boolean isPunctured(){
						return false;
			}

		public int subtract(int num1, int num2)
		{
			return num1-num2;

			}

		public int  multiply(int num1, int num2)
		{
			return num1*num2;

			}

		public int divide(int num1, int num2)
		{
			return num1/num2;

			}

}
