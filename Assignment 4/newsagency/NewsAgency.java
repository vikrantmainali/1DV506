package vm222cv_assign4.newsagency;

import java.util.ArrayList;

public class NewsAgency implements NewsAgencyInterface
{
	public static ArrayList<Object> news; //ArrayList news, this is where the news is stored
	public static ArrayList<Object> registeredPapers; 
	//ArrayList registeredPapers, this is where the registered papers get stored
	
	
	public NewsAgency() //constructor for NewsAgency
	{	
		news =  new ArrayList<Object>();
		registeredPapers = new ArrayList<Object>();
	}
	
	
	public void registerToAgency (Object paperName) //this class is used for NewsPaper class to registers newspapers
	{
		registeredPapers.add(paperName);
	}
	
	
	public boolean isRegisteredPaper(Object paperName) //checking if a given newspaper is registered 
	{
		if (registeredPapers.contains(paperName))
		{
			return true;
		}
		else
			
			return false;
	}

	
	public void getNews(Object newsTitle) //getting published news from a newspaper
	{
		news.add(newsTitle);
	}

	
	public Object broadcastNews() //broadcasting the news to other registered newspapers
	{
		news.remove(news);
		
		return news;
	}
}	
	
