package Homework;

public class ch5no06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"�� ���� = "+money/coinUnit[i]);
			money = money % coinUnit[i];
		}
	}

}
