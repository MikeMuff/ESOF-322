package utils;

import java.io.FileWriter;

public class DocumentStrat extends StoreStrategy{
	public void store() {
		System.out.println("Used Document Storage.");
		try{
			FileWriter fw=new FileWriter("testoutDocument.txt");
			fw.write("Used Document Storage.");
			fw.close();
		}catch(Exception e){System.out.println(e);} 
	}
}