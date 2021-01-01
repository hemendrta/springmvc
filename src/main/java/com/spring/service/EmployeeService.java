package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.EmployeeDao;
import com.spring.model.Employee;

/*
Rather than using @component there is annotation that spring has provided to use above services so that bean could be
created and injected.

Since we want the bean container to be creating the object of the this class but it is not a component it is a
service thus we will use spring given annotation which is @Service to identify it as a service.

*/

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public Integer saveEmployee(Employee employee) {

		Integer employeeId = employeeDao.saveEmployee(employee);
		return employeeId;
	}

}
