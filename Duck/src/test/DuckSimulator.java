package test;

import main.duck.Duck;
import main.ducks.MallardDuck;
import main.property.Squeak;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
	      mallard.performQuack();
	      mallard.performFly();
	      mallard.setIQuack(new Squeak());
	      mallard.performQuack();
	   }
	}



