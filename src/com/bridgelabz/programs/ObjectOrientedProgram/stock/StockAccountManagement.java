package com.bridgelabz.programs.ObjectOrientedProgram.stock;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.programs.utility.Util;





public class StockAccountManagement {
	
	
	public static void  CreateNewAccount(String location ,String location2) throws JsonParseException, JsonMappingException, IOException 
	{
		ObjectMapper mapper = new ObjectMapper () ;
		StockController stockController = new StockController() ;
		stockController = mapper.readValue(new File(location), StockController.class) ;
		
		ArrayList<StockClass> stockList = new ArrayList<StockClass>() ;
		stockList.addAll(stockController.getStock()) ;
		
		StockClass  stock = new StockClass() ;
		System.out.println("enter stoke name ") ;
		String name = Util.Scanner() ;
		stock.setStockName(name);
		
		System.out.println("enter number of share") ;
		int numberOfshare = Util.scanner()  ;
		stock.setNumberOfShare(numberOfshare) ;
		
		System.out.println("enter Share price") ;
		int sharePrice = Util.scanner() ; 
		stock.setSharePrice(sharePrice) ;
		
		stock.setTotalValue(sharePrice * numberOfshare);
		
		stockList.add(stock) ;
		
		stockController.setStock(stockList);
		
		mapper.writeValue(new File(location2), stockController.getStock());
		
		System.out.println("end");
	}
	
	public void buy( int amount , String symbol ) 
	{
		
	
	}
	public static void stockReadFromFile ( String locationOfJsonFile , String LocationOfJsonFileOut) throws JsonParseException, JsonMappingException, IOException 
	{
		ObjectMapper mapper = new ObjectMapper() ;
		StockController stockController = new StockController() ;
		
		stockController = mapper.readValue ( new File( locationOfJsonFile ),StockController.class ) ;
		
		ArrayList<StockClass> stockList = new ArrayList<StockClass>() ;	
		stockList.addAll(stockController.getStock()) ;
	
			for( int i = 0 ; i < stockList.size() ; i++) 
			{
				int stockTotalvalues = stockController.getStock().get(i).getNumberOfShare() * stockController.getStock().get(i).getSharePrice() ;
				stockController.getStock().get(i).setTotalValue(stockTotalvalues);
				System.out.println("Stock Name = "+ stockController.getStock().get(i).getStockName() +"\n"+"Number Of Shares = "+stockController.getStock().get(i).getNumberOfShare() +"\n"+"share Price = "+stockController.getStock().get(i).getSharePrice()+"\n"+"stockTotalvalues = "+stockTotalvalues) ;
				System.out.println() ;
				
			}
			
		mapper.writeValue(new File (LocationOfJsonFileOut),stockController.getStock());
		
	}
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
	{	
		String locationOfJsonFile = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/stock/stock.json";
		String locationOfJsonFileOut = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/stock/stockOut.json" ;
		
		StockAccountManagement.stockReadFromFile(locationOfJsonFile,locationOfJsonFileOut);
		//StockAccountManagement.CreateNewAccount(locationOfJsonFile ,locationOfJsonFileOut);
	}

}
