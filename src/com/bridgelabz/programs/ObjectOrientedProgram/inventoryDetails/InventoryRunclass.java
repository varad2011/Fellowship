package com.bridgelabz.programs.ObjectOrientedProgram.inventoryDetails;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;

public class InventoryRunclass 
{	
	
	
	public static void main(String[] args) throws  IOException
	{ 	
			
		String jsonFileLocation = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/inventoryDetails/invetoryDetail.json" ;
		String jsonFileLocationOut = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/inventoryDetails/inventoryDetailOut.json" ;
		ObjectMapper mapper =new ObjectMapper() ;
		InventoryDetail inventoryDetail=new InventoryDetail() ;
		inventoryDetail=mapper.readValue(new File(jsonFileLocation), InventoryDetail.class) ;	
		ArrayList<Rice> riceList = new ArrayList<Rice>() ;
		riceList.addAll(inventoryDetail.getRice());
		
		ArrayList<Pulses> pulsesList = new ArrayList<Pulses>() ;
		pulsesList.addAll(inventoryDetail.getPulses());
		
		ArrayList<Wheats> wheatsList = new ArrayList<Wheats> () ;
		wheatsList.addAll(inventoryDetail.getWheats()) ;
		
		for( int i = 0 ; i< riceList.size(); i++) 
		{
			System.out.println((i+1)+") Rice Name - " + inventoryDetail.getRice().get(i).getName()+"\n"+"Rice Price - " + inventoryDetail.getRice().get(i).getPrice()+"\n"+"Rice Weight - " + inventoryDetail.getRice().get(i).getWeight());
			System.out.println("total values - " + inventoryDetail.getRice().get(i).getPrice()*inventoryDetail.getRice().get(0).getWeight()) ;
			System.out.println() ;
		}
		
		for( int j =0 ; j < wheatsList.size() ; j++) 
		{
			System.out.println((j+1)+") wheats Name - " + inventoryDetail.getWheats().get(j).getName()+"\n"+"wheats Price - " + inventoryDetail.getWheats().get(j).getPrice()+"\n"+"wheats Weight - " + inventoryDetail.getWheats().get(j).getWeight()) ;	
			
			System.out.println("total values - " + inventoryDetail.getWheats().get(j).getPrice()*inventoryDetail.getWheats().get(0).getWeight()) ;
			System.out.println() ;
			
		}
		
		for( int k = 0 ; k < pulsesList.size(); k++) 
		{
			System.out.println((k+1)+") Pulse Name - " + inventoryDetail.getPulses().get(k).getName()+"\n"+"Pulse Price - " + inventoryDetail.getPulses().get(k).getPrice()+"\n"+"Pulses Weight - " + inventoryDetail.getPulses().get(k).getWeight()) ;
			System.out.println("Total Values - " + inventoryDetail.getPulses().get(k).getPrice()*inventoryDetail.getPulses().get(0).getWeight()) ;
			System.out.println();
		}
		
		
		mapper.writeValue(new File(jsonFileLocationOut),inventoryDetail) ;
	}

}

