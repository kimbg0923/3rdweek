package Homework;

public class ch4no10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int sum = 0;
		
		String str = String.valueOf(num);
		for(int i=0; i < str.length(); i++) {
			sum+=str.charAt(i)-48;
			
		}

		System.out.println("sum="+sum);

	}

}
