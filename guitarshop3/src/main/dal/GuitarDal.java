package main.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import main.entity.Guitar;
import main.entity.GuitarSpec;
import main.entity.Inventory;


public class GuitarDal {
	public static Inventory inventory() // 获取所有吉他加载到inventory内
	{
		Inventory inventory = new Inventory();
		Connection connection = SqlFactory.getConnection();
		PreparedStatement pstat;
		ResultSet rs;
		try {
			pstat = connection.prepareStatement("select * from guitar");
			rs = pstat.executeQuery();
			while (rs.next()) {
				GuitarSpec guitarspec = new GuitarSpec(null, null, null, null, null);
				guitarspec.setBuilder(rs.getString("builder"));
				guitarspec.setTopWood(rs.getString("topwood"));
				guitarspec.setBackWood(rs.getString("backwood"));
				guitarspec.setType(rs.getString("type"));
				guitarspec.setModel(rs.getString("model"));
				inventory.addGuitar(rs.getString("serialNumber"), rs.getDouble("price"), guitarspec);
				System.out.println(rs.getString("serialNumber"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return inventory;
	}
}
