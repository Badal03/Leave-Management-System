package com.example.tmpproject.repository;

import com.example.tmpproject.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DepartmentRepositry extends JpaRepository<Department,Integer>
{
    public Department findById(int depart_id);
    public List<Department> findAllBy();
    public Department deleteById(int depart_id);
}
