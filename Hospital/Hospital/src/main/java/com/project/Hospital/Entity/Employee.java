package com.project.Hospital.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
		@Id
		int id;
		String name;
		String salary;
		public Employee() {}
		
		public Employee(int id, String salary) {
			super();
			this.id = id;
			this.name=salary;
			this.salary = salary;
		}
		
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		
		
		
}
