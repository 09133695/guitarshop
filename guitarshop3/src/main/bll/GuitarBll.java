package main.bll;

import main.dal.GuitarDal;
import main.entity.Inventory;

public class GuitarBll {
	public static Inventory inventory()//初始化inventory 获取所有吉他加载到inventory内
	{
		return GuitarDal.inventory();
	}
}
