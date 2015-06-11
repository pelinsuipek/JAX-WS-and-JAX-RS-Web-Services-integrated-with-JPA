package tr.edu.hacettepe.bbm490.ws.rest;

import java.util.List;

import tr.edu.hacettepe.bbm490.domain.Employee;

public interface EmployeeRestService {

	List<Employee> getAllEmployees(int companyId);

	Employee getEmployee(int id);

	void saveEmployee(int companyId, Employee employee);
}
