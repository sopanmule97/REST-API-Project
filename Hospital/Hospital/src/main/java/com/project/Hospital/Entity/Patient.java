package com.project.Hospital.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
		@Id
		int Id;
		String name;
		int bedNo;
		String disease;
		String doctor;
		int bill;
		public int getBill() {
			return bill;
		}
		public void setBill(int bill) {
			this.bill = bill;
		}
		
		@Override
		public String toString() {
			return "Patient [Id=" + Id + ", name=" + name + ", bedNo=" + bedNo + ", disease=" + disease + ", doctor="
					+ doctor + ", bill=" + bill + "]";
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getBedNo() {
			return bedNo;
		}
		public void setBedNo(int bedNo) {
			this.bedNo = bedNo;
		}
		public String getDisease() {
			return disease;
		}
		public void setDisease(String disease) {
			this.disease = disease;
		}
		public String getDoctor() {
			return doctor;
		}
		public void setDoctor(String doctor) {
			this.doctor = doctor;
		}
		
}
