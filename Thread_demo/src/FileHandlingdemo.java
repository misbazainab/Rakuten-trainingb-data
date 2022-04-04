import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;
public class FileHandlingdemo {
	public static void main(String []args)throws IOException {
		readfile();
	}
	private static void readfile() throws IOException {
		FileReader reader=new FileReader("input.txt");
		BufferedReader BufferedReader = new BufferedReader(reader);
		String line = bufferedReadline();
		System.out.println(line);
		
	}
	private static String bufferedReadline() {
		return null;
	}
}
