package generic.without;

import generic.Apple;


public class ObjectHolderTest {

	public static void main(String[] args) {

		ObjectHolder holder = new ObjectHolder();
		
		// 需要想清楚要向容器中放入什么元素
		// 向holder容器中放入Apple
		holder.setObject(new Apple());
		
		// 需要对从容器中取出的元素进行手动类型转换
		// 我们知道容器中放入的是Apple,拿出容器中的对象，将他转型为Apple
		Apple apple = (Apple) holder.getObject();
		apple.functionInApple();
		
		// 需要对从容器中取出的元素进行转型，但是可能会因为疏忽造成转型错误。
		// 我误以为这个holder容器中放的是Orange,结果导致程序运行出现异常
		//generic.Apple cannot be cast to generic.Orange
		//Orange orange = (Orange) holder.getObject();
		//orange.functionInOrange();
	}

}