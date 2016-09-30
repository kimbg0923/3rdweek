package Homework;

public class ch5no08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		for(int i=0; i < answer.length;i++) {
			counter[answer[i]-1]++; 
		/* (1) 알맞은 코드를 넣어 완성하시오. */
		}
		for(int i=0; i < counter.length;i++) {
			System.out.print(i+1+"의 갯수 : ");
			System.out.print(+counter[i]);
			for(int x = 0; x< counter[i];x++)
			{
				System.out.print("*");
			}
		/*
		(2) 알맞은 코드를 넣어 완성하시오.
		*/
		System.out.println();
		}
	}

}
