package com.bridgelabz.programs.ObjectOrientedProgram.stock;

import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.programs.utility.Util;

public class StackAccount 
{

	public  static void recursionCallMethod(String locationOfJsonFile,String locationOfJsonFileOut ,String locationOfUserList) throws JsonParseException, JsonMappingException, IOException
	{   
		System.out.println("welcom to stock market \n1) To enter in stock Market\n2) To logout");
		int userInput = Util.scanner();
		if(userInput == 1) 
		{
			StockAccountMethods accountMethod = new StockAccountMethods() ;
			accountMethod.displayListOfShare(locationOfJsonFile);
			accountMethod.displayListOFUser(locationOfUserList);
			System.out.println("Select UserName");
			String userName = Util.Scanner();
			accountMethod.userDetailsSearch(userName);
			accountMethod.store(locationOfJsonFileOut);
			recursionCallMethod(locationOfJsonFile, locationOfJsonFileOut, locationOfUserList);
		}else 
		{
			System.out.println("Thanks for visiting stock market ");
		}
		
	}
	
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		
		String locationOfJsonFile = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/stock/stock.json" ;
		String locationOfJsonFileOut = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/stock/stockOut.json" ;
		String locationOfUserList = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/stock/User.json";
		StackAccount.recursionCallMethod(locationOfJsonFile, locationOfJsonFileOut, locationOfUserList);
		
		
		
		
		//accountMethod.readOldFile(locationOfJsonFile);
		//accountMethod.addSharesAccount(locationOfJsonFileOut);
		
		//accountMethod.sell(40, "ICICI");
		//accountMethod.buy(50, "BANKOFINDIAN");
		//accountMethod.store(locationOfJsonFileOut) ;
	}

}
