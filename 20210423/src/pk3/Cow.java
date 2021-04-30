package pk3;

public class Cow extends Animal{

	public Cow() {
		super.kind="포유류";
	}	//생성자
	@Override
	public void sound() {
		System.out.println("음메~");
	}

	
}
