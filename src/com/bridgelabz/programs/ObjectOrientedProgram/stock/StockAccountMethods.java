package com.bridgelabz.programs.ObjectOrientedProgram.stock;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.programs.utility.Util;

public class StockAccountMethods 
{
	 ObjectMapper mapper = new ObjectMapper () ;
	 StockController stockController = new StockController() ;
	// stockController = mapper.readValue(new File(location1), StockController.class) ;
	 ArrayList<StockClass> stockList = new ArrayList<StockClass>() ;
	 StockClass  stock = new StockClass() ;
	 
	// ArrayList<UserList> userlist = new ArrayList<UserList>() ;
	 UserList userList = new UserList() ;
	 
	 
	 
	 public void readOldFile( String location1) throws JsonParseException, JsonMappingException, IOException 
	 
	 {	
		 stockController = mapper.readValue(new File(location1), StockController.class) ;
			
		
			
	 }
	 
	 public  void addSharesAccount(String location ) throws JsonParseException, JsonMappingException, IOException 
	 
	 {
		 	ArrayList<StockClass> stockList = new ArrayList<StockClass>() ;
			stockList.addAll(stockController.getStock()) ;
		
			System.out.println("enter stoke name ") ;
			String name = Util.Scanner() ;
			
			stock.setStockName(name);
			System.out.println("enter number of share") ;
			int numberOfshare = Util.scanner()  ;
			
			stock.setNumberOfShare(numberOfshare) ;
			System.out.println("enter Share price") ;
			int sharePrice = Util.scanner() ; 
			
			stock.setSharePrice(sharePrice) ;
			
			stockList.add(stock) ;
		
	 }
	
	 public void sell( int amount , String symbol ) throws JsonParseException, JsonMappingException, IOException 
		
	 {	 ObjectMapper mapper = new ObjectMapper () ;
		// stockController = mapper.readValue(new File("/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/stock/stockOut.json"), StockController.class) ;

		 ArrayList<StockClass> stockList = new ArrayList<StockClass>() ;
		// stockList.addAll(stockController.getStock()) ;
		 
		 for( int i = 0 ; i< stockList.size() ; i++  )
			{
				if( stockList.get(i).getStockName().equalsIgnoreCase(symbol)  ) 
				{
					int stockNumber = stockList.get(i).getNumberOfShare() ;
					
					stockList.get(i).setNumberOfShare(stockNumber - amount) ;
					break;
				}
			}
			stockList.add(stock) ;
			stockController.setStock(stockList) ;
		//	mapper.writeValue(new File(location), stockController) ;
			mapper.writeValue(new File("/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/stock/stockOut.json"), stockController.getStock()) ;
			
	}
	 
	 public void buy( int amount , String symbol) throws JsonParseException, JsonMappingException, IOException 
	
	 {
		 ObjectMapper mapper = new ObjectMapper () ;
		// stockController = mapper.readValue(new File("/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/stock/stockOut.json"), StockController.class) ;
		 ArrayList<StockClass> stockList = new ArrayList<StockClass>() ;
		// stockList.addAll(stockController.getStock()) ;

			for( int i = 0 ; i< stockList.size() ; i++  )
			{
				if( stockList.get(i).getStockName().equalsIgnoreCase(symbol)   ) 
				{
					int stockNumber = stockList.get(i).getNumberOfShare() ;
					stockList.get(i).setNumberOfShare(stockNumber + amount) ;
				}
			}
			
			stockList.add(stock) ;
		//	stockController.setStock(stockList) ;
			mapper.writeValue(new File("/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/stock/stockOut.json"), stockController.getStock()) ;
			
		}
	 
	 public void store( String location ) throws JsonGenerationException, JsonMappingException, IOException 
	 
	 {
		 //ObjectMapper mapper = new ObjectMapper () ;
		 mapper.writeValue(new File(location), stockController.getStock()) ;
		 System.out.println();
	 }
	 
	 public void displayListOfShare(String location ) throws JsonParseException, JsonMappingException, IOException 
	 {
		 stockController = mapper.readValue(new File(location), StockController.class) ;
		 LinkedList<StockClass> stockList = new LinkedList<StockClass>() ;
		 stockList.addAll(stockController.getStock()) ;
		 System.out.println("list of Stock ");
		 for( int i = 0 ; i< stockList.size() ; i++) 
			{
				int stockTotalvalues = stockController.getStock().get(i).getNumberOfShare() * stockController.getStock().get(i).getSharePrice() ;
				stockController.getStock().get(i).setTotalValue(stockTotalvalues);
				System.out.println("Stock Name = "+ stockController.getStock().get(i).getStockName() +"\n"+"Number Of Shares = "+stockController.getStock().get(i).getNumberOfShare() +"\n"+"share Price = "+stockController.getStock().get(i).getSharePrice()+"\n"+"stockTotalvalues = "+stockTotalvalues) ;
				System.out.println() ;
				
			}
	 }
	 
	 public void displayListOFUser( String location ) throws JsonParseException, JsonMappingException, IOException 
	 {
		User user = new User();
		user = mapper.readValue(new File(location),User.class) ;
		LinkedList<UserList> listOfuser = new LinkedList<UserList>() ;
		listOfuser.addAll(user.getUserList()) ;
		System.out.println("list of users ");
		for(int i = 0 ; i< listOfuser.size() ; i++) 
		{
			System.out.println("\n username = "+user.getUserList().get(i).getName() + "\n sellShare = "+user.getUserList().get(i).getSellShare() + "\n buyShare = "+user.getUserList().get(i).getBuyShare() );
		}
		System.out.println();
		
	 }
	 
	 public void userDetailsSearch(String userName ) throws JsonGenerationException, JsonMappingException, IOException 
	 {      
		
		 	String TransationLocation = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/stock/Transation.json" ;
		 	StockAccountMethods method1 = new StockAccountMethods() ;
		 	Transaction transaction = new Transaction();
		 //	transaction = mapper.readValue(new File(TransationLocation) , Transaction.class) ;
		 	LinkedList<Transaction> listOfTra = new LinkedList<Transaction>();
		 //	listOfTra.addAll(listOfTra) ;
		 	
		 	User user = new User();
		 	user = mapper.readValue(new File("/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/stock/User.json"),User.class) ;
			LinkedList<UserList> userlist = new LinkedList<UserList>() ;
		
		 	userlist.addAll(user.getUserList()) ;
		 	
			int  sellShare = 0 ;
			int  buyShare = 0  ;
			int listNumber = 0 ;
			for(int i = 0 ; i< userlist.size() ; i++) 
			{
				if(userName.equalsIgnoreCase(user.getUserList().get(i).getName()) ) 
				{
					sellShare = user.getUserList().get(i).getSellShare() ;
					buyShare = user.getUserList().get(i).getBuyShare() ;
					
					System.out.println(user.getUserList().get(i).getSellShare());
					System.out.println(user.getUserList().get(i).getBuyShare());
					listNumber = i ;
					break;
				}
				 
			}
			System.out.println("enter stock name ");	
			String stockName = Util.Scanner() ;
			System.out.println("\n1. To buys stock \\n2. To sell Stock User");
			int enterNumber = Util.scanner() ;
			
			switch(enterNumber) 
			{
				case 1 :
					
					System.out.println("enter number of stock to buy") ;
					int stockNumber = Util.scanner() ;
					method1.sell( stockNumber , stockName) ;
					int numberCalNum = stockNumber + buyShare ;
					
				
					transaction.setBuySharByUser(stockNumber) ;
					transaction.setSellComanpnyShar(stockNumber) ;
					
					
					user.getUserList().get(listNumber).setBuyShare(numberCalNum) ;
					userlist.add(userList) ;
					user.setUserList(userlist);
					
					break ;
			
				case 2 :
					
					System.out.println("enter number of stock to sell") ;
					int BuystockNumber = Util.scanner() ;
					method1.buy(BuystockNumber, stockName);
					int numberTo = BuystockNumber + sellShare ;
					
					transaction.setBuySharByUser(numberTo);
					transaction.setSellComanpnyShar(numberTo);
					
					user.getUserList().get(listNumber).setBuyShare(numberTo) ;
					userlist.add(userList) ;
					user.setUserList(userlist);
					break ;
			}
			transaction.setUserName(userName);
			transaction.setCompanyNme(stockName);

			listOfTra.add(transaction);
			mapper.writeValue(new File(TransationLocation), transaction);
			
		//	stockController.setStock(stockList) ;
			mapper.writeValue(new File("/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/stock/User.json"), user) ;
			
	 }
		
	 
		  
	  
}
