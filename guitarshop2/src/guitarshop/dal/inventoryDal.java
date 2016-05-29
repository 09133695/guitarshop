package guitarshop.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.Out;

import guitarshop.obdc;
import guitarshop.entity.guitar;
import guitarshop.entity.guitarspec;
import guitarshop.entity.inventory;

public class inventoryDal {

	public static inventory inventory() // 获取所有吉他加载到inventory内
	{
		inventory inventory = new inventory();
		// List<guitar> guitars = new ArrayList<guitar>();
		Connection connection = obdc.getConnection();
		PreparedStatement pstat;
		ResultSet rs;
		try {
			pstat = connection.prepareStatement("select * from guitar");
			rs = pstat.executeQuery();
			while (rs.next()) {
				guitarspec guitarspec = new guitarspec(null, null, null, null, null);
				guitarspec.setBuilder(rs.getString("builder"));
				guitarspec.setTopWood(rs.getString("topwood"));
				guitarspec.setBackWood(rs.getString("backwood"));
				guitarspec.setType(rs.getString("type"));
				guitarspec.setModel(rs.getString("model"));

				inventory.addguitar(rs.getString("serialNumber"), rs.getDouble("price"), guitarspec);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return inventory;
	}
}
