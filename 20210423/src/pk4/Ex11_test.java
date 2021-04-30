package pk4;

public class Ex11_test {
	public static void main(String[] args) {
		//익명 객체 생성 : interface로만 생성가능
		//일반 클래스나 추상클래스를 이용해서 만들수 없다
		//익명 객체를 만들면 interface를 클래스에 상속하지 않고 바로 쓸수 있다.
		//객체 생성할 때 생성자 뒤에 {};를 하면 익명 객체를 만들 수 있다.
		Ex11 ex=new Ex11() {
			
			private int volume;
			@Override
			public void turnOn() {
				System.out.println("Tv를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("Tv를 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				if(volume>Ex08.MAX_VOLUME) {
					this.volume=Ex08.MAX_VOLUME;
				}
				else if(volume < Ex08.MIN_VOLUME) {
					this.volume=Ex08.MIN_VOLUME;
				}
				else {//0~10사이의 값
					this.volume=volume;
				}
				System.out.println("현재 볼륨 : "+this.volume);
			}
			
		};
		ex.turnOn();
		ex.turnOff();
		ex.setVolume(-200);
		
	
	
}
}
