package shopping;

public class SmartTv extends Product{
	String resolution;
	public SmartTv(String pname, int price, String resolution)
	{
		this.pname = pname;
		this.price = price;
		this.resolution = resolution;
	}
	public void printExtra()
	{
		System.out.println("ÇØ»óµµ : "+resolution);
	}
}
