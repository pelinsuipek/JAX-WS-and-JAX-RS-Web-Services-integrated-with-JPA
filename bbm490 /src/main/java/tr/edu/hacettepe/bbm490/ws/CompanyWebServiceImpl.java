package tr.edu.hacettepe.bbm490.ws;

import java.util.List;

import javax.jws.WebParam;

import org.springframework.beans.factory.annotation.Autowired;

import tr.edu.hacettepe.bbm490.dao.CompanyDao;
import tr.edu.hacettepe.bbm490.domain.Company;

public class CompanyWebServiceImpl implements CompanyWebService {
	
	@Autowired
	private CompanyDao companyDao;

	@Override
	public List<Company> getAllCompanies() {
		return companyDao.getAll();
	}

	@Override
	public Company getCompany(@WebParam(name = "id") int id) {
		return companyDao.find(id);
	}

}
