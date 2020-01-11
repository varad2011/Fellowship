package com.bridgelabz.programs.ObjectOrientedProgram.cliniqueManagement;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.programs.utility.Util;

public class ClinicqueMethods 
{	
	Clinique clinique = new Clinique() ;
	Doctors doctor = new Doctors() ;
	Patients patient = new Patients() ;
	Appointment appointment = new Appointment() ;
 	ObjectMapper mapper = new ObjectMapper() ;
	
	LinkedList<Doctors> doctorList = new LinkedList<Doctors>() ;
	LinkedList<Patients> patientList = new LinkedList<Patients>() ;
	LinkedList<Appointment> appointmentList = new LinkedList<Appointment>() ;
	
	public void addDoctor(String location) throws JsonParseException, JsonMappingException, IOException 
	{	
	//	ObjectMapper mapper = new ObjectMapper() ;
	//	Clinique clinique = new Clinique() ;
		
		clinique = mapper.readValue(new File(location),Clinique.class) ;
	
		doctorList.addAll(clinique.getDoctors()) ;
		
		System.out.println("enter Dr Name") ;
		String name = Util.Scanner() ;
		doctor.setName(name) ;
		
		System.out.println("enter Specalization") ;
		String specialization = Util.Scanner() ;
		doctor.setSpecialization(specialization) ;
		
		System.out.println("enter avalialble time") ;
		String  time = Util.Scanner() ;
		doctor.setAvailability(time) ;
		
		doctorList.add(doctor) ;
		clinique.setDoctors(doctorList);
		mapper.writeValue(new File(location),clinique) ;
		System.out.println("new dr. is successfully added to list ");
	}
	public void readOnlyDoctorFile( String location) throws JsonParseException, JsonMappingException, IOException 
	{
		clinique = mapper.readValue(new File(location),Clinique.class) ;
		doctorList.addAll(clinique.getDoctors()) ;
		for(int i = 0 ; i< doctorList.size() ; i ++) 
		{
		 System.out.println("dr. Name = "+doctorList.get(i).getName()+"\n specialization = "+doctorList.get(i).getSpecialization()+" time = "+doctorList.get(i).getAvailability());	
		}
	}
	public void addPatient(String location ) throws JsonGenerationException, JsonMappingException, IOException 
	{
		System.out.println("enter Patient Name") ;
		String name = Util.Scanner() ;
		patient.setName(name);
		
		System.out.println("enter ID") ;
		int id = Util.scanner();
		patient.setId(id);
		
		System.out.println("enter MobileNumber") ;
		int mobileNumber = Util.scanner(); 
		patient.setMobileNumber(mobileNumber);
		
		System.out.println("enter Age");
		int age = Util.scanner();
		patient.setAge(age);
		
		patientList.add(patient);
		
		clinique.setPatients(patientList);
		mapper.writeValue(new File(location) , clinique) ;
		System.out.println("new patient is successfully added to list ");
	}
	
	public void readOnlyPatientFile(String location) throws JsonParseException, JsonMappingException, IOException 
	{
		clinique = mapper.readValue(new File(location), Clinique.class) ;
		patientList.addAll(clinique.getPatients()) ;
		
		for(int i = 0 ; i < patientList.size() ; i++ ) 
		{
			System.out.println("Patient Name = "+patientList.get(i).getName() +"\n Patient Id = "+patientList.get(i).getId() +" Patient MobileNumber = "+ patientList.get(i).getMobileNumber() +" Patient Age = "+ patientList.get(i).getAge());
		}
		System.out.println("patient list successfully  display");
	}
	public void searchByNameDr (String name , String location) throws JsonParseException, JsonMappingException, IOException 
	{
		clinique = mapper.readValue(new File(location),Clinique.class) ;
		doctorList.addAll(clinique.getDoctors()) ;
		
		for(int i = 0 ; i< doctorList.size() ; i ++) 
		{
			if(name.equalsIgnoreCase(doctorList.get(i).getName()))
					{
					
				System.out.println("Dr.info is present in list \n");
				System.out.println("dr. Name = "+doctorList.get(i).getName()+"\n specialization = "+doctorList.get(i).getSpecialization()+" time = "+doctorList.get(i).getAvailability());
					
					}
		}
	}
	
	public boolean slotBook(String name , String location ) throws JsonParseException, JsonMappingException, IOException 
	{
		boolean flag = false ;
		clinique = mapper.readValue(new File(location),Clinique.class) ;
		
		doctorList.addAll(clinique.getDoctors()) ;
		
		for(int i = 0 ; i< doctorList.size() ; i ++) 
		{
			if(name.equalsIgnoreCase(doctorList.get(i).getName()))
					{
						if(doctorList.get(i).getNumberOfslot() < 5) 
						{
							int number = doctorList.get(i).getNumberOfslot() + 1 ;
							doctorList.get(i).setNumberOfslot(number);
							mapper.writeValue(new File(location) , clinique) ;
							System.out.println("slot is available ") ;
							return true ;
						}
						else 
						{
							System.out.println("no slot is available") ;
							return false ;
						}
			
					}
			
		}
		return flag ;
	}
	public void searchByNamePatient ( String name , String location) throws JsonParseException, JsonMappingException, IOException 
	{

		clinique = mapper.readValue(new File(location), Clinique.class) ;
		patientList.addAll(clinique.getPatients()) ;
		
		for(int i = 0 ; i < patientList.size() ; i++ ) 
		{
			if(name.equalsIgnoreCase(patientList.get(i).getName())) 
			{
				System.out.println("Patient Name = "+patientList.get(i).getName() +"\n Patient Id = "+patientList.get(i).getId() +" Patient MobileNumber = "+ patientList.get(i).getMobileNumber() +" Patient Age = "+ patientList.get(i).getAge());
			}
			
		}
	}
	public void bookAppointment(String location ,String drfileLocation) throws JsonGenerationException, JsonMappingException, IOException 
	{ 
		ClinicqueMethods method = new ClinicqueMethods() ;
		clinique = mapper.readValue(new File(location), Clinique.class) ;
		appointmentList.addAll(clinique.getAppointment()) ;
	
		System.out.println("enter Patient name ") ;
		String patientName = Util.Scanner() ;
		appointment.setPatientName(patientName) ;
		
		System.out.println("enter dr name ") ;
		String doctorName = Util.Scanner() ;
		
		boolean condition = method.slotBook(doctorName, drfileLocation ) ;
		
		if(condition == true) 
		{
			appointment.setDoctorName(doctorName) ;
			
			System.out.println("enter date ") ;
			String date = Util.Scanner() ;
			appointment.setDate(date) ;
			
			System.out.println("enter slot") ;
			int slot = Util.scanner() ;
			appointment.setSlotNumber(slot) ;
			appointmentList.add(appointment) ;
			clinique.setAppointment(appointmentList) ;
			mapper.writeValue(new File(location ), clinique) ;
			System.out.println("appointment is successfully done ");
		
		}
		
		
		
	}
	
	public void readAppointment ( String  location) throws JsonParseException, JsonMappingException, IOException 
	{
		clinique = mapper.readValue(new File(location), Clinique.class) ;
		
		appointmentList.addAll(clinique.getAppointment()) ;
		
		for( int i = 0 ; i < appointmentList.size() ; i++) 
		{
			System.out.println("\n patient name = "+appointmentList.get(i).getPatientName()+ "\n Dr. name = " + appointmentList.get(i).getDoctorName() + "\n date= " + appointmentList.get(i).getDate() + "\n slot= "+appointmentList.get(i).getSlotNumber());
		}
		System.out.println("appointment list display successfully");
	}
	
}
