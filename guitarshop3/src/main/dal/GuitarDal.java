package main.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import main.entity.Guitar;
import main.entity.GuitarSpec;
import main.entity.Inventory;

public class GuitarDal {

	static Inventory inventory = new Inventory();
	static Connection connection = SqlFactory.getConnection();
	static PreparedStatement pstat;
	static ResultSet rs;
	static GuitarSpec guitarspec;

	public static Inventory inventory() // 获取所有吉他加载到inventory内
	{
		try {
			pstat = connection.prepareStatement("select * from guitar");
			rs = pstat.executeQuery();
			while (rs.next()) {
				guitarspec = new GuitarSpec(null, null, null, null, null);
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

	public static void addGuitar(String serialNumber, double price,GuitarSpec spec) {
		try {
			pstat = connection.prepareStatement("insert into guitar(serialNumber,price,builder,model,type,backWood,topWood) values(?,?,?,?,?,?,?)");
			pstat.setString(1, serialNumber);
			pstat.setDouble(2, price);
			pstat.setString(3, spec.getBuilder());
			pstat.setString(4, spec.getModel());
			pstat.setString(5, spec.getType());
			pstat.setString(6, spec.getBackWood());
			pstat.setString(7, spec.getTopWood());
			System.out.println(pstat.executeUpdate());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void delateGuitar(String serialNumber) {
		try {
			pstat = connection.prepareStatement("delete from guitar where serialNumber=?");
			pstat.setString(1, serialNumber);
			System.out.println(pstat.executeUpdate());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
