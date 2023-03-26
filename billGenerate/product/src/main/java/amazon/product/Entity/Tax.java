package amazon.product.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tax {
	
	@Id
	String Category;
	double Discount;
	double GST;
	double DeliveryCharge;
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public double getDiscount() {
		return Discount;
	}
	public void setDiscount(double discount) {
		Discount = discount;
	}
	public double getGST() {
		return GST;
	}
	public void setGST(double gST) {
		GST = gST;
	}
	public double getDeliveryCharge() {
		return DeliveryCharge;
	}
	public void setDeliveryCharge(double deliveryCharge) {
		DeliveryCharge = deliveryCharge;
	}
}
