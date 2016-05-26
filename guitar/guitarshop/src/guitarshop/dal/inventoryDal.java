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
import guitarshop.entity.guitarType;
import guitarshop.entity.guitarspec;

public class inventoryDal {

	public static List<guitar> allGuitars() // 获取所有吉他
	{
		List<guitar> guitars = new ArrayList<guitar>();
		Connection connection = obdc.getConnection();
		PreparedStatement pstat;
		ResultSet rs;
		try {
			pstat = connection.prepareStatement("select * from guitar");
			rs = pstat.executeQuery();
			while (rs.next()) {
				guitar guitar = new guitar();
				guitar.setSerialNumber(rs.getString("serialNumber"));
				guitar.setPrice(rs.getDouble("price"));
				guitar.setBuilder(rs.getString("builder"));
				guitar.setTopWood(rs.getString("topwood"));
				guitar.setBackWood(rs.getString("backwood"));
				guitar.setType(rs.getString("type"));
				guitar.setModel(rs.getString("model"));
				guitars.add(guitar);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return guitars;
	}

	public static List<guitar> match(guitarspec spec) throws SQLException // 查找吉他
	{
		List matchingGuitars = new LinkedList();
		for (Iterator i = allGuitars().iterator(); i.hasNext();) {
			guitar guitar = (guitar) i.next();
			if (spec.getBuilder().equals(guitar.getBuilder())) {
				matchingGuitars.add(guitar);
				continue;
			}
			if (spec.getModel().equals(guitar.getModel())) {
				matchingGuitars.add(guitar);
				continue;
			}
			if (spec.getTopWood().equals(guitar.getTopWood())) {
				matchingGuitars.add(guitar);
				continue;
			}
			if (spec.getType().equals(guitar.getType())) {
				matchingGuitars.add(guitar);
				continue;
			}
			if (spec.getBackWood().equals(guitar.getBackWood())) {
				matchingGuitars.add(guitar);
				continue;
			}
		}
		return matchingGuitars;
	}
//
//	public static boolean addGuitar(String serialNumber, double price, String builder, String mobile, String type,
//			String backWood, String topWood)
//	// 添加吉他
//	{
//		int i = 0;
//		Connection connection = obdc.getConnection();
//		PreparedStatement pstat;
//		try {
//			pstat = connection.prepareStatement(
//					"insert into guitar(serialNumber,price,builder,mobile,type,backWood,topWood) values(?,?,?,?,?,?,?)");
//			pstat.setString(1, serialNumber);
//			pstat.setDouble(2, price);
//			pstat.setString(3, builder);
//			pstat.setString(4, mobile);
//			pstat.setString(5, type);
//			pstat.setString(6, backWood);
//			pstat.setString(7, topWood);
//			i = pstat.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return i > 0;
//	}

}
