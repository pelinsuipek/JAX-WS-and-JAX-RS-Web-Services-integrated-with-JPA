package tr.edu.hacettepe.bbm490.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import tr.edu.hacettepe.bbm490.domain.Company;

@WebService
public interface CompanyWebService {
	
	@WebMethod
	List<Company> getAllCompanies();
	
	@WebMethod
	Company getCompany(int id);
}
