import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
public class SeekPosition2 {
	
	private static String fileName;
	private static RandomAccessFile raf;
	public static void main(String []args)
			throws IOException {

		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		int pos;
		int numCharacters;
		System.out.println("Enter a filename >>");
		fileName=scanner.nextLine();
		System.out.println("Enter a position number >>");
		pos=Integer.parseInt(scanner.nextLine());
		System.out.println("Enter number of characters to display >>");
		numCharacters=Integer.parseInt(scanner.nextLine());
		try {
			raf=new RandomAccessFile(new File(fileName),"r");
			raf.seek(pos);
			System.out.println("Enter number of characters to display >> "+numCharacters);
			for(int ct = 0; ct <numCharacters; ct++) {
				byte b = raf.readByte();
				System.out.print((char)b);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}