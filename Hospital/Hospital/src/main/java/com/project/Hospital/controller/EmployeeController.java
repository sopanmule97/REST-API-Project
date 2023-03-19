package com.project.Hospital.controller;

import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.Hospital.Entity.Doctor;
import com.project.Hospital.Entity.Employee;
import com.project.Hospital.Entity.Patient;
import com.project.Hospital.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	//1
	@GetMapping("empall")
	public List<Employee> getEmpData() {
		return service.getEmpData();
	}
	
	//2
	@PostMapping("empin")
	public String inserEmpData(@RequestBody List<Employee> al) {
	String	s=service.inserEmpData(al);
		
		return s ;
	}
	
	//3 check
	@GetMapping("empstart/{s}")
	public List<Employee> getDatastart(@PathVariable String s) {
		System.out.println(s+"in empstart");
		return service.getDatastart(s);
	}
	
	  //4
	  @GetMapping("empId/{a}")
	  public Employee getDataById(@PathVariable int a) {
	  return service.getDataById(a); 
	  }
	  
	  //5
	  @GetMapping("/empId") 
	  public Employee getDataId(@RequestBody int a) { return
	  service.getDataById(a); 
	  } 
	  
	  //6 check
	  @PutMapping("empupdate/salary")
	  public Employee updateEmpsalary(@RequestBody Employee e) 
	  { Employee ee= service.updateEmpsalary(e);
	  return ee; 
	  }
	  
	  //7 error
	  @PutMapping("empupdate/name") 
	  public Employee updateEmpData(@RequestBody Employee e)
	  { Employee ee= service.updateEmpData(e);
	  
	  return ee;
	  
	  } //8
	  
	  @DeleteMapping("empdelete/{a}") 
	  public String delete(@PathVariable int a)
	  {
	  return service.delete(a) ; 
	  } 
	  //9
	  
	  @DeleteMapping("/empdelete") 
	  public String deleteemp(@RequestBody int a) {
	  return service.delete(a) ; 
	  } //10
	  
	  @GetMapping("/Idmore/{s}")
	  public List<Employee> getmorethanId(@PathVariable int s) {
		  return service.getmorethanId(s);
	  } //11
	  
	  @GetMapping("/Idless/{s}") public List<Employee> getlessthanId(@PathVariable int s) {
		  return service.getlessthanId(s); 
	  } 
	  
	  //12
	  @GetMapping("/salarymore/{s}")
	  public List<Employee> getlessthansalry(@PathVariable String s) { 
		  return service.getlessthansalry(s);
	  }
	  
	  //13 
	  @GetMapping("/salaryless/{s}") 
	  public List<Employee> getmorethansalry(@PathVariable String s) {
		  return service.getmorethansalry(s); 
	  }
	 
	  //14 
	  @GetMapping("/nameend/{s}")
	  public List<Employee> getendWithname(@PathVariable String s) { 
		  System.out.println("yes");
		  System.out.println(s);
		  return service.getendWithname(s); 
	  } 
	  
	  //15
	  @GetMapping("/notId/{a}") 
	  public List<Employee> getdataNOId(@PathVariable int  a) {
		  return service.getdataNOId(a); 
	  }
	  
	 //16
	  @GetMapping("/salaryasc")
	  public  List<Employee> orderasc() {
		  List<Employee> e1=service.orderlist();
		 return e1;
	  }
	  
	//17
	  @GetMapping("/salarydsc")
	  public  List<Employee> orderdsc() {
		  List<Employee> e1=service.orderdsc();
		 return e1;
	  }
	  
	//17  
	  @GetMapping("/Notnull")
	  public  List<Employee> ifnull(@RequestBody String s) {
		  List<Employee> e1=service.ifnull(s);
		 return e1;
	  }
	  //18
	  @GetMapping("/isname/{s}")
	  public List<Employee> namecon(@PathVariable String s) {
		  return service.namecon(s);
	  }
	//19
	  @GetMapping("/Notempty")
	  public  List<Employee> ifnotempty() {
		  List<Employee> e1=service.ifnotempty();
		 return e1;
	  }
	 
	//20
	  @GetMapping("/bet")
	  public  List<Employee> bet(@RequestBody List<Integer> al) {
		  
		  List<Employee> e1=service.bet(al);
		 return e1;
	  }
	//21
	  @GetMapping("/doctorall")
	  public List<Doctor> getDoctorData() {
			return service.getDoctorData();
		}
	  //22
	  @PostMapping("/doctorin")
	  public String insertdoctor(@RequestBody List<Doctor> al) {
		  String msg=service.insertdoctor(al);
		  return msg;
	  }
	  //23
	  @PutMapping("/update/dname")
	  public Doctor updatedoctor(@RequestBody Doctor al) {
		  return service.updatedoctor(al);
	  }
	//24
	  @GetMapping("/doctordept")
	  public List<Doctor> ddepartment(@RequestBody String s) {
		  return service.ddepartment(s);
	  }
	  //25
	  @GetMapping("/dblood")
	  public List<Doctor> dblood(@RequestBody String s) {
		  return service.dblood(s);
	  }
	  //26
	  @GetMapping("/pall")
	  public List<Patient> getPaienenteData() {
			return service.getPaienenteData();
		}
	  //27
	  @PostMapping("pin")
	  public String insertpatient(@RequestBody Patient al) {
		  Patient s= service.insertpatient(al);
		  return s+" is added";
	  }
	  //28
	  @GetMapping("/pname")
	  public List<Patient> getPaienentebyname(@RequestBody String nav) {
		  
			return service.getPaienentebyname(nav);
		}
	//29
	  @GetMapping("/pdoct")
	  public List<Patient> getPaienentebydoc(@RequestBody String nav) {
		  
			return service.getPaienentebydoc(nav);
		}
	  //30
	  @GetMapping("/pbill")
	  public int getPaienentbill(@RequestBody String nav) {
			return service.getPaienentbill(nav);
		}
}
