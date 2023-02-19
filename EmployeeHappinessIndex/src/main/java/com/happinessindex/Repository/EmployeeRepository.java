package com.happinessindex.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.happinessindex.Entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
