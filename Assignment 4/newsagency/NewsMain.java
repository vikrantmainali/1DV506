package vm222cv_assign4.newsagency;

public class NewsMain 
{
	public static void main(String[] args) 
	{

	NewsAgency reuters = new NewsAgency(); //calling the NewsAgency class reuters
	
	// i have called a few news papers below 
	NewsPaper dn = new NewsPaper();	
	NewsPaper expressen = new NewsPaper();
	NewsPaper metro = new NewsPaper();
	NewsPaper svenskaDagbladet = new NewsPaper();

	System.out.println("Checking if Dagens Nyheter is registered to Reuters: " + reuters.isRegisteredPaper(dn));
	
	//registering newspapers to agency (reuters in this case)
	dn.registerTo(reuters);
	expressen.registerTo(reuters);
	metro.registerTo(reuters);
	svenskaDagbladet.registerTo(reuters);
	
	
	System.out.println("Checking if Dagens Nyheter registration to Reuters is complete: " + reuters.isRegisteredPaper(dn));
		
	dn.broadcastNews("This is a breaking news story"); //dn broadcasts a news

	System.out.println("News broadcast from Reuters: " + reuters.broadcastNews()); 
	//reuters gets the news and broadcasts its further to other newspapers that are registered to them
	
	//I am aware that dn is able to broadcast the news as well, although it shouldn't be able to 
	System.out.println("Expressen displays the news from Reuters: " + expressen.getNews());
	System.out.println("Metro displays the news from Reuters: " + metro.getNews());
	System.out.println("SvenskaDagbladet displays the news from Reuters: " + svenskaDagbladet.getNews());
	}
}
