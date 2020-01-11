package com.bridgelabz.programs.ObjectOrientedProgram.addressBook;


import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.programs.utility.Util;

public class AddressBookMain 
{
	
	public void openFile(String nameOfAddressBook, String directory) 
	{
		File file = new File (directory + nameOfAddressBook ) ;
		
	}

	
	public void displayAddressBook(String fileName ,String location) throws JsonParseException, JsonMappingException, IOException 
	{
		ObjectMapper mapper = new ObjectMapper() ;
		Person person = new Person () ;
		person = mapper.readValue(new File(location+fileName), Person.class) ;
		
		LinkedList<Person> personList = new LinkedList<Person>() ;
		personList.addAll(personList) ;
		
		LinkedList<Address> addresslist = new LinkedList<Address>() ;
		addresslist.addAll(addresslist);
		Address address = new Address() ;
		System.out.println("Person First Name = "+ person.getName()+ "\nPerson Last Name = " +person.getLastName() );
		
		System.out.println("Address "+"\ncity = "+person.getAddress().get(0).getCity()+"\nState = "+person.getAddress().get(0).getState()+"\nzipCode = "+person.getAddress().get(0).getZipCode());
	}
	
	public void newEntry ( String nameOfFile ) throws JsonGenerationException, JsonMappingException, IOException 
	{
		ObjectMapper mapper = new ObjectMapper() ;
		Person person = new Person () ;
		 
		LinkedList<Person> personList = new LinkedList<Person>() ;
		//personList.addAll(personList) ;
		System.out.println("\n1 to  save file with name of user \n2. with new Name ");
		int caseNumber = Util.scanner() ;
		
		switch(caseNumber) 
		{
		case 1 :
			person.setName(nameOfFile);
			break ;
		case 2 :
			System.out.println(" enter name of user");
			String name = Util.Scanner() ;
			person.setName(name) ;
			break ;
		}
		person.setName(nameOfFile);
		System.out.println("lastName");
		String lastName = Util.Scanner() ;
		person.setLastName(lastName) ;
		
		LinkedList< Address > addressList = new LinkedList< Address > () ;
		Address address = new Address() ;
		System.out.println("city") ;
		String city = Util.Scanner() ;	
		address.setCity(city) ;
		System.out.println("state") ;
		String state = Util.Scanner() ;
		address.setState(state) ;
		System.out.println("zipcode") ;
		int zipCode = Util.scanner() ;
		address.setZipCode(zipCode) ;
		addressList.add(address) ;
		person.setAddress(addressList) ;
	 
		personList.add(person) ;
		mapper.writeValue(new File("/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/addressBook/"+nameOfFile+".json"), person);
		 
	}
	public  void mapperMethod ( String locationOfFile , String nameOfFile ) throws JsonGenerationException, JsonMappingException, IOException 
	{
		ObjectMapper mapper = new ObjectMapper() ;
		Person person = new Person () ;
		 
		LinkedList<Person> personList = new LinkedList<Person>() ;
		personList.addAll(personList) ;
		
		//System.out.println("name");
	//	String name = Util.Scanner() ;
		person.setName(nameOfFile);
		System.out.println("lastName");
		String lastName = Util.Scanner() ;
		person.setLastName(lastName) ;
		
		LinkedList< Address > addressList = new LinkedList< Address > () ;
			Address address = new Address() ;
			System.out.println("city") ;
			String city = Util.Scanner() ;	
			address.setCity(city) ;
			System.out.println("state") ;
			String state = Util.Scanner() ;
			address.setState(state) ;
			System.out.println("zipcode") ;
			int zipCode = Util.scanner() ;
			address.setZipCode(zipCode) ;
			addressList.add(address) ;
		 person.setAddress(addressList) ;
		 
		personList.add(person) ;
		mapper.writeValue(new File(locationOfFile),person) ;
	}
	
	public static void addNewLocation( String location ) 
	{
		ObjectMapper mapper = new ObjectMapper() ;
		Person person = new Person () ;
		LinkedList<Person> personList = new LinkedList<Person>() ;
		
		
	}
	
	 public	 boolean findFile(String name,File file)
	    { 	boolean flag = false ;
	        File[] list = file.listFiles();
	        if(list!=null)
	        for (File fil : list)
	        {
	            if (fil.isDirectory())
	            {
	                findFile(name,fil);
	            }
	            else if (name.equalsIgnoreCase(fil.getName()))
	            {
	            	System.out.println(fil.getParentFile());
	                System.out.println(" file is present ");
	                flag = true;
	                break ;
	            }
	        }
	       return flag ;
	    }
	 
	 
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException
	{ 
		AddressBookMain addressbook = new AddressBookMain();
		String locationOfFile = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/addressBook/addressBook.json" ;
		String directory = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/addressBook/";
		System.out.println("Welcome to address Book sir!\n");
		System.out.println("What do you want to do?\n1.create a new addressbook\n2.open an addressbook");
		int userInput = Util.scanner() ;
		
		switch(userInput) 
		{
		
		case 1 : 
			
			System.out.println("please enter the name of person ");
			String nameOfFile = Util.Scanner();
			
			String jsonFileName = nameOfFile+".json" ;
			boolean fileCheckFlag =  addressbook.findFile(jsonFileName , new File(directory) ) ;
			
			if(fileCheckFlag == false ) 
			{
				addressbook.newEntry( nameOfFile);
				break ;
			}
			
			else 
			
			{
				System.out.println("addressBook is already present\n.create new entry ");  
				int userEntry = Util.scanner() ;
				
				switch(userEntry) 
				
				{
				
				case 1 :
					
					addressbook.newEntry( nameOfFile);
					break ;
					
				}
				break ;
			}
		
		case 2:
			
			System.out.println("please enter name of addressBook which u want to open ");
			String nameOfAddressBook = Util.Scanner()+".json" ;
			boolean checkAddressBookflag =  addressbook.findFile(nameOfAddressBook , new File(directory) ) ;
			
			
			if(checkAddressBookflag == true ) 
			
			{
				addressbook.displayAddressBook(nameOfAddressBook, directory);
				
				
			}
		}
	}

}
