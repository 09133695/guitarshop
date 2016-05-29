package guitarshop;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import guitarshop.bll.inventoryBll;
import guitarshop.entity.guitar;

public class test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		List<guitar> guitars = new ArrayList<guitar>();
		guitars = inventoryBll.allGuitars();
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
