package junes;


public class �ݺ��Լ�_����Լ�_2 {

	//�Ǻ���ġ ����, number ��° �Ǻ���ġ �� ���ϱ�
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
		System.out.print("�Ǻ���ġ ������ "+number+"��° ���Ҵ� ");
		return result; 
	}
	
	//����Լ��� �Ǻ���ġ ����
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
