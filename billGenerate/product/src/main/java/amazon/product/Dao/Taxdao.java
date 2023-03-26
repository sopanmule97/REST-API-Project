package amazon.product.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import amazon.product.Entity.Tax;

@Repository
public class Taxdao {
	@Autowired
	SessionFactory sf;

	public void inserttaxes(List<Tax> t) {
		Session session= sf.openSession();
		Transaction transaction= session.beginTransaction();
		for (Tax t1 : t) {
			session.saveOrUpdate(t1);
		}
		transaction.commit();
	}

	public void deletechrges(String c) {
		Session session= sf.openSession();
		Transaction transaction= session.beginTransaction();
		Tax t1 = session.get(Tax.class, c);
		session.delete(t1);
		transaction.commit();
	}

	public List fetch() {
		Session session = sf.openSession();
		Criteria criteria=session.createCriteria(Tax.class);
		List list = criteria.list();
		session.close();
		return list;
	}

	
	
	

}
