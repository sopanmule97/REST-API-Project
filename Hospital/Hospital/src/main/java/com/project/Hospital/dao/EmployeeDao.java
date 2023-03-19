package com.project.Hospital.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.Hospital.Entity.Doctor;
import com.project.Hospital.Entity.Employee;
import com.project.Hospital.Entity.Patient;


@Repository
public class EmployeeDao {
	@Autowired
	SessionFactory factory;

	public List<Employee> getEmpData() {
		Session session= factory.openSession();
		Criteria criteria= session.createCriteria(Employee.class);
		return criteria.list();
	}

	public String inserEmpData(List<Employee> al) {
		Session session= factory.openSession();
		Transaction tr= session.beginTransaction();
	
		for (Employee emp : al) {
			Serializable g= session.save(emp);
			System.out.println(g);
			}
		tr.commit();
		return "inerted data";
	}

	public Employee updateEmpData(Employee e) {
		Session session= factory.openSession();
		Transaction tr= session.beginTransaction();
		Employee ee= session.get(Employee.class, e.getId());
		
		ee.setName(e.getName());
		session.update(ee);
		
		tr.commit();
		return ee;
	}

	public Employee getDataById(int a) {
		Session session= factory.openSession();
		Criteria criteria= session.createCriteria(Employee.class);
		Employee ee= session.get(Employee.class, a);
		return ee;
	}

	public Employee updateEmpsalary(Employee e) {
		Session session= factory.openSession();
		Transaction tr= session.beginTransaction();
		Employee ee= session.get(Employee.class, e.getId());
		ee.setSalary(e.getSalary());
		session.update(ee);
		tr.commit();
		
		return ee;
	}

	public Employee delete(int a) {
		Session session= factory.openSession();
		Employee ee= session.get(Employee.class, a);
		session.delete(ee);
		return ee;
	}

	public List<Employee> getDatastart(String s) {
		Session session= factory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("name","s"));
		return criteria.list();
	}

	public List<Employee> getmorethanId(int s) {
		Session session= factory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.gt("id", s));
		
		return criteria.list();
	}

	public List<Employee> getlessthanId(int s) {
		Session session= factory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.lt("id", s));
		
		return criteria.list();
	}

	public List<Employee> getlessthansalry(String s) {
		Session session= factory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.lt("salary", s));
		
		return criteria.list();
	}

	public List<Employee> getmorethansalry(String s) {
		Session session= factory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.gt("salary", s));
		
		return criteria.list();
	}

	public List<Employee> getendWithname(String s) {
		Session session= factory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.like("name", "s",MatchMode.END));
		System.out.println(criteria.list());
		return criteria.list();
	}

	public List<Employee> getdataNOId(int a) {
		Session session= factory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.ne("id", a));
		return criteria.list();
	}

	public List<Employee> orderlist() {
		Session session= factory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.addOrder(Order.asc("salary"));
		return criteria.list();
	}
	
	public List<Employee> mt2andstr() {
		Session session= factory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.and(Restrictions.gt("id", 2),Restrictions.like("name", "s%")));
		return criteria.list();
	}

	public List<Employee> orderdsc() {
		Session session= factory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.addOrder(Order.desc("salary"));
		return criteria.list();
	}

	public List<Employee> ifnull(String s) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.isNotNull("name"));
		return criteria.list();
	}

	public List<Employee> ifnotempty() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.isNotEmpty("salary"));
		return criteria.list();
	}

	public List<Employee> bet(List<Integer> al) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.between("id", al.get(0), al.get(1)));
		return criteria.list();
	}

	public List<Employee> namecon(String s) {
		s="%"+s+"%";
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.like("salary","s"));
		return criteria.list();
	}

	public List<Doctor> getDoctorData() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Doctor.class);
		
		return criteria.list();
	}

	public String insertdoctor(List<Doctor> al) {
		Session sess=factory.openSession();
		Transaction transaction=sess.beginTransaction();
		for (Doctor d : al) {
			sess.save(d);
		}
		transaction.commit();
		return "data insertted";
	}

	public Doctor updatedoctor(Doctor al) {
		Session sess=factory.openSession();
		Transaction transaction=sess.beginTransaction();
		Doctor d1=sess.get(Doctor.class, al.getmNo());
		d1.setName(al.getName());
		sess.update(d1);
		transaction.commit();
		return d1;
	}

	public List<Doctor> ddepartment(String s) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Doctor.class);
		criteria.add(Restrictions.eq("dept", s));
		return criteria.list();
	}
	public List<Doctor> dblood(String s) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Doctor.class);
		criteria.add(Restrictions.eq("bloodG", s));
		return criteria.list();
	}

	public List<Patient> getPaienenteData() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Patient.class);
		return criteria.list();
	}

	public Patient insertpatient(Patient al) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(al);
		transaction.commit();
		return al;
	}

	public List<Patient> getPaienentebyname(String nav) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Patient.class);
		criteria.add(Restrictions.eqOrIsNull("name", nav));
		return criteria.list();
	}

	public List<Patient> getPaienentebydoc(String nav) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Patient.class);
		criteria.add(Restrictions.eqOrIsNull("doctor", nav));
		return criteria.list();
	}
	
}
