package javabasic.codes.one;

public class ArrayTest {

	public static void main(String[] args) {
		
		//采用静态初始化方式初始化第1个数组
		String[] books = new String[] {
				"疯狂java讲义",
				"轻量级javaEE企业应用实战",
				"疯狂Ajax讲义",
				"疯狂XML讲义"
		};
		//采用静态初始化的简化形式初始化第2个数组
		String[] names = {
				"孙悟空",
				"猪八戒",
				"白骨精"
		};
		//采用动态初始化的语法初始化第3个数组
		String[] strArr = new String[5];
		//访问3个数组的长度
		System.out.println("第1个数组的长度：" + books.length);
		System.out.println("第2个数组的长度：" + names.length);
		System.out.println("第3个数组的长度：" + strArr.length);
	
		//让books数组变量、strArr数组变量指向names所引用的数组
		books = names;
		strArr = names;
		System.out.println("---------------");
		System.out.println("books数组的长度：" + books.length);
		System.out.println("strArr数组的长度：" + strArr.length);
		//改变books数组变量所引用的数组的第2个元素值。
		books[1] = "唐僧";
		System.out.println("names数组的第2个元素是：" + books[1]);
	}

}
