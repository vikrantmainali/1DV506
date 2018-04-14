package vm222cv_assign4.newsagency;

public class NewsPaper implements NewsPaperInterface
{
static NewsAgency agency = new NewsAgency();
	
	public void registerTo (NewsAgency agency) //registering the newspaper to a given agency
	{
		agency.registerToAgency(agency);
	}
	
	public void broadcastNews (Object news) //newspaper broadcasting any news
	{
		agency.getNews(news);	
	}
	
	public Object getNews() //newspaper broadcasting news gotten from agency
	{
		return agency.broadcastNews();
	}
}


