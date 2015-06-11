package tr.edu.hacettepe.bbm490.dao;

import tr.edu.hacettepe.bbm490.domain.Employee;

public interface EmployeeDao {
	Employee find(int id);
	void save(Employee employee);
}
