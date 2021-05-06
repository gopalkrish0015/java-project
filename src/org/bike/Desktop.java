package org.bike;

public class Desktop implements HardWare , Software  {
private void desktopModel() {
	// TODO Auto-generated method stub

System.out.println("HP;LENOVO");

}
@Override
	public void hardwareResources() {
		// TODO Auto-generated method stub
		
	System.out.println("intel i3");
	
}
@Override
	public void softwareResources() {
		// TODO Auto-generated method stub
		
	System.out.println("windows 10");
	
}
public static void main(String[] args) {
	Desktop r = new Desktop();
	r.desktopModel();
	r.hardwareResources();
r.softwareResources();

}
}
