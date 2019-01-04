package junes;

public class 반복함수_재귀함수_1 {
	
	//최대값 찾기 함수
	public static int max(int a, int b)
	{
		return (a>b)?a:b; 
	}
	public static int func(int a, int b, int c) {
		
		int result = 0;
		result = max(a, b);
		result = max(result, c);
		return result;
		
	}
	
	// 일반 팩토리얼
	public static int factorial(int number) {
		
		int result=1;
		for(int i=2; i<=number; i++)
		{
			System.out.println(result);
			result = i*result;
		}
		return result;
	}
	//재귀함수 
	public static int factorial2(int number) {
		
		if(number == 1) {
			return 1;
		}
		else
			return number*factorial2(number-1);
		}
	


	public static void main(String[] args) {
		
		System.out.println(factorial2(10));
		
	}

}
