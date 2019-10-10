package utils;

import java.io.FileWriter;

public class TableStrat extends StoreStrategy{
	public void store() {
		System.out.println("Used Table Storage.");
		try{
			FileWriter fw=new FileWriter("testoutTable.txt");
			fw.write("Used Table Storage.");
			fw.close();
		}catch(Exception e){System.out.println(e);} 
	}
}
