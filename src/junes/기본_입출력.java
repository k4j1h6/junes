package junes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class �⺻_����� {

	public static void main(String[] args) {
		 
		File files = new File("input.txt");
		
		try {
			Scanner input = new Scanner(files);
			while(input.hasNextInt()) 
			{
				System.out.println(input.nextInt()*100);
			}
		} catch (FileNotFoundException e) 
		{
			System.out.println("������ �о���� ���߿� ������ �߻��߽��ϴ�.");
		}
		
		
		
		
		
	}

}
