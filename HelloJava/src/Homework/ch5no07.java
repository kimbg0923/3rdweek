package Homework;

public class ch5no07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
			}
			// ���ڿ��� ���ڷ� ��ȯ�Ѵ�. �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻��Ѵ�.
			int money = Integer.parseInt(args[0]);
			System.out.println("money="+money);
			int[] coinUnit = {500, 100, 50, 10 }; // ������ ����
			int[] coin = {5, 5, 5, 5}; // ������ ������ ����
			for(int i=0;i<coinUnit.length;i++) {
				int coinNum = 0;
				coinNum = money / coinUnit[i];
				if(coinNum > coin[i])
				{
					coinNum = coin[i];
				}
				coin[i] -= coinNum;
				money = money - (coinNum * coinUnit[i]);
			
			/* (1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
			1. �ݾ�(money)�� ���������� ������ �ʿ��� ������ ����(coinNum)�� ���Ѵ�.
			2. �迭 coin���� coinNum��ŭ�� ������ ����.
			(���� ����� ������ ���ٸ� �迭 coin�� �ִ� ��ŭ�� ����.)
			3. �ݾ׿��� ������ ����(coinNum)�� ���������� ���� ���� ����.
			*/
			System.out.println(coinUnit[i]+"��: "+coinNum);
			}
			if(money > 0) {
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0); // ���α׷��� �����Ѵ�.
			}
			System.out.println("=���� ������ ���� =");
			for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"��:"+coin[i]);
			}

	}

}
