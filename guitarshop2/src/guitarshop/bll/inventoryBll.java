package guitarshop.bll;

import java.sql.SQLException;
import java.util.List;

import guitarshop.dal.inventoryDal;
import guitarshop.entity.guitar;
import guitarshop.entity.guitarspec;
import guitarshop.entity.inventory;

public class inventoryBll {
	public static inventory inventory()//��ʼ��inventory ��ȡ���м������ص�inventory��
	{
		return inventoryDal.inventory();
	}

}
