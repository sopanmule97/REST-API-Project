package amazon.product.Dao;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import amazon.product.Entity.Product;
import amazon.product.Entity.Tax;
import amazon.product.Entity.billsave;
import amazon.product.Entity.finallBill;
import amazon.product.Service.prodctService;


@Repository
public class ProductDao {
	
	@Autowired
	SessionFactory sf;
	public List getProductall() {
		Session ss= sf.openSession();
		Criteria criteria= ss.createCriteria(Product.class);
		 List list = criteria.list();
		 return list;
	}

	public Product getProduct(int a) {
		Session ss= sf.openSession();
	    Product p=ss.get(Product.class, a);
	    System.out.println(12);
	    System.out.println(p);
		return p;
	}
	
	public Tax getTax(String cat) {
		Session ss= sf.openSession();
		Tax p=ss.get(Tax.class, cat );
	    System.out.println(12);
	    System.out.println(p);
		return p;
	}

	public void insertdataProduct(List<Product> p) {
		Session session= sf.openSession();
		Transaction transaction= session.beginTransaction();
		for (Product p1 : p) {
			session.saveOrUpdate(p1);
		}
		transaction.commit();
		session.close();
	}

	public void deleteProduct(int a) {
		Session session= sf.openSession();
		Transaction transaction= session.beginTransaction();
		Product p1 = session.get(Product.class, a);
		session.delete(p1);
		transaction.commit();
		session.close();
	}

	public void save(billsave bill) {
		Session session=sf.openSession();
		Transaction transaction= session.beginTransaction();
		session.save(bill);
		transaction.commit();
		session.close();
	}


}
