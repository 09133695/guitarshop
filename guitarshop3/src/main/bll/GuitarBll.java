package main.bll;

import main.dal.GuitarDal;
import main.entity.Inventory;

public class GuitarBll {
	public static Inventory inventory()//��ʼ��inventory ��ȡ���м������ص�inventory��
	{
		return GuitarDal.inventory();
	}
}
