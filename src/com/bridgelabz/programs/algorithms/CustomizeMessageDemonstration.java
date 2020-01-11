package com.bridgelabz.programs.algorithms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class CustomizeMessageDemonstration 
{ 
	public static String dateCapture() 
	{
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern( "dd/MM/yyyy" ) ;
		LocalDate date = LocalDate.now() ;
		String capturedDate = dateFormat.format( date ) ;
		return capturedDate ;
	}
	public static void replaceStringShort(  )  //using \\b regEx 
	{	Scanner scanner = new Scanner( System.in ) ;
		String story = " We have your full name as <<full name>> in our system. " ;
		String replaceString = "\\b<<name\\b" ;
		String replaceWord = scanner.nextLine() ;
		String newReplaceString = story.replaceAll( replaceString , replaceWord ) ;
		String replaceString1 = "\\b<<full name>>\\b" ;
		String replaceFullName = scanner.nextLine() ;
		String newReplaceString1 = newReplaceString.replaceAll( replaceString1, replaceFullName ) ;
		System.out.println(newReplaceString) ;
	
	}
	public static String replaceString ( String message , String word )  // using pattern match regEx 
	{	
		Scanner scanner = new Scanner( System.in ) ;
		Pattern pattern = Pattern.compile( word ) ;
		Matcher patternMatch = pattern.matcher( message ) ;
		System.out.println( "enter user " + word  ) ;
		String replaceWord = scanner.nextLine() ;
		message =patternMatch.replaceAll(replaceWord) ;
		return message ;
	}
	public static void StringPrint( String message ) 
	{
		Scanner scanner = new Scanner( System.in ) ;
		System.out.println(message) ;
		String name = "<<name>>" ;
		String fullName="<<full name>>" ;
		String mobileNumber= "xxxxxxxxxx" ;
		String date = "01/01/2016" ;
		Pattern patternName = Pattern.compile( name ) ;
		Matcher matchUserName = patternName.matcher( message ) ;
		String userName = scanner.nextLine() ;
		message = matchUserName.replaceAll(userName) ;
		Pattern patternFullName = Pattern.compile( fullName ) ;
		Matcher matchFullName = patternFullName.matcher( message ) ;
		String userFullName = scanner.nextLine() ;
		message = matchFullName.replaceAll( userFullName ) ;
		Pattern patternMobileNumber = Pattern.compile( mobileNumber ) ;
		Matcher matchMobileNumber = patternMobileNumber.matcher( message ) ;
		String userMobileNumber = scanner.nextLine() ;	
		message = matchMobileNumber.replaceAll(  userMobileNumber ) ;
		Pattern patternDate = Pattern.compile( date ) ;
		Matcher matchDate = patternDate.matcher( message ) ;
		String userDate = scanner.nextLine() ;
		message = matchDate.replaceAll( userDate ) ;
		
		System.out.println(message);
		
		
		
		
	}

	public static void main ( String arg[] ) 
	{
		
		String message = " Hello <<name>>," + "\n" + "We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016." ;
		String name = "<<name>>" , fullName="<<full name>>"  ,  mobileNumber= "xxxxxxxxxx"  , date = "01/01/2016" ;
		
		String usernamechange = CustomizeMessageDemonstration.replaceString( message , name ) ;
		String userNameFullChnage = CustomizeMessageDemonstration.replaceString( usernamechange , fullName ) ;
		String userMobileNumberChnage = CustomizeMessageDemonstration.replaceString( userNameFullChnage , mobileNumber ) ;
		Pattern DatePattern = Pattern.compile( date ) ;
		Matcher patternMatch = DatePattern.matcher( userMobileNumberChnage ) ;
		String newMessageToPrint = patternMatch.replaceAll( CustomizeMessageDemonstration.dateCapture() ) ;
		
		System.out.println( newMessageToPrint ) ;
		
	}
		
}
