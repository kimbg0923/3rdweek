package Homework;

public class ch4no05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		while(i<10)
		{
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			j = 0;
			i++;
		}
			/*
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++)
			System.out.print("*");
			System.out.println();
			}
			*/
		
	}

}
