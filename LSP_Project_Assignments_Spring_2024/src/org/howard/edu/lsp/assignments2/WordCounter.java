package org.howard.edu.lsp.assignments2;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class WordCounter {

	public static void main(String[] args) {
		try{
		  //  String content=new String(Files.readAllBytes(Paths.get("./abc.txt")));
		                // Specify the path to your words.txt file
            String filePath = "src/words.txt";

            // Use BufferedReader to read the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Read each line and concatenate into a single string
            StringBuilder contentBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }
            reader.close();

            // Get the content as a single string
            String content = contentBuilder.toString();
		    String[] words=content.split("\\W+");
		    Map<String, Integer> wordCounts=new HashMap<>();
		    for (String word:words){
		        if (word.length()>3 && !checkNumeric(word)){
		            word=word.toLowerCase();
		            wordCounts.put(word,wordCounts.getOrDefault(word,0)+1);
		        }
		    }
		    for (Map.Entry<String, Integer> entry: wordCounts.entrySet()){
		        System.out.println(entry.getKey()+"\t"+entry.getValue());
		    }
		}
		catch(IOException e){
		    e.printStackTrace();
		}
	}
	private static boolean checkNumeric(String a){
	    try{
	        Double.parseDouble(a);
	        return true;
	    }catch(NumberFormatException e){
	        return false;
	    }
	}

}