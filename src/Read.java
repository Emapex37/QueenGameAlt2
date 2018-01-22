/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author EvMcQ5970
 */
public class Read {
    
    public int[] readFile(String path){
        int church = 0, army = 0, popularity = 0, wealth = 0, cardNum = 0;
		File readFile = new File(path);
		FileReader in;
		BufferedReader read;
		try {
			in = new FileReader(readFile);
			read = new BufferedReader(in);
			church = Integer.parseInt(read.readLine());
			army = Integer.parseInt(read.readLine());
			popularity = Integer.parseInt(read.readLine());
			wealth = Integer.parseInt(read.readLine());
			cardNum = Integer.parseInt(read.readLine());
			read.close();
			in.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e){
			System.out.println("IOException: " + e.getMessage());
		}
                int[] data = new int[5];
                data[0] = church;
                data[1] = army;
                data[2] = popularity;
                data[3] = wealth;
                data[4] = cardNum;
                return(data);
	}

    
    
}
