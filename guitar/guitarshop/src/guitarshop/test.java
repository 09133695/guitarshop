package guitarshop;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import guitarshop.dal.inventoryDal;
import guitarshop.entity.guitar;

public class test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		List<guitar> guitars = new ArrayList<guitar>();
		guitars = inventoryDal.allGuitars();
		// for(Iterator i=guitars.iterator();i.hasNext();)
		// {
		// guitar guitar=(guitar)i.next();
		// System.out.println(guitar.getPrice());
		// }

		// for ( int i =0;i<guitars.size();i++){
		// System.out.println(guitars.get(i));
		// }
		int i = 1;
		for (guitar guitar : guitars) {
			System.out.print(i++);
			System.out.print("____");
			System.out.println(guitar.getSerialNumber());
			System.out.println(guitar.getBackWood());
			System.out.println(guitar.getPrice());
			System.out.println(guitar.getBuilder());
			System.out.println(guitar.getModel());
			System.out.println(guitar.getTopWood());
			System.out.println(guitar.getType());
		}
	}
}
