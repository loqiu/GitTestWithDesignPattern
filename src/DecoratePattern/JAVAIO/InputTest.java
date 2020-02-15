package DecoratePattern.JAVAIO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputTest {
	public static void main(String[] args) {
		int c;
		try {
			/**
			 * 体现装饰者的层层嵌套
			 */
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("")));

			while ((c = in.read()) >= 0) {
				System.out.println((char) c);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
