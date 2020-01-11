package com.bridgelabz.programs.ObjectOrientedProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;




public class InventoryRunclass {

	
	public static void inventoryVeriableRead (String jsonFileLocation  ) throws JsonParseException, JsonMappingException, IOException 
	
	{
		
		ObjectMapper mapper = new  ObjectMapper() ;
		InputStream inputFile = new FileInputStream(jsonFileLocation) ;
		InventoryDetailsCal inventorydetails = mapper.readValue(inputFile,InventoryDetailsCal.class ) ;
		System.out.println(inventorydetails.getName()) ;
		System.out.println(inventorydetails.getPrice()) ;
		System.out.println(inventorydetails.getWeight()) ;
		int calulateRate = inventorydetails.getPrice() * inventorydetails.getWeight() ;
		System.out.println(calulateRate) ;
	}
	
	public static void inventoryObjectThroughVariableRead( String jsonFileLocation) throws JsonParseException, JsonMappingException, IOException 
	{
		ObjectMapper mapper = new  ObjectMapper() ;
		InputStream input = new FileInputStream(jsonFileLocation) ;
		TypeReference<List<InventoryDetailsCal>> typeReference = new TypeReference<List<InventoryDetailsCal>>() {} ;
		List<InventoryDetailsCal> inventoryDetailsCal = mapper.readValue(input, typeReference) ;
		
		for(InventoryDetailsCal riceInventory : inventoryDetailsCal  ) 
		{
			System.out.println(riceInventory.getRice().getName() + "  " + riceInventory.getRice().getPrice() + "  " + riceInventory.getRice().getWeight() ) ;
			System.out.println(riceInventory.getPulses().getName() + "  " + riceInventory.getPulses().getPrice() + "  " + riceInventory.getPulses().getWeight() ) ;
			System.out.println(riceInventory.getWheats().getName() + " " + riceInventory.getWheats().getPrice() + " " + riceInventory.getWheats().getWeight())  ;
		}
	}
	public static void main(String[] args) throws  IOException
	{ 	
			
		String jsonFileLocation1 = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/utility/invetoryDetail.json" ;
		String jsonFileLocation2 = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/invetoryDetail.json" ;
		// InventoryRunclass newRun = new InventoryRunclass() ;
		// newRun.inventoryRead(jsonFileLocation);
		
		
	}

}

