package junes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class 기본_입출력 {

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
			System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다.");
		}
		
		
		
		
		
	}

}
