package com.bridgelabz.programs.designPattern.singletonPattern;

public class LazyInisialization {

		private static LazyInisialization instance ;
		private LazyInisialization() {
			
		}
		public static LazyInisialization getInstance() {
			if(instance == null) {
				instance = new LazyInisialization();
			}
			return instance;
		}
		public void displayLazy() {
			System.out.println("lazy is display");
		}
}
