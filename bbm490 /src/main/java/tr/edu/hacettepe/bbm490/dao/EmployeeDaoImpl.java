package tr.edu.hacettepe.bbm490.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import tr.edu.hacettepe.bbm490.domain.Employee;

@Repository("employeeDao")
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public EmployeeDaoImpl() {
	}

	@Override
	public Employee find(int id) {
		return entityManager.find(Employee.class, id);
	}

	
	@Override
	public void save(Employee employee) {
		entityManager.persist(employee);
	}

}
