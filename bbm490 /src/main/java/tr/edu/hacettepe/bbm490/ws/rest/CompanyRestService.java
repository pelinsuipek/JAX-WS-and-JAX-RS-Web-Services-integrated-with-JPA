package tr.edu.hacettepe.bbm490.ws.rest;

import java.util.List;

import tr.edu.hacettepe.bbm490.domain.Company;

public interface CompanyRestService {

	List<Company> getAllCompanies();

	Company getCompany(int id);

	void saveCompany(Company company);

}
