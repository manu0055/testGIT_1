package dao;

import java.io.File;
import java.io.IOException;

public class DipendentDAO {

	
	
	public void scriviDipendente(Dipendente dip) {
		
		//scrivere il dip dentro un file
		
		
		File myObj = new File("C:\\workspace_morris\\ProgettoJavaPersonale1\\resources\\filename.txt");
		boolean result;
		try {
			result = myObj.createNewFile();
			if(result) {
				System.out.println("file created"+myObj.getCanonicalPath());
			}
			else {
				System.out.println("File already exist at location:"+myObj.getCanonicalPath());
			}
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
