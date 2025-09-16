package com.adil.repo;


import org.springframework.data.repository.CrudRepository;
import com.adil.entity.*;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
