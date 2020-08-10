import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class HelloWorld {
	public void HelloWorld() throws IOException {
		File file = new File("C:\\Users\\ADIL EL BOURKI\\Desktop\\JAVA\\hello_unicode.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		while(bufferedReader.readLine()!=null)
		{System.out.println(bufferedReader.readLine());}
	}
}
