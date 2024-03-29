package com.example.tmpproject.repository;

import com.example.tmpproject.model.Department;
import com.example.tmpproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepositry extends JpaRepository<Employee,Integer>
{
    public Employee findById(int emp_id);
    public List<Employee> findAllBy();
    public Employee deleteById(int emp_id);
    public List<Employee> findByDepartment(Department department);
    public Employee findByEmailIdAndPassword(String emailid,String password);
    public Employee findByEmailId(String emailid);
    @Query(value = " select count(*) from employee where dept_id=:dept_id",nativeQuery = true)
    public long countByDepartment(int dept_id);
    @Query(value = " select count(*) from employee where ur_id=:ur_id",nativeQuery = true)
    public long countByUserRole(int ur_id);

}
