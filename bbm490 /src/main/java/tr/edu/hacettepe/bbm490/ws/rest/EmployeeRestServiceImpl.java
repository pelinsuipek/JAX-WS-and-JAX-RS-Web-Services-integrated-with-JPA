package tr.edu.hacettepe.bbm490.ws.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.edu.hacettepe.bbm490.dao.CompanyDao;
import tr.edu.hacettepe.bbm490.dao.EmployeeDao;
import tr.edu.hacettepe.bbm490.domain.Company;
import tr.edu.hacettepe.bbm490.domain.Employee;

@Service("employeeRestService")
@Path("/employeeService")
@Produces("application/json")
public class EmployeeRestServiceImpl implements EmployeeRestService {
	
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private CompanyDao companyDao;

	@Override
	@GET
	@Path("/employee/all/{companyid}")
	public List<Employee> getAllEmployees(@PathParam("companyid") int companyId) {
		return companyDao.find(companyId).getEmployees();
	}

	@Override
	@GET
	@Path("/employee/{employeeid}")
	public Employee getEmployee(@PathParam("employeeid") int id) {
		return employeeDao.find(id);
	}

	@Override
	@POST
	@Path("/employee/add/{companyid}")
	@Consumes("application/json")
	public void saveEmployee(@PathParam("companyid") int companyId, Employee employee) {
		Company company = companyDao.find(companyId);
		employee.setCompany(company);
		employeeDao.save(employee);
		
	}

}
