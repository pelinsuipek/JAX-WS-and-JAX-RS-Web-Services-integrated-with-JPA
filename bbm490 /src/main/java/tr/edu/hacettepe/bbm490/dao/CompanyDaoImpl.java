package tr.edu.hacettepe.bbm490.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import tr.edu.hacettepe.bbm490.domain.Company;

@Repository("companyDao")
@Transactional
public class CompanyDaoImpl implements CompanyDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public CompanyDaoImpl() {
	}
	
	@Override
	public void save(Company company) {
		entityManager.persist(company);
	}

	@Override
	public Company find(int id) {
		return entityManager.find(Company.class, id);
	}

	@Override
	public List<Company> getAll() {
		return entityManager.createQuery("Select c from Company c", Company.class).getResultList();
	}

}
