package mnop;

public class Creditcard implements Springex{
	 Creditcard()  {
		System.out.println("hii");
	}


	public void pay() {
      System.out.println("Good Morning");		
	}
	private int x;
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}
	
	private Address add;
	
	
	public Address getAdd() {
		return add;
	}


	public void setAdd(Address add) {
		this.add = add;
	}


	public void getAddress() {
		System.out.println(add.toString());
		}


}
