package findCat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read {
	public static List Read(String file) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = reader.readLine();
			List<String> wordsList = new ArrayList<>();
			
            while ((line = reader.readLine()) != null) {
                // Split the line into words using whitespace as delimiter
                String[] words = line.split("\\s+");
                
                // Add the words to the list
                for (String word : words) {
                    wordsList.add(word);
                }
            }
            
            return wordsList;
			
		} catch (Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}
}
