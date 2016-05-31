package test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.oracle.webservices.internal.api.databinding.Databinding.Builder;
import com.sun.glass.ui.CommonDialogs.Type;

import main.bll.GuitarBll;
import main.dal.GuitarDal;
import main.entity.Guitar;
import main.entity.GuitarSpec;
import main.entity.Inventory;

public class FindGuitarTester {

	public static void main(String[] args) {
		// Set up Rick's guitar inventory
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec whatErinLikes = new GuitarSpec("FENDER", "Stratocastor", "ELECTRIC", "ALDER", "ALDER");
		List matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println("  We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType()
						+ " guitar:\n     " + spec.getBackWood() + " back and sides,\n     " + spec.getTopWood()
						+ " top.\n  You can have it for only $" + guitar.getPrice() + "!\n  ----");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("11277", 3999.95, new GuitarSpec("COLLINGS", "CJ", "ACOUSTIC", "INDIAN_ROSEWOOD", "SITKA"));
		inventory.addGuitar("V95693", 1499.95, new GuitarSpec("FENDER", "Stratocastor", "ELECTRIC", "ALDER", "ALDER"));
		inventory.addGuitar("V9512", 1549.95, new GuitarSpec("FENDER", "Stratocastor", "ELECTRIC", "ALDER", "ALDER"));
		inventory.addGuitar("122784", 5495.95, new GuitarSpec("MARTIN", "D-18", "ACOUSTIC", "MAHOGANY", "ADIRONDACK"));

	}

}
