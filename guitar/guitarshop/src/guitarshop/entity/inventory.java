package guitarshop.entity;

import java.util.List;

public class inventory {
	private static List<guitar> guitars;
	public static List<guitar> getguitars() {
		return guitars;
	}
	public void setguitars(List<guitar> guitars) {
		this.guitars = guitars;
	}
}
