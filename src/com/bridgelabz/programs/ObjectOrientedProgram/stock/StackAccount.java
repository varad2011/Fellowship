package com.bridgelabz.programs.ObjectOrientedProgram.stock;

import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.programs.utility.Util;

public class StackAccount 
{

	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		StockAccountMethods accountMethod = new StockAccountMethods() ;
		String locationOfJsonFile = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/stock/stock.json" ;
		String locationOfJsonFileOut = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/stock/stockOut.json" ;
		String locationOfUserList = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/stock/User.json";
		
		accountMethod.displayListOfShare(locationOfJsonFile);
		accountMethod.displayListOFUser(locationOfUserList);
		System.out.println("Select UserName");
		String userName = Util.Scanner() ;
		accountMethod.userDetailsSearch(userName);
		accountMethod.store(locationOfJsonFileOut) ;
		
		
		
	//	accountMethod.readOldFile(locationOfJsonFile);
		//accountMethod.addSharesAccount(locationOfJsonFileOut);
		
	//	accountMethod.sell(40, "ICICI");
		//accountMethod.buy(50, "BANKOFINDIAN");
		accountMethod.store(locationOfJsonFileOut) ;
	}

}
