package za.co.pvi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileDemo {

	public static void main(String[] args) {
		
		String relative = "quotes.txt";
		String absolute = "/Users/kelvinashu/Desktop/quotes.txt";
		
		absoluteExample(absolute);
	}
	
	public  static void absoluteExample(String file) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			
			String line = null;
			while(  (line = br.readLine()) != null ) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	public static void relativeExample(String path) {
		
	}

}
