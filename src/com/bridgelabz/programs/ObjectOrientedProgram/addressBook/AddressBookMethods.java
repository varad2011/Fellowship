package com.bridgelabz.programs.ObjectOrientedProgram.addressBook;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.programs.utility.Util;



public class AddressBookMethods 
{
	ObjectMapper mapper = new ObjectMapper() ;
	PersonDetails personDetail = new PersonDetails();
	Person person = new Person();
	Address address = new Address() ;
	LinkedList<Person> personList = new LinkedList<Person>();
	
	
	
	public void displayAddressBook (String location) throws JsonParseException, JsonMappingException, IOException 
	{
		AddressBookMethods  addressbook = new AddressBookMethods();
		personDetail = mapper.readValue(new File(location), PersonDetails.class) ;
		personList.addAll(personDetail.getPerson()) ;
		System.out.println("List of user address Available inside file");
		for(int i = 0 ; i < personList.size() ; i++ ) 
		{
			System.out.println(i+") Person name : "+personList.get(i).getName() +" lastName : "+ personList.get(i).getLastName() +"\ncity : "+ personList.get(i).getAddress().getCity() +" state : "+personList.get(i).getAddress().getState() +" zipCode : "+ personList.get(i).getAddress().getZipCode());
			System.out.println();
		}
	}
	
	/// edit file information
	public void editFileInformation( String location ) throws JsonParseException, JsonMappingException, IOException 
	{
		personDetail = mapper.readValue(new File(location), PersonDetails.class) ;
		personList.addAll(personDetail.getPerson()) ;
		System.out.println("enter index of data  ") ;
		int index = Util.scanner(); 
		System.out.println("which data u want to edit  \n1.name \n2.lastName \n3.city \n4.state \n5.zipcode");
		int entry = Util.scanner() ;
		switch (entry) 
		{
		case 1:
			System.out.println("enter Name ");
			String name = Util.Scanner();
			personList.get(index).setName(name) ;
			break;
		case 2:
			System.out.println("enter LastName ");
			String Lastname = Util.Scanner();
			personList.get(index).setLastName(Lastname) ;
			break;
		case 3:
			System.out.println("enter city ");
			String city = Util.Scanner();
			personList.get(index).getAddress().setCity(city);
			break;
		case 4:
			System.out.println("enter state");
			String state = Util.Scanner();
			personList.get(index).getAddress().setState(state);
			break;
		case 5:	
			System.out.println("enter zipCode ");
			int zipCode = Util.scanner();
			personList.get(index).getAddress().setZipCode(zipCode);
			break;
		}
	
		mapper.writeValue(new File(location), personDetail);
			
	}
	/// edit old entry 
	public void editOldEntry(String location ) throws JsonParseException, JsonMappingException, IOException 
	{
		AddressBookMethods  addressbook = new AddressBookMethods();
		personDetail = mapper.readValue(new File(location), PersonDetails.class);
		personList.addAll(personDetail.getPerson()) ;
		System.out.println("List of user address Available inside file");
		for(int i = 0 ; i < personList.size() ; i++ ) 
		{
			System.out.println(i+") Person name : "+personList.get(i).getName()+" lastName : "+ personList.get(i).getLastName() +"\ncity : "+ personList.get(i).getAddress().getCity() +" state : "+personList.get(i).getAddress().getState() +" zipCode : "+ personList.get(i).getAddress().getZipCode());
			System.out.println();
		}

		
		addressbook.editFileInformation(location) ;
		
		
	}
	
	/// new file create method
	public void newFileCreate( String directory ,String newFileName) throws JsonGenerationException, JsonMappingException, IOException 
	{
		String storeLocation = directory +newFileName + ".json" ;
		System.out.println("enter userName ");
		String nameOfPerson = Util.Scanner();
		person.setName(nameOfPerson);
		System.out.println("lastName");
		String lastName = Util.Scanner() ;
		person.setLastName(lastName) ;
		
		System.out.println("city") ;
		String city = Util.Scanner() ;	
		address.setCity(city);
		System.out.println("state") ;
		String state = Util.Scanner() ;
		address.setState(state) ;
		System.out.println("zipcode") ;
		int zipCode = Util.scanner() ;
		address.setZipCode(zipCode) ;
		
	
		person.setAddress(address);
		personList.add(person) ;
		personDetail.setPerson(personList);
		mapper.writeValue(new File(storeLocation), personDetail);
		
	}
	///add new entry to addrss book
	public void AddNewEntryToAddressBook (String location ) throws JsonParseException, JsonMappingException, IOException
	{
		
		personDetail = mapper.readValue(new File(location), PersonDetails.class) ;
		personList.addAll(personDetail.getPerson()) ;
		System.out.println("enter userName ");
		String nameOfPerson = Util.Scanner();
		person.setName(nameOfPerson);
		System.out.println("lastName");
		String lastName = Util.Scanner() ;
		person.setLastName(lastName) ;
		
		System.out.println("city") ;
		String city = Util.Scanner() ;	
		address.setCity(city);
		System.out.println("state") ;
		String state = Util.Scanner() ;
		address.setState(state) ;
		System.out.println("zipcode") ;
		int zipCode = Util.scanner() ;
		address.setZipCode(zipCode) ;
		
		person.setAddress(address);
		personList.add(person) ;
		personDetail.setPerson(personList);
		mapper.writeValue(new File(location), personDetail);
		
	}
	
	///To check File is available  or not method 
	
	public	 boolean findFileWithFileName(String name,File file)
    { 	boolean flag = false ;
        File[] list = file.listFiles();
        if(list!=null)
        for (File fil : list)
        {
            if (fil.isDirectory())
            {
            	findFileWithFileName(name,fil);
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
}
