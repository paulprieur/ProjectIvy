
package example;

import org.apache.commons.lang.WordUtils;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import com.opencsv.CSVReader;


public class Hello {
    public static void main(String[] args) throws IOException {
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
                                + " : " + WordUtils.capitalizeFully(message));
	int monmax = 0;
	CSVReader reader = new CSVReader(new FileReader("data.csv"));
	List<String[]> myEntries = reader.readAll();
	reader.close();
	for (String[] temp : myEntries) {
    		List<String> list = Arrays.asList(temp);
    		for (String elt : list) {
    			System.out.println("Nombre lu : "+elt);
    			if(Integer.parseInt(elt)>monmax) {
    				monmax = Integer.parseInt(elt);
    			}
    		}
    	}
	System.out.println("Max : "+monmax);
    }
}     
