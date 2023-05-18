package filehandling;

import java.io.File;

public class deletefile {

	public static void main(String[] args) {

		File f=new File("D:\\eclips\\eclipse-workspace\\javaproject\\newfile.txt");
		if(f.delete()) {
			System.out.println("file deleted");
		}
		else {
			System.out.println("file not deleted");
		}
	}

}
