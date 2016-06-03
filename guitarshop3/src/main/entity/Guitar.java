package main.entity;

import main.dal.GuitarDal;

public class Guitar {

	  private String serialNumber;
	  private double price;
	  GuitarSpec spec;

	  public Guitar(String serialNumber, double price, GuitarSpec spec) {
	    this.serialNumber = serialNumber;
	    this.price = price;
	    this.spec = spec;
	  }
	  public static void addGuitar(String serialNumber, double price,GuitarSpec guitarspec)
	  {
		  GuitarDal.addGuitar(serialNumber, price, guitarspec);
	  }
	  public static void delateGuitar(String serialNumber)
	  {
		  GuitarDal.delateGuitar(serialNumber);
	  }
	  public String getSerialNumber() {
	    return serialNumber;
	  }

	  public double getPrice() {
	    return price;
	  }

	  public void setPrice(float newPrice) {
	    this.price = newPrice;
	  }

	  public GuitarSpec getSpec() {
	    return spec;
	  }
	}
