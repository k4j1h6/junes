package junes;

public class �Լ� {

	
	public static char func1(String input)
	{
		return input.charAt(input.length() -1); //�Űܺ����� ������ ���ڿ��� ������ ��ġ�� �ܾ ��ȯ
	}
	// ��ȯ��, �Լ���, �Ű�����
	
	
	public static int function(int a, int b, int c) {
		
		int min = 0;
		
		 
		return 0;
		
		//�޼��� == �Լ�
	}
	
	
	// number�� k��°  ��� 
	public static int func2(int number, int k) {
		for(int i=1; i<=number;i++) 
		{
			if(number % i ==0)
			{
				k--;
				if(k==0)
				{
					return i;
				}
			}
		}

		return -1;
	}
	public static void main(String[] args) {
		
		
		/*
		int i=0;
		int j=0;
		int count = 0;
		
		for(i =0; i<5; i++)
		{
			count ++;
			
			for(j =0; j<count;j++)
			{
				System.out.print('*');
			}
			System.out.println("");
		}
		*/
		int result = func2(12,6);
		System.out.println(result);
		
		System.out.println(func1("hello wolrd"));

	}

}
