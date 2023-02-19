package com.happinessindex.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happinessindex.Entity.EmployeeEntity;
import com.happinessindex.Repository.EmployeeRepository;
@Service
public class ServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository emprepo;

	@Override
	public EmployeeEntity saveEmployee(EmployeeEntity emp) {
		return emprepo.save(emp);
		
	}

}
