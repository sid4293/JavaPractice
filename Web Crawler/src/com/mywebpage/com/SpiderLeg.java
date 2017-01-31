package com.mywebpage.com;

import java.io.IOException;
import java.util.*;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SpiderLeg {
	private static final String USER_AGENT =
            "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/13.0.782.112 Safari/535.1";
	private List<String> links = new LinkedList<String>(); // Just a list of URLs
	
	private Document htmlDocument; // This is our web page, or in other words, our document
	
	public void crawl(String url) // Give it a URL and it makes an HTTP request for a web page
	
	{
		try{
			 Connection connection = Jsoup.connect(url).userAgent(USER_AGENT);
	            Document htmlDocument = connection.get();
	            this.htmlDocument = htmlDocument;

	            System.out.println("Received web page at " + url);

	            Elements linksOnPage = htmlDocument.select("a[href]");
	            System.out.println("Found (" + linksOnPage.size() + ") links");
	            for(Element link : linksOnPage)
	            {
	                this.links.add(link.absUrl("href"));
	            }

		}
		catch(IOException ex)
		{
			// We were not successful in our HTTP request
            System.out.println("Error in out HTTP request " + ex);
		}
	}
	public boolean searchForWord(String searchWord) // Tries to find a word on the page
	{
		 System.out.println("Searching for the word " + searchWord + "...");
	        String bodyText = this.htmlDocument.body().text();
	        return bodyText.toLowerCase().contains(searchWord.toLowerCase());
	}
	public List<String> getLinks() // Returns a list of all the URLs on the page
	{
		return this.links;
	}
}
