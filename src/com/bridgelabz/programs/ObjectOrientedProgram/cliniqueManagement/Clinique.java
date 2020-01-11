package com.bridgelabz.programs.ObjectOrientedProgram.cliniqueManagement;

import java.util.List;

public class Clinique 
{
	private List<Patients> patients ;
	private List<Doctors> doctors ;
	private List<Appointment> appointment ;
	
	public List<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}

	public List<Patients> getPatients() {
		return patients;
	}
	
	public void setPatients(List<Patients> patients) {
		this.patients = patients;
	}
	
	public List<Doctors> getDoctors() {
		return doctors;
	}
	
	public void setDoctors(List<Doctors> doctors) {
		this.doctors = doctors;
	}
	
	
}
