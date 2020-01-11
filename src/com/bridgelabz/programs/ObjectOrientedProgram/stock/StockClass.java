package com.bridgelabz.programs.ObjectOrientedProgram.stock;

public class StockClass 
{
	String stockName ;
	int numberOfShare ;
	int sharePrice ;
	int totalValue ;
	
	public String getStockName() 
	{
		return stockName;
	}
	public void setStockName(String stockName) 
	{
		this.stockName = stockName;
	}
	public int getNumberOfShare() 
	{
		return numberOfShare;
	}
	public void setNumberOfShare(int numberOfShare) 
	{
		this.numberOfShare = numberOfShare;
	}
	public int getSharePrice() 
	{
		return sharePrice;
	}
	public void setSharePrice(int sharePrice) 
	{
		this.sharePrice = sharePrice;
	}
	public int getTotalValue() 
	{
		return totalValue;
	}
	public void setTotalValue(int totalValue) 
	{
		this.totalValue = totalValue;
	}
	public StockClass() {
		super();
		
	}
	public StockClass(String stockName, int numberOfShare, int sharePrice, int totalValue) {
		super();
		this.stockName = stockName;
		this.numberOfShare = numberOfShare;
		this.sharePrice = sharePrice;
		this.totalValue = totalValue;
	}
	
	
	
}
