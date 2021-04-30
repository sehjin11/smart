package pk4;

public class AudioTest {

	public static void main(String[] args) {

		Ex09 ad=new Ex09();
		ad.turnOn();
		ad.setVolume(8);
		ad.setVolume(15);;
		
		Ex10 ex2=new Ex10(); //tv class °´Ã¼ »ý¼º
		ex2.setVolume(10);
		ex2.setVolume(-10);
		System.out.println(ex2.getVolume());
	}

}
