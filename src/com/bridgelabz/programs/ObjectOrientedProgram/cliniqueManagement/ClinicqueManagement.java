package com.bridgelabz.programs.ObjectOrientedProgram.cliniqueManagement;

import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import com.bridgelabz.programs.utility.Util;

public class ClinicqueManagement 
{
	public  void clinicRun ( String doctorfileLocation,String patientFielLocation ,String appointmentFileLocation) throws JsonParseException, JsonMappingException, IOException 
	{
		ClinicqueMethods methods = new ClinicqueMethods() ;
		
		System.out.println("welcome  to jj Hosptial ... \nPress 1 to create new entry  of Dr., patient and book appointment \nPress 2 to read list of Patient,Dr, and Appointment ") ;
		int userInput = Util.scanner() ;
		
		switch(userInput) 
		{
			case 1 :
				System.out.println("press 1 to add Dr, \npress 2 to add Patient \npress 3 to book appointment ") ;
				userInput = Util.scanner() ;
				
				switch (userInput) 
				{
				 case 1 :
					methods.addDoctor(doctorfileLocation) ;
					break;
				 case 2 :
					methods.addPatient(patientFielLocation) ;
					break ;
				 case 3 :
					 methods.bookAppointment(appointmentFileLocation ,doctorfileLocation ) ;
					 break ;
				}
				break ;	
			
			case 2 :
				System.out.println("press 1 to view list of Dr \n press 2 to view List of Patient \n press 3 to view appointment ") ;
				userInput = Util.scanner();
				
				switch(userInput) 
				{
				case 1 :
					methods.readOnlyDoctorFile(doctorfileLocation) ;
					break ;
				case 2 :
					methods.readOnlyPatientFile(patientFielLocation) ;
					break ;
				case 3 :
					methods.readAppointment(appointmentFileLocation) ;
					break ;
				}
				break ;	
		}
		
		System.out.println("\nPress 1 to continue \nPress 2 to logout from system") ;
		int number = Util.scanner();
		if(number == 1) 
		{
			clinicRun(doctorfileLocation, patientFielLocation, appointmentFileLocation) ;
		}
		System.out.println("logout successfully ");
	}
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
	{
		String doctorfileLocation = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/cliniqueManagement/jsonFiles/Doctor.json" ;
		String patientFielLocation = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/cliniqueManagement/jsonFiles/Patients.json" ; 
		String appointmentFileLocation = "/home/bridgeit/eclipse-workspace/FellowshipVarad/src/com/bridgelabz/programs/ObjectOrientedProgram/cliniqueManagement/jsonFiles/Appointment.json" ;
		
		ClinicqueManagement management = new ClinicqueManagement() ;
		management.clinicRun(doctorfileLocation, patientFielLocation, appointmentFileLocation) ;

	}

}
