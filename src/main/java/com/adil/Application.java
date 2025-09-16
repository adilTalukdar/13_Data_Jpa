package com.adil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.adil.entity.Employee;
import com.adil.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmployeeRepository empRepo = context.getBean(EmployeeRepository.class);

		System.out.println("Impl class :: " + empRepo.getClass().getName());

		Employee e = new Employee();
		e.setEmpId(102);
		e.setEmpName("keshav");
		e.setEmpSalary(200.00);

		empRepo.save(e);
		
	}

}


//git add .
//git commit -m "your message"
//git push