package test;

import java.util.LinkedList;
import java.util.List;

import main.bll.GuitarBll;
import main.entity.GuitarSpec;

public class SearchTest {
	 public static void main(String[] args) {
		 GuitarSpec spec = new GuitarSpec("builder1", "model1", "type1", "backwood1","topwood1");
			// �½�һ��guitar List �����洢ƥ�䵽��guitars
			List matchingGuitars = new LinkedList();

			matchingGuitars = GuitarBll.inventory().search(spec);

			System.out.println(matchingGuitars);
	 }
}
