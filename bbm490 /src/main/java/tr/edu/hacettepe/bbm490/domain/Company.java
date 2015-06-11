package tr.edu.hacettepe.bbm490.domain;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company{

	@Id
	@GeneratedValue
	private int id;
	private String name;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "company")
	private List<Employee> employees;
	
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
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", employees="
				+ employees + "]";
	}
}
