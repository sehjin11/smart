package pk3;

public class Animal_test {

	public static void main(String[] args) {

		Cow ex=new Cow();
		System.out.println(ex.kind);
		ex.sound();
		
		Bird ex1=new Bird();
		System.out.println(ex1.kind);
		ex1.sound();
		
		Animal ani;
		ani=new Cow();
		ani.breathe();
		ani.sound();
		//자동 형변환 이용하여 부모클래스도 사용
		
		ani=new Bird();
		ani.breathe();
		ani.sound();
		
		animalSound(new Bird());
		animalSound(ex);
		aniKind(ex1);
	}
	public static void animalSound(Animal animal){
		animal.sound();
	}//Animal클래스변수(자식클래스 모두 포함)의 sound 출력
	public static void aniKind(Animal animal) {
		System.out.println(animal.kind);
	}
	public static void print(int i) {
		System.out.println(i);
	}

}
