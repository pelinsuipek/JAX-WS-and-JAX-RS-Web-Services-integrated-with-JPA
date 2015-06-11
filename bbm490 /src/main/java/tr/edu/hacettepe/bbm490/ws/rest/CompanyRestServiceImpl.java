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
import tr.edu.hacettepe.bbm490.domain.Company;
import tr.edu.hacettepe.bbm490.ws.rest.CompanyRestService;

@Service("companyRestService")
@Path("/companyService/")
@Produces("application/json")
public class CompanyRestServiceImpl implements CompanyRestService {
	
	@Autowired
	private CompanyDao companyDao;

	@Override
	@GET
	@Path("/company/all")
	public List<Company> getAllCompanies() {
		return companyDao.getAll();
	}

	@Override
	@GET
	@Path("/company/{companyid}")
	public Company getCompany(@PathParam("companyid") int id) {
		return companyDao.find(id);
	}

	@Override
	@POST
	@Path("/company/add")
	@Consumes("application/json")
	public void saveCompany(Company company) {
		companyDao.save(company);
	}

}
