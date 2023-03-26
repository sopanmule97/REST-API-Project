package amazon.product.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import amazon.product.Dao.ProductDao;
import amazon.product.Entity.Product;
import amazon.product.Entity.Tax;
import amazon.product.Entity.billsave;
import amazon.product.Entity.charges;
import amazon.product.Entity.finallBill;

@Service
public class prodctService {
	@Autowired
	ProductDao dao;
	public List productAlldata() {
		return dao.getProductall();
	}
	
	public boolean productAllId(int a) {
		List<Product> li= dao.getProductall();
		for (Product p : li) {
			if(a==p.getID()) {
				return true;
			}
		}
		return false;
	}
	
	public Product m1(int a) {
		return dao.getProduct(a);
	}
	public Tax m2(String cat) {
		return dao.getTax(cat);
	}
	
	public finallBill finalresult(int a) {
		Product p1= m1(a);//final 1
		 
//		double a= p1.getPrice();
//		Double b= t1.getDiscount();
		Tax t1= m2(p1.getCategory());
		
		Double disco= (p1.getPrice()*t1.getDiscount())/100;//final 2
		
		double ga1=p1.getPrice()-disco; //final 3
		Double gst11=(ga1*t1.getGST())/100; // charge 1
		charges c= new charges();
		c.setGst(gst11);
		c.setDelivery(t1.getDeliveryCharge());
		
		double final34=((p1.getPrice()+gst11+t1.getDeliveryCharge())-disco);//final 4
		
		finallBill f= new finallBill();
		f.setID(p1.getID());
		f.setName(p1.getName());
		f.setType(p1.getType());
		f.setCategory(p1.getCategory());
		f.setPrice(p1.getPrice());
		f.setDiscount(disco);
		f.setChargesdata(c);
		f.setFinalPrice(final34);
		bils(f);
		System.out.println(f);
		return f;
	}
	

	private void bils(finallBill f) {
		billsave bill=new billsave();
		bill.setID(f.getID());
		bill.setName(f.getName());
		bill.setType(f.getType());
		bill.setCategory(f.getCategory());
		bill.setPrice(f.getPrice());
		bill.setDiscount(f.getDiscount());
		bill.setGst(f.getChargesdata().getGst());
		bill.setDelivery(f.getChargesdata().getDelivery());
		bill.setFinalPrice(f.getFinalPrice());
		dao.save(bill);
	}

	public void insertdataProduct(List<Product> p) {
		 dao.insertdataProduct(p);
	}

	public void deleteProduct(int a) {
		dao.deleteProduct(a);
	}
}
