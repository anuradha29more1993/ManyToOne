package com.velocity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

		@Id
		
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String firstaname;
		private String lastname;
		private int addressId;
		
		@ManyToOne
		@JoinColumn(name="addressId" ,insertable = false, updatable = false)
		private Address address;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstaname() {
			return firstaname;
		}

		public void setFirstaname(String firstaname) {
			this.firstaname = firstaname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public int getAddressId() {
			return addressId;
		}

		public void setAddressId(int addressId) {
			this.addressId = addressId;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", firstaname=" + firstaname + ", lastname=" + lastname 
					+ ", addressId=" + addressId + ", address=" + address + "]";
		}
		
		
		
}
