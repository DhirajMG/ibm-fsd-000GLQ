package comm.example;
import java.io.*;

public class CopyByFileReaderWriter {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("input.txt");
		File outputFile = new File("output.txt");
		
		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		
		BufferedReader inputStream = new BufferedReader(in);
		PrintWriter outputStream = new PrintWriter(out);
		
		String l;
		while((l = inputStream.readLine()) != null) {
			System.out.println(l);
			outputStream.println(l);
		}
		in.close();
		out.close();
		
	}

}
