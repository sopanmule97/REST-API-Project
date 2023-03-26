package amazon.product.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;


public class charges {
	
	double gst;
	double delivery;
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getDelivery() {
		return delivery;
	}
	public void setDelivery(double delivery) {
		this.delivery = delivery;
	}
	
	
}
