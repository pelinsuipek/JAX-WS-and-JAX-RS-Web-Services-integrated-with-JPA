package tr.edu.hacettepe.bbm490.ws;

import java.util.List;

import javax.jws.WebParam;

import org.springframework.beans.factory.annotation.Autowired;

import tr.edu.hacettepe.bbm490.dao.CompanyDao;
import tr.edu.hacettepe.bbm490.dao.EmployeeDao;
import tr.edu.hacettepe.bbm490.domain.Company;
import tr.edu.hacettepe.bbm490.domain.Employee;

public class EmployeeWebServiceImpl implements EmployeeWebService {
	
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private CompanyDao companyDao;

	@Override
	public List<Employee> getAllEmployees(@WebParam(name = "companyId")int companyId) {
		Company company = companyDao.find(companyId);
		return company.getEmployees();
	}

	@Override
	public Employee getEmployee(@WebParam(name = "id") int id) {
		return employeeDao.find(id);
	}

}
