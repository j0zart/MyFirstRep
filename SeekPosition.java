import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
public class SeekPosition {

	public static void main (String []args)throws IOException {

		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		RandomAccessFile raf=null;
		String fileName;
		int pos;
		System.out.println("Enter a filename >>");
		fileName=scanner.nextLine();
		System.out.println("Enter a position number >>");
		pos=Integer.parseInt(scanner.nextLine());
		try {

			raf=new RandomAccessFile(new File(fileName), "r");
			raf.seek(pos);
			for(int ct = 0; ct < 10; ct++) {

				byte b = raf.readByte();
				System.out.print((char)b);
			}
		}
		catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
		}
	}
}