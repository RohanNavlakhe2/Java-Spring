package com.example.jpa_and_hibernate.citizen.spring_data_jpa;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Citizen {

	@Id
	private long aadharNo;
	private String name;
	private String panNo;
	
	public Citizen() {}

	@Override
	public String toString() {
		return "Citizen [aadharNo=" + aadharNo + ", name=" + name + ", panNo=" + panNo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(aadharNo, name, panNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Citizen other = (Citizen) obj;
		return aadharNo == other.aadharNo && Objects.equals(name, other.name) && Objects.equals(panNo, other.panNo);
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public Citizen(long aadharNo, String name, String panNo) {
		super();
		this.aadharNo = aadharNo;
		this.name = name;
		this.panNo = panNo;
	}

}
