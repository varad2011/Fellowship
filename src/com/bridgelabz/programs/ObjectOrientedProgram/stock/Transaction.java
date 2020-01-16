package com.bridgelabz.programs.ObjectOrientedProgram.stock;

public class Transaction 
{
	private String  userName ;
	private String CompanyNme ;
	private  int sellComanpnyShar ;
	private int buySharByUser ;
	private String date ;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCompanyNme() {
		return CompanyNme;
	}
	public void setCompanyNme(String companyNme) {
		CompanyNme = companyNme;
	}
	public int getSellComanpnyShar() {
		return sellComanpnyShar;
	}
	public void setSellComanpnyShar(int sellComanpnyShar) {
		this.sellComanpnyShar = sellComanpnyShar;
	}
	public int getBuySharByUser() {
		return buySharByUser;
	}
	public void setBuySharByUser(int buySharByUser) {
		this.buySharByUser = buySharByUser;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
