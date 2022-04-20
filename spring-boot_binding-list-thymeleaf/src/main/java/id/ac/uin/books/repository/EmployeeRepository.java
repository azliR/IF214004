package id.ac.uin.books.repository;

import id.ac.uin.books.employee.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository {
    void saveEmployee(Employee employee);
}

