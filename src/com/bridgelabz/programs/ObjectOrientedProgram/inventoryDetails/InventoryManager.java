package com.bridgelabz.programs.ObjectOrientedProgram.inventoryDetails;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.programs.utility.Util;

public class InventoryManager
{

	public static void inventoryAdd(String locationIn , String locationOut ) throws JsonParseException, JsonMappingException, IOException 
	{
		ObjectMapper mapper = new ObjectMapper() ;
		InventoryDetail inventoryDetails = new InventoryDetail() ;
		inventoryDetails = mapper.readValue(new File(locationIn ), InventoryDetail.class ) ;
		
		ArrayList<Rice> riceList = new ArrayList<Rice>() ;
		riceList.addAll(inventoryDetails.getRice());
		
		ArrayList<Pulses> pulsesList = new ArrayList<Pulses>() ;
		pulsesList.addAll(inventoryDetails.getPulses());
		
		ArrayList<Wheats> wheatsList = new ArrayList<Wheats> () ;
		wheatsList.addAll(inventoryDetails.getWheats()) ;
		
		System.out.println("Enter number of entry do u want to add in inventory deatils  ") ;
		int numberOfEntry = Util.scanner() ;
		
		while( numberOfEntry > 0) 
		{
			System.out.println("Enter InventoryName (rice,pulses,wheats)") ;
			String inventoryName = Util.Scanner();
			
			switch ( inventoryName ) 
			{
			 case "rice" :
				 Rice rice = new Rice() ;
				 System.out.println("enter name ") ;
				 String name = Util.Scanner() ;
				 rice.setName(name) ;
				 System.out.println("enter weight ") ;
				 int weight = Util.scanner() ;	
				 rice.setWeight(weight);
				 System.out.println("enter price ") ;
				 int price = Util.scanner() ;
				 rice.setPrice(price) ;
				 rice.setTotalValue(price * weight ) ;
				 riceList.add(rice);
				 break ;
			
			 case "pulses" :
				 Pulses pulses = new Pulses() ;
				 System.out.println("enter name ") ;
				 name = Util.Scanner() ;
				 pulses.setName(name) ;
				 System.out.println("enter weight ") ;
				 weight = Util.scanner() ;	
				 pulses.setWeight(weight);
				 System.out.println("enter price ") ;
				 price = Util.scanner() ;
				 pulses.setPrice(price) ;
				 pulses.setTotalValue(weight * price ) ;
				 pulsesList.add(pulses) ;
				 break ;
			
			 case "wheats" :
				 Wheats wheats = new Wheats() ;
				 System.out.println("enter name ") ;
				 name = Util.Scanner() ;
				 wheats.setName(name) ;
				 System.out.println("enter weight ") ;
				 weight = Util.scanner() ;	
				 wheats.setWeight(weight);
				 System.out.println("enter price ") ;
				 price = Util.scanner() ;
				 wheats.setPrice(price);
				 wheats.setTotalValue(weight * price );
				 wheatsList.add(wheats) ;
				 break ;
			default :
				System.out.println(" Enter valid Entry " ) ;
				break;
				 
			}
			numberOfEntry-- ;
		}
		inventoryDetails.setRice(riceList);
		inventoryDetails.setPulses(pulsesList);
		inventoryDetails.setWheats(wheatsList);
		mapper.writeValue(new File(locationOut),inventoryDetails );
		System.out.println("entry over ");
		 
	}
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{   
		String locationIn = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/inventoryDetails/invetoryDetail.json" ;
		String locationOut = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/inventoryDetails/inventoryDetailOut.json" ;
		
		InventoryManager.inventoryAdd(locationIn, locationOut);
	}

}
