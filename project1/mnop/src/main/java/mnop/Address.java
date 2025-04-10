package mnop;

public class Address {
	private int a;
	private String address;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Address [a=" + a + ", Address=" + address + ", b=" + b + ", getA()=" + getA() + ", getAddress()="
				+ getAddress() + ", getB()=" + getB() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
