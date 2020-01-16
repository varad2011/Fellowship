package com.bridgelabz.programs.ObjectOrientedProgram.addressBook;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.programs.utility.Util;

public class AddressBookRun {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
	{
		
		AddressBookMethods  addressBookMethod = new AddressBookMethods();
		String locationOfFile = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/addressBook/addressBook.json" ;
		String directory = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/addressBook/";
		System.out.println("Welcome to address Book sir!\n");
		System.out.println("What do you want to do?\n1.create a new addressbook\n2.open existing  addressbook");
		int userInput = Util.scanner() ;
		
		switch(userInput) 
		{
		case 1:
			System.out.println("enter name of addressBook") ;
			String fileName = Util.Scanner() ;
			String fileNamewithJson = fileName + ".json" ;  
			boolean fileFindFlag = addressBookMethod.findFileWithFileName(fileNamewithJson, new File(directory)) ;
			
			if(fileFindFlag == true ) 
			{
				System.out.println("file is found \nDo u want to edit this addressBook \nOr to create new addressBook ");
				userInput = Util.scanner() ;
				switch(userInput) 
				{
				///edit this addressBook
				case 1 : 
					System.out.println("do u want to add new entry into that addressBook\n Or edit the addressBook old data ");
					userInput = Util.scanner() ;
					switch(userInput) 
					{
					///add new entry into that addressBook
					case 1 :
						addressBookMethod.AddNewEntryToAddressBook(locationOfFile);
						break;
						///edit the addressBook old data
					case 2 :
						addressBookMethod.editOldEntry(locationOfFile);
						break;
					}
					///create new addressBook
				case 2 :
					System.out.println("enter new name of file ");
					String newFileName = Util.Scanner() ;
					addressBookMethod.newFileCreate(directory, newFileName);
					break ;
					
				}
			}
			else 
			{
				System.out.println("file is not found ");
				
					System.out.println("enter new name of file ");
					String newFileName = Util.Scanner() ;
					addressBookMethod.newFileCreate(directory, newFileName);
				
			}
			break ;
			
			///open an addressbook
		case 2 :
			System.out.println("enter name of file of Addressbook");
			 fileName = Util.Scanner() ;
			 fileNamewithJson = fileName + ".json" ;  
			 fileFindFlag = addressBookMethod.findFileWithFileName(fileNamewithJson, new File(directory)) ;
			 if(fileFindFlag == true ) 
				{
				 System.out.println("File found");
				 System.out.println("Do u want to open all entry  \n only selected entry ");
				 userInput = Util.scanner() ;
					switch(userInput) 
					{
					case 1:
						addressBookMethod.displayAddressBook(locationOfFile);
						
					case 2:
						System.out.println("1) enter name of person available in address book \n2) ");
					
					}
				}
		}
		
	}

}
