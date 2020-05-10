package fileHndling;
import java.io.*;

public class ShowFile {
	public static void main(String [] args) {
		int i;
		FileInputStream fin;
		
		if(args.length!= 1) {
			System.out.println("Usage: ShowFile filename");
			return;
		}
		
		try {
			fin= new FileInputStream(args[0]);
		}catch(FileNotFoundException e) {
			System.out.println("Cannot Open file.");
			return;
		}
		
		try {
			do {
				i=fin.read();
				if(i!=-1)
					System.out.println((char)i);
			}while(i!=-1);
		}catch(IOException e) {
			System.out.println("Error Reading File");
		}
		
		try {
			fin.close();
		}catch(IOException e) {
			System.out.println("Error Closing File");
		}
	}
}
