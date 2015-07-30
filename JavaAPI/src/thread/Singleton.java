package thread;
// getInstance();
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() { // 싱글톤에서는 생성자를 private으로 은닉화 시킨다.
		System.out.println("인스턴스 생성");
	}
	public static Singleton getInstance(){ // 하나만의 객체를 가지는 방법
		return singleton;
	}
}
