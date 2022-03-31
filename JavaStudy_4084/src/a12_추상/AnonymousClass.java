package a12_추상;

/**
 * 
 * 익명클래스, 무명클래스
 *
 */

public class AnonymousClass {

	public static void main(String[] args) {
		Animal animal = new Animal() {
			@Override
			public void move() {
				System.out.println("토끼가 뜁니다.");
				
			}
		};
		
		Animal anima2 = new Animal() {
			@Override
			public void move() {
				System.out.println("강아지가 뜁니다.");
				
			}
		};
		
		animal.move();

	}

}
