package main.ducks;

import main.duck.Duck;
import main.property.FlyWithRocket;
import main.property.MuteQuack;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
	      IQuack = new MuteQuack();
	      IFly = new FlyWithRocket();
	   }
}
