package junes;


public class 반복함수_재귀함수_2 {

	//피보나치 수열, number 번째 피보나치 수 구하기
	public static int fibonacchi(int number)
	{
		int one = 1;
		int two = 1;
		int result = -1;
		
		if(number==1) 
		{
			return one;
		}
		
		else if(number == 2)
		{
			return two;
		}
		else
		{
			for(int i = 2; i<number; i++)
			{
				 result = one+two;
				 one = two;
				 two = result;
			}
		}
		System.out.print("피보나치 수열의 "+number+"번째 원소는 ");
		return result; 
	}
	
	//재귀함수로 피보나치 구현
	public static int fibonacci2(int number)
	{
		if(number==1)
		{
			return 1;
		}
		else if(number == 2)
		{
			return 1;
		}
		else 
		{
			return fibonacci2(number -1 ) + fibonacci2(number -2 );
		}
	}
	
	
	public static void main(String[] args) {

		System.out.println(fibonacci2(6));
	}

}
