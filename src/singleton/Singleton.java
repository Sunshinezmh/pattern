package singleton;

/**
 * @Classname Singleton
 * @Auther sunshinezhang
 * @Date 2019/10/13 16:54
 */
public class Singleton {
	private  static Singleton instance = null;

	private Singleton() {

	}

	public static Singleton getInstance(){
		if (instance == null) {
			synchronized (Singleton.class){
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();

		if (singleton==singleton1) {
			System.out.println("值相等");
		}
	}
}
