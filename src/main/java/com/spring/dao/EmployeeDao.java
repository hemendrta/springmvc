package com.spring.dao;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.model.Employee;

/*
Rather than using @component there is annotation that spring has provided to use above dao so that bean could be
created and injected.

Since we want the bean container to be creating the object of the this class but it is not a component it is a
dao thus we will use spring given annotation which is @Repository to identify it as a dao.

*/

@Repository
public class EmployeeDao {

	
	/* @autowire will ensure that the object is injected over here */
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	/*
	 * inserting the data to the database, since the changes are done in the
	 * database thus we require annotation @transactional for this one.
	 */
	
	@Transactional
	public Integer saveEmployee(Employee employee) {

		Integer employeeId = (Integer) this.hibernateTemplate.save(employee);

		return employeeId;

	}

}
