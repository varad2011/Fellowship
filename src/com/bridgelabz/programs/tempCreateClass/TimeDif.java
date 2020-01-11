package com.bridgelabz.programs.tempCreateClass;

public class TimeDif {

	int count=0;
	long timeDifference=0;
	long temp=0;
	 public void click() 
	 {
		 long clickTime=System.currentTimeMillis();
		 if(count==0) 
		 {
			 temp=clickTime;
			 count++;
			 click();
		 }
		 if(count==1) {
			 timeDifference=clickTime-temp;
			 if(timeDifference<1000) 
			 {
				 System.out.println("hello");
				 click();
			 }else 
			 {
				 count=0;
				 timeDifference=0;
				 temp=0;
				click();
			 }
		 }
		
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeDif dif=new TimeDif();
		dif.click();
	}

}
