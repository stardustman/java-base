package pattern.singleton.hungry;

public class Singleton {

	// 使用private将构造方法私有化，以防外界通过该构造方法创建多个实例
	private Singleton() {
	}

	// 由于不能使用构造方法创建实例，所以需要在类的内部创建该类的唯一实例
	// 使用static修饰singleton 在外界可以通过类名调用该实例 类名.成员名
	static Singleton singleton = new Singleton(); // 1

	// 如果使用private封装该实例，则需要添加get方法实现对外界的开放
	private static Singleton instance = new Singleton(); // 2
	// 添加static，将该方法变成类所有 通过类名访问

	public static Singleton getInstance() {
		return instance;
	}

	// 1和2选一种即可，推荐2
}