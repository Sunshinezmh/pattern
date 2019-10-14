package cindy;

/**
 * @Classname Singleton
 * @Auther sunshinezhang
 * @Date 2019/10/13 16:46
 */
public class Singleton {
	private  volatile static Singleton instance = null;
	private Singleton(){

	}
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null ){
					 instance = new Singleton();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		Singleton firstSingleton = Singleton.getInstance();
		Singleton secondSingleton = Singleton.getInstance();
		System.out.println(firstSingleton == secondSingleton);
	}
}
