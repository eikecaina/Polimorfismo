package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProducts extends Product{
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;

	public UsedProducts(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return getName() 
				+ " (USED) $" 
				+ String.format("%.2f", getPrice())
				+ "(Manufacture date: "
				+ sdf.format(manufactureDate)
				+ ")";
	}
}
