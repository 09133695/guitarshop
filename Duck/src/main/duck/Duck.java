package main.duck;

import main.property.IFly;
import main.property.IQuack;

public abstract  class Duck {
	public static IQuack IQuack;
	public static IFly IFly;

	public static void swim() {
	}

	public static void display() {

	}
	public static void performQuack() {
		IQuack.quack();
	}
	public static void performFly() {
		IFly.fly();
	}
	public void setIQuack(IQuack quiack) {
	      this.IQuack = quiack;
	   }
	public void setIFly(IFly fly) {
	      this.IFly = fly;
	   }

	
}
