package guitarshop.entity;

public class guitarspec {

	static String builder;
	static String model;
	static String type;
	static String backWood;
	static String topWood;

	public guitarspec(String builder, String model, String type, String backWood, String topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public boolean matches(guitarspec otherSpec) {
		if (builder != otherSpec.builder)
			return false;
		if ((model != otherSpec.model))
			return false;
		if (type != otherSpec.type)
			return false;
		if (backWood != otherSpec.backWood)
			return false;
		if (topWood != otherSpec.topWood)
			return false;
		return true;
	}

	public static String getBuilder() {
		return builder;
	}

	public void setBuilder(String builder) {
		this.builder = builder;
	}

	public static String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public static String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static String getBackWood() {
		return backWood;
	}

	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}

	public static String getTopWood() {
		return topWood;
	}

	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}

}
