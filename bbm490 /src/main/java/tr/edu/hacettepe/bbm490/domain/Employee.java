package tr.edu.hacettepe.bbm490.domain;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
public class Employee{
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String lastname;
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	@Enumerated(EnumType.STRING)
	private EmployeeRank employeeRank;
	@ManyToOne(fetch = FetchType.EAGER)
	private Company company;
	
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
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public EmployeeRank getEmployeeRank() {
		return employeeRank;
	}
	public void setEmployeeRank(EmployeeRank employeeRank) {
		this.employeeRank = employeeRank;
	}
	@XmlTransient
	@JsonIgnore
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastname="
				+ lastname + ", birthDate=" + birthDate + ", employeeRank="
				+ employeeRank + ", company=" + company + "]";
	}

}
