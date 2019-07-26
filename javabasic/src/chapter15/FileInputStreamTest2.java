package chapter15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		try {
			File file = new File("D:/data/input.txt");
			BufferedReader br  =  new BufferedReader(
					                  new InputStreamReader(
					                		  new FileInputStream(file),"euc-kr")
					                  );
			int i;
			while((i = br.read()) != -1) {
				System.out.print((char)i);   
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
