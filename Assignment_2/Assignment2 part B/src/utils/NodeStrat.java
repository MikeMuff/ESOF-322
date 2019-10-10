package utils;

import java.io.FileWriter;

public class NodeStrat extends StoreStrategy{
	public void store() {
		System.out.println("Used NodeStorage");
		try{
			FileWriter fw=new FileWriter("testoutNode.txt");
			fw.write("Used NodeStorage");
			fw.close();
		}catch(Exception e){System.out.println(e);} 
	}
}