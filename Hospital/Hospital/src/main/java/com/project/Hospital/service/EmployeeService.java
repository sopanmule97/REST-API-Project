package com.project.Hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Hospital.Entity.Doctor;
import com.project.Hospital.Entity.Employee;
import com.project.Hospital.Entity.Patient;
import com.project.Hospital.dao.EmployeeDao;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao dao;

	public List<Employee> getEmpData() {
		
		return dao.getEmpData();
	}

	public String inserEmpData(List<Employee> al) {
		String s=dao.inserEmpData(al);
		return s;
	}

	public Employee updateEmpData(Employee e) {
		Employee ee=dao.updateEmpData(e);
		return ee;
	}

	public Employee getDataById(int a) {
		
		return dao.getDataById(a);
	}

	public Employee updateEmpsalary(Employee e) {
		return dao.updateEmpsalary(e);
	}

	public String delete(int a) {
		String s=dao.delete(a)+"is deleted";
		return s;
	}

	public List<Employee> getDatastart(String s) {
		s=s+"%";
		return dao.getDatastart(s);
	}

	public List<Employee> getmorethanId(int s) {
		return dao.getmorethanId(s);
	}

	public List<Employee> getlessthanId(int s) {
		
		return dao.getlessthanId(s);
	}

	public List<Employee> getlessthansalry(String s) {
		
		return dao.getlessthansalry(s);
	}

	public List<Employee> getmorethansalry(String s) {
		
		return dao.getmorethansalry(s);
	}

	public List<Employee> getendWithname(String s) {
		return dao.getendWithname(s);
	}

	public List<Employee> getdataNOId(int a) {
		
		return dao.getdataNOId(a);
	}

	public List<Employee> orderlist() {
		return dao.orderlist();
	}
	public void mt2andstr() {
		 dao.mt2andstr();
	}

	public List<Employee> orderdsc() {
		
		return dao.orderdsc();
	}

	public List<Employee> ifnull(String s) {
		
		return dao.ifnull(s);
	}

	public List<Employee> ifnotempty() {
		return dao.ifnotempty();
	}

	public List<Employee> bet(List<Integer> al) {
		
		return dao.bet(al);
	}

	public List<Employee> namecon(String s) {
		
		return dao.namecon(s);
	}

	public List<Doctor> getDoctorData() {
		
		return dao.getDoctorData();
	}

	public String insertdoctor(List<Doctor> al) {
		
		return dao.insertdoctor(al);
	}

	public Doctor updatedoctor(Doctor al) {
	
		return dao.updatedoctor(al);
	}

	public List<Doctor> ddepartment(String s) {
		return dao.ddepartment(s);
	}

	public List<Doctor> dblood(String s) {
		return dao.dblood(s);
	}

	public List<Patient> getPaienenteData() {
		
		return dao.getPaienenteData();
	}

	public Patient insertpatient(Patient al) {
		
		return dao.insertpatient(al);
	}

	public List<Patient> getPaienentebyname(String nav) {
		
		return dao.getPaienentebyname(nav);
	}

	public List<Patient> getPaienentebydoc(String nav) {
		
		return dao.getPaienentebydoc(nav);
	}

	public int getPaienentbill(String nav) {
		List<Patient> p= getPaienentebyname(nav);
		Patient p1 = null;
		for (Patient patient : p) {
			 p1=patient;
		}
		int a=p1.getBill();
		
		return a;
	}

	

	
	
	
}
