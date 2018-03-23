package javabasic.codes.one;
/*
 * 对于数组变量来说，它并不需要进行所谓的初始化，只要让数组变量指向一个有效的数组对象，程序即可正常使用该数组变量
 */
public class ArrayTest2 {

	public static void main(String[] args) {
		
		//定义并初始化nums数组
		int[] nums = new int[] {3, 5, 20, 12};
		//定义一个prices数组变量
		int[] prices;
		//让prices数组指向nums所引用的数组
		prices = nums;
		for(int i=0; i<prices.length; i++) {
			System.out.println(prices[i]);
		}
	}

}
