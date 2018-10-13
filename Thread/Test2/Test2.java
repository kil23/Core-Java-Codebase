import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;

public class Test2 {

	public static void main(String[] args)  {

		try (MyResource mr = new MyResource() ;FileWriter fw = new FileWriter("abc.txt"); BufferedWriter bw = new BufferedWriter(fw)  ) {
			System.out.println("MyResource created in try-with-resources");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Out of try-catch block.");
	}

	static class MyResource implements AutoCloseable {

		@Override
		public void close() throws Exception {
			System.out.println("Closing MyResource");
		}

	}

	static class MyResource1 implements AutoCloseable {

		

		@Override
		public void close() throws Exception {
			System.out.println("Closing MyResource1");
		}

	}
}