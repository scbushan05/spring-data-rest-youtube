package in.bushansirgur.springdatarest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import in.bushansirgur.springdatarest.entity.Employee;

@Repository
@RepositoryRestResource(path = "listemployees")
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	@RestResource(path="name")
	List<Employee> findByName(@Param("name") String name);
}
