package guitarshop.entity;

public class guitar {
	String serialNumber;
	double price;
	guitarspec spec;

	 public guitar(String serialNumber, double price, guitarspec spec) {
		    this.serialNumber = serialNumber;
		    this.price = price;
		    this.spec = spec;
		  }
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public guitarspec getSpec() {
		return spec;
	}

	public void setSpec(guitarspec spec) {
		this.spec = spec;
	}

}
