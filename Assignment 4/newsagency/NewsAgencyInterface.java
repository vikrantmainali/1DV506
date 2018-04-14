package vm222cv_assign4.newsagency;

public interface NewsAgencyInterface 
{	
	void registerToAgency(Object object); //registering newspaper to agency
		
	void getNews(Object object); //agencies getting published news from a newspaper
	
	Object broadcastNews(); 
	//agencies broadcasting the published news from a newspaper to other registered newspapers
	
}
