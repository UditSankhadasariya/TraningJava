package collection;

import java.util.HashSet;

class Device implements Comparable{
	private int dId;
	private String dName;
	@Override
	public int hashCode() {
		return this.dName.charAt(0);
	}
	private double dPrice;
	public Device(int dId, String dName, double dPrice) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dPrice = dPrice;
	}
	public int getdId() {
		return dId;
	}
	@Override
	public boolean equals(Object obj) {
		Device dev = (Device)obj;
		if(this.dId==dev.dId) {
			return true;
		}else {
			return false;
		}
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public double getdPrice() {
		return dPrice;
	}
	public void setdPrice(double dPrice) {
		this.dPrice = dPrice;
	}
	@Override
	public String toString() {
		return "Device [dId=" + dId + ", dName=" + dName + ", dPrice=" + dPrice + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}





public class NewEx {
	public static void main(String[] args) {
		HashSet<Device> set = new HashSet<Device>();
		set.add(new Device(101,"Hello",83));
		set.add(new Device(1001,"dshsd",8553));
		set.add(new Device(1001,"dshsd",8553));
		
		
		for(Device temp: set) {
			System.out.println(temp);
		}
		
		
	}
}
