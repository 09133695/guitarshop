package guitarshop.bll;

import java.sql.SQLException;
import java.util.List;

import guitarshop.dal.inventoryDal;
import guitarshop.entity.guitar;
import guitarshop.entity.guitarspec;
import guitarshop.entity.inventory;

public class inventoryBll {
	public static inventory inventory()//初始化inventory 获取所有吉他加载到inventory内
	{
		return inventoryDal.inventory();
	}

}
