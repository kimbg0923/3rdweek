package Homework;

public class ch3no02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = ((numOfApples%sizeOfBucket>0) ? numOfApples/sizeOfBucket + 1 : numOfApples/sizeOfBucket);
		
		System.out.println("필요한 바구니의 수 : "+numOfBucket);

	}

}
