package tr.edu.hacettepe.bbm490.dao;

import java.util.List;

import tr.edu.hacettepe.bbm490.domain.Company;

public interface CompanyDao {
	void save(Company company);
	Company find(int id);
	List<Company> getAll();
}
