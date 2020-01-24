package com.bridgelabz.programs.Test;

 class Consume implements Runnable{
	NumberGenerate numberGenerator;
	public Consume(NumberGenerate numberGenerator) {
		this.numberGenerator = numberGenerator;
		Thread thread = new Thread(this ,"consume");
		thread.start();
	}
	@Override
	public void run() {
		while(true) {
			numberGenerator.getNumber();
		
			try {
				Thread.sleep(1000);
			}catch(Exception e){
				
			}
		}
	}
	
}
 class Produce implements Runnable {
	NumberGenerate numberGenrate ;
	
	public Produce(NumberGenerate numberGenrate){
		this.numberGenrate = numberGenrate;
		Thread thread = new Thread(this, "producer");
		thread.start();	
	}
	@Override
	public void run() {
		int i = 0;
		while(true) {
			numberGenrate.setNumber(i++);
			
			try {
				Thread.sleep(1000);
			}catch(Exception e){
				
			}
		}
	}
	
}
 class NumberGenerate{
	int number;
	boolean checkFlag = false;
	
	public synchronized void getNumber() {
		while(!checkFlag) {
			try {
				wait();
			}catch(Exception e) {		
			}
		}
		System.out.println("consume "+number);
		checkFlag = false;
		notify();
	}

	public  synchronized void setNumber(int number) {
		
		while(checkFlag) {
			try {
				wait();
			}catch(Exception e) {		
			}
		}
		System.out.println("Produce "+number);
		this.number = number;
		checkFlag = true;
		notify();
	}
	
}
public class ProduceAndConsumerProgram {

	
	public static void main(String[] args) {
		NumberGenerate numberGenerate = new NumberGenerate();
		new Produce(numberGenerate);
		new Consume(numberGenerate);
	}
	

}
