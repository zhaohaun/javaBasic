package javabasic.codes.one;

public class ObjectArrayTest {

	public static void main(String[] args) {

		//定义并初始化一个Object数组
		Object[] obj = new Object[3];
		//让obj所引用数组的第2个元素再次指向一个长度为2的Object[]数组
		obj[1] = new Object[2];
		//将obj[1]的值赋给obj2，即让obj2和obj指向同一个数组对象
		Object[] obj2 = (Object[]) obj[1];
		//让obj2所引用数组的第2个元素再次指向一个长度为3的Object[]数组
		obj2[1] = new Object[3];
		//将obj2[1]的值赋给obj3，即让obj3和obj2[1]指向同一个数组对象
		Object[] obj3 = (Object[]) obj2[1];
		//让obj3所引用数组的第2个元素再次指向一个长度为4的int[]数组
		obj3[1] = new int[4];
		//将obj3[1]的值赋给iArr，即让iArr和obj3[1]指向同一个数组对象
		int[] iArr = (int[]) obj3[1];
		//依次为iArr数组的每个元素赋值
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = i*3+1;
		}
		//直接通过obj访问iArr数组的第3个元素
		/*
		 * ((Object[])obj[1])、
		 * ((Object[])((Object[])obj[1])[1])、
		 * ((int[])((Object[])((Object[])obj[1])[1])[1])
		 */
		System.out.println(((int[])((Object[])((Object[])obj[1])[1])[1])[2]);
		
	}

}
