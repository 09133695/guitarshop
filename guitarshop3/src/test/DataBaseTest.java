package test;

import main.dal.GuitarDal;
import main.dal.SqlFactory;

public class DataBaseTest {
	 public static void main(String[] args) {
		 SqlFactory.createConnection("sqllite");//��������
		 GuitarDal.inventory();
	 }
}
