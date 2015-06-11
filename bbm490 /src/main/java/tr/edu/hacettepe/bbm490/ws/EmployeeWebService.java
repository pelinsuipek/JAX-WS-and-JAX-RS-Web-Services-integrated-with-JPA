package tr.edu.hacettepe.bbm490.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import tr.edu.hacettepe.bbm490.domain.Employee;

@WebService
public interface EmployeeWebService {
	@WebMethod
	List<Employee> getAllEmployees(int companyId);

	@WebMethod
	Employee getEmployee(int id);
}
