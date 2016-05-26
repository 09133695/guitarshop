package guitarshop.bll;

import java.sql.SQLException;
import java.util.List;

import guitarshop.dal.inventoryDal;
import guitarshop.entity.guitar;
import guitarshop.entity.guitarspec;

public class inventoryBll {
	public static List<guitar> allGuitars()//添加类别
	{
		return inventoryDal.allGuitars();
	}
	public static List<guitar> match(guitarspec spec) throws SQLException//添加类别
	{
		return inventoryDal.match(spec);
	}
}
