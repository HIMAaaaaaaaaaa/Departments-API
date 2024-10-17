package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//import javax.persistence.Table;

//import org.springframework.boot.autoconfigure.domain.EntityScan;

//@jakarta.persistence.Entity
//@EntityScan
//@Entity
//@Table(name = "DEPARTMENTS")
//@Document(collection = "DEPARTMENTS")
//@EntityScan(basePackages = "com.example.demo.entity")
@Entity
@Table(name = "DEPARTMENTS")
public class DepartmentsEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private static final long serialVersionUID = -2435172566430050531L;
	private long Id;
	private int DEPARTMENTID;
	private String DEPARTMENTNAME;
	private int MANAGERID;
	private int LOCATIONID;

	public int getDEPARTMENTID() {
		return DEPARTMENTID;
	}

	public void setDEPARTMENTID(int dEPARTMENTID) {
		DEPARTMENTID = dEPARTMENTID;
	}

	public String getDEPARTMENTNAME() {
		return DEPARTMENTNAME;
	}

	public void setDEPARTMENTNAME(String dEPARTMENTNAME) {
		DEPARTMENTNAME = dEPARTMENTNAME;
	}

	public int getMANAGERID() {
		return MANAGERID;
	}

	public void setMANAGERID(int mANAGERID) {
		MANAGERID = mANAGERID;
	}

	public int getLOCATIONID() {
		return LOCATIONID;
	}

	public void setLOCATIONID(int lOCATIONID) {
		LOCATIONID = lOCATIONID;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
