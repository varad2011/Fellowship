package com.bridgelabz.programs.ObjectOrientedProgram.stock;

import java.util.List;

public class StockController 
{
	private List<StockClass> stock ;
	private List<UserList> userList ;
	
	public List<UserList> getUserList() {
		return userList;
	}

	public void setUserList(List<UserList> userList) {
		this.userList = userList;
	}

	public List<StockClass> getStock() {
		return stock;
	}

	public void setStock(List<StockClass> stock) {
		this.stock = stock;
	}
	
}
