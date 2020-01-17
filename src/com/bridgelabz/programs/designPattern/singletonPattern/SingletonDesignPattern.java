package com.bridgelabz.programs.designPattern.singletonPattern;

public class SingletonDesignPattern {

	public static void main(String[] args) {
	///eager Singleton Pattern
		Eager eagerInstance = Eager.getEagerInstance();
		eagerInstance.displayEager();
	/// lazy singleton Pattern
		LazyInisialization  lazy = LazyInisialization.getInstance();
		lazy.displayLazy();
	/// static block inisialization 
		StaticBlockInisialization staticBlock = StaticBlockInisialization.getInstance();
		staticBlock.display();
	/// thread safe singleton design pattern	
		ThreadSafeSingleton threadSafe = ThreadSafeSingleton.getInstance();
		threadSafe.display();
	/// bill pugh singleton design pattern
		BillPughSingleton billPugh = BillPughSingleton.getInstance();
		billPugh.display();
	/// serialization Design patter	
		SerializationSingleton serializationPattern = SerializationSingleton.getInstance();
		serializationPattern.display();
	}

}
