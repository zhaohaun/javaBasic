package javabasic.codes.two;

public class StaticInitTest {

	// 定义count类变量，定义时指定初始值
	static int count = 2;
	// 通过静态初始化为name类变量指定初始值
	static {
		System.out.println("StaticInitTest的静态初始化块");
		name = "java编程";
	}
	// 定义name类变量时指定初始值
	static String name = "疯狂java讲义";

	public static void main(String[] args) {
		// 访问该类的两个类
		System.out.println("count 类变量的值：" + StaticInitTest.count);
		System.out.println("name 类变量的值：" + StaticInitTest.name);
	}
	/*
	 * StaticInitTest的静态初始化块 
	 * count 类变量的值：2 
	 * name 类变量的值：疯狂java讲义
	 */
}
