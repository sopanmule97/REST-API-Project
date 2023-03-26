package amazon.product.Entity;

public class finallBill {
	
	int ID;
	String Name;
	String Type;
	String Category;
	double Price;
	double Discount;
	charges chargesdata;
	double finalPrice;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public charges getChargesdata() {
		return chargesdata;
	}
	public void setChargesdata(charges chargesdata) {
		this.chargesdata = chargesdata;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	
	public double getDiscount() {
		return Discount;
	}
	public void setDiscount(double discount) {
		Discount = discount;
	}
	@Override
	public String toString() {
		return "finallBill [ID=" + ID + ", Name=" + Name + ", Type=" + Type + ", Category=" + Category + ", Price="
				+ Price + ", Discount=" + Discount + ", chargesdata=" + chargesdata + ", finalPrice=" + finalPrice
				+ "]";
	}
	
}
