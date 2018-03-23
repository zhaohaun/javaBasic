package javabasic.codes.two;

public class ErrorDef {

	//下面代码将提示：非法向前引用
	/*int num1 = num2 + 2;
	int num2 = 20;*/
	
	//下面代码将提示：非法向前引用
	/*static int num3 = num4 + 2;
	static int num4 = 20;*/
	
	//下面代码将完全正确
	int num5 = num6 + 2;
	static int num6 = 20;
}
