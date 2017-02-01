package example27;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ConnectionTest {

	public static void main(String[] args) {
		 Document doc;
		try {
			doc = Jsoup.connect("http://www.javatpoint.com").get();
		
         String title = doc.title();  
         System.out.println("title is: " + title);  
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

}
