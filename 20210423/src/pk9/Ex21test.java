package pk9;

public class Ex21test {

	public static void main(String[] args) {
		
		Ex21 ex=new Ex21();
		
		ex.setVolume(5);
		ex.setMute(true);
		ex.getVolume();
		ex.setMute(false);
		ex.getVolume();
		
		ex.setVolume(8);
		ex.setMute(true);
		ex.getVolume();
		ex.setMute(false);
		ex.getVolume();
		
		Ex20 ex2=new Ex21();
		ex2.setVolume(3);
		ex.turnOn();
		
		Ex20.changeBattery();
		Ex21.print();
		
	}

}
