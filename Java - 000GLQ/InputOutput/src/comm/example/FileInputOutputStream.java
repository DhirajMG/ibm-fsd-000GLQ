package comm.example;
import java.io.*;

public class FileInputOutputStream {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("input.txt");
		File outputFile = new File("output.txt");
		
		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		int c;
		
		while((c= in.read())!=-1)  {
			System.out.println((char)c);
			try {
				out.write(c);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("FileInputStream is used to read a file and FileOutputStream is used to write a file");
		try {
			in.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
