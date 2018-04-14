package vm222cv_assign4.newsagency;

public interface NewsPaperInterface
{
	void registerTo (NewsAgency agency); //registering to an agency

	void broadcastNews (Object object);	//publishing a news
	
	Object getNews(); //broadcasting the news

}
