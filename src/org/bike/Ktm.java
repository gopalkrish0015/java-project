package org.bike;

public class Ktm implements  Bike  {
	@Override
	public void cost() {
		// TODO Auto-generated method stub
		
	System.out.println("200000");
	
	}
	
	@Override
	public void speed() {
		// TODO Auto-generated method stub
		
	System.out.println("200 km per hour");
	
	}
	public static void main(String[] args) {
		Ktm g = new Ktm();
		g.speed();
		g.cost();
	}
}



