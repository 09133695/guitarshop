package main.ducks;
import static main.duck.Duck.IFly;
import static main.duck.Duck.IQuack;
import main.duck.Duck;
import main.property.FlyNoWay;
import main.property.Quack;
public class MallardDuck extends Duck {
	public MallardDuck() {
	      IQuack = new Quack();
	      IFly = new FlyNoWay();
	   }
}
