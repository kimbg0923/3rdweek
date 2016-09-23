package Homework;

public class ch4no12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		while(num<6)
		{
		for(int i = 1; i < 4; i++)
			{
				System.out.print(num+"*"+i+"="+num*i+"\t");
				num++;
				System.out.print(num+"*"+i+"="+num*i+"\t");
				num++;
				System.out.print(num+"*"+i+"="+num*i+"\t");
				num-=2;
				System.out.println();
				
			}
		num+=2;
		}
		num+=2;
		for(int i = 1; i < 4; i++)
		{
			System.out.print(num+"*"+i+"="+num*i+"\t");
			num++;
			System.out.print(num+"*"+i+"="+num*i+"\t");
			num--;
			System.out.println();
			
		}
	}

}
