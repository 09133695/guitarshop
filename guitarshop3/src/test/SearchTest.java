package test;

import java.util.LinkedList;
import java.util.List;

import main.bll.GuitarBll;
import main.entity.GuitarSpec;

public class SearchTest {
	 public static void main(String[] args) {
		 GuitarSpec spec = new GuitarSpec("builder1", "model1", "type1", "backwood1","topwood1");
			// 新建一个guitar List 用来存储匹配到的guitars
			List matchingGuitars = new LinkedList();

			matchingGuitars = GuitarBll.inventory().search(spec);

			System.out.println(matchingGuitars);
	 }
}
