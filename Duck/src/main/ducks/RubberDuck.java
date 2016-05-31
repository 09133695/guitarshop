package main.ducks;

import main.duck.Duck;
import main.property.FlyWithWings;
import main.property.Squeak;

public class RubberDuck extends Duck {
	public RubberDuck() {
	      IQuack = new Squeak();
	      IFly = new FlyWithWings();
	   }
}
